package belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core;


import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.commands.BankDepositCommand;
import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.commands.BankTransferCommand;
import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.commands.BankWithdrawCommand;
import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.commands.GetBalanceCommand;
import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.exceptions.InsufficientBalanceException;
import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.exceptions.InvalidAmountToTransferException;
import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.infrastructure.memory.BankAccountRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BankingServiceTest {

    private final static String BANKACCOUNT_CLIENT1 = "NL123";
    private final static String BANKACCOUNT_CLIENT2 = "BE125";
    private BankingService bankingService;
    private BankAccountRepository bankAccountRepository;

    @BeforeEach
    public void setUp() throws Exception {

        this.bankAccountRepository = new BankAccountRepository();

        bankAccountRepository.createAccount(BANKACCOUNT_CLIENT1, BigDecimal.valueOf(100), BigDecimal.valueOf(1.2));
        bankAccountRepository.createAccount(BANKACCOUNT_CLIENT2, BigDecimal.valueOf(100), BigDecimal.valueOf(1.2));


        this.bankingService = new BankingService(bankAccountRepository);
    }

    @ParameterizedTest(name = "#{index} - givenBankAccountNumbers, WhenTransferAmount {2} From {0} To {1}, ThenExpectedEndBalancesO: {3} ")
    @MethodSource("transferDataProvider")
    public void transfer(
            String fromBankAccountNumber,
            String toBankAccountNumber,
            BigDecimal amountToTransfer,
            BigDecimal[] expectedBalances
    ) {
        try {
            this.bankingService.transfer(
                    new BankTransferCommand(
                            fromBankAccountNumber,
                            toBankAccountNumber,
                            amountToTransfer
                    )
            );
        } catch (InsufficientBalanceException e) {
            // transfer canceled, balances should remain the same
        } catch (InvalidAmountToTransferException e) {
            // transfer canceled, balances should remain the same
        }

        Assertions.assertEquals(expectedBalances[0], this.bankAccountRepository.getBalance(fromBankAccountNumber));
        Assertions.assertEquals(expectedBalances[1], this.bankAccountRepository.getBalance(toBankAccountNumber));
    }

    @ParameterizedTest(name = "#{index} - givenBankAccountNumber {0}, WhenWithdrawAmount {1}, ThenExpectedEndBalance {2} ")
    @MethodSource("withdrawDataProvider")
    public void withdraw(String bankAccountNumber, BigDecimal amountToWithdraw, BigDecimal expectedBalance) {

        try {
            this.bankingService.withdraw(
                    new BankWithdrawCommand(
                            bankAccountNumber,
                            amountToWithdraw
                    )
            );
        } catch (InsufficientBalanceException | InvalidAmountToTransferException e) {
            // if this exception is thrown, balance should rename the same
        }

        Assertions.assertEquals(expectedBalance, this.bankAccountRepository.getBalance(bankAccountNumber));


    }

    @ParameterizedTest(name = "#{index} - givenBankAccountNumber {0}, WhenDepositAmount {1}, ThenExpectedEndBalance {2} ")
    @MethodSource("depositDataProvider")
    public void deposit(String bankAccountNumber, BigDecimal amountToDeposit, BigDecimal expectedBalance) {
        this.bankingService.deposit(
                new BankDepositCommand(
                        bankAccountNumber, amountToDeposit
                )
        );

        Assertions.assertEquals(expectedBalance, this.bankAccountRepository.getBalance(bankAccountNumber));

    }

    @Test
    public void getBalance() {
        var balance = this.bankingService.getBalance(new GetBalanceCommand(BANKACCOUNT_CLIENT1));
        Assertions.assertEquals(BigDecimal.valueOf(100), balance);
    }

    private static Stream<Arguments> depositDataProvider() {
        return Stream.of(
                arguments(BANKACCOUNT_CLIENT1, BigDecimal.valueOf(20), BigDecimal.valueOf(120)),
                arguments(BANKACCOUNT_CLIENT2, BigDecimal.valueOf(50.25), BigDecimal.valueOf(150.25)),
                arguments(BANKACCOUNT_CLIENT2, BigDecimal.valueOf(0), BigDecimal.valueOf(100))
        );
    }

    private static Stream<Arguments> withdrawDataProvider() {
        return Stream.of(
                arguments(BANKACCOUNT_CLIENT1, BigDecimal.valueOf(20), BigDecimal.valueOf(80)),
                arguments(BANKACCOUNT_CLIENT2, BigDecimal.valueOf(50.25), BigDecimal.valueOf(49.75)),
                arguments(BANKACCOUNT_CLIENT2, BigDecimal.valueOf(0), BigDecimal.valueOf(100)),
                arguments(BANKACCOUNT_CLIENT2, BigDecimal.valueOf(1000), BigDecimal.valueOf(100)),
                arguments(BANKACCOUNT_CLIENT2, BigDecimal.valueOf(-100), BigDecimal.valueOf(100))
        );
    }


    private static Stream<Arguments> transferDataProvider() {

        return Stream.of(
                arguments(BANKACCOUNT_CLIENT1, BANKACCOUNT_CLIENT2, BigDecimal.valueOf(20), new BigDecimal[]{BigDecimal.valueOf(80), BigDecimal.valueOf(120)}),
                arguments(BANKACCOUNT_CLIENT1, BANKACCOUNT_CLIENT2, BigDecimal.valueOf(20.25), new BigDecimal[]{BigDecimal.valueOf(79.75), BigDecimal.valueOf(120.25)}),
                arguments(BANKACCOUNT_CLIENT2, BANKACCOUNT_CLIENT1, BigDecimal.valueOf(1000.25), new BigDecimal[]{BigDecimal.valueOf(100), BigDecimal.valueOf(100)}),
                arguments(BANKACCOUNT_CLIENT2, BANKACCOUNT_CLIENT1, BigDecimal.valueOf(-20.25), new BigDecimal[]{BigDecimal.valueOf(100), BigDecimal.valueOf(100)})
        );
    }
}