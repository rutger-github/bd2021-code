package belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.infrastructure.memory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BankAccountRepositoryTest {
    private BankAccountRepository bankAccountRepository;
    private String bankAccountClient1;
    private String bankAccountClient2;

    @BeforeEach
    public void setUp() throws Exception {
        this.bankAccountRepository = new BankAccountRepository();

        this.bankAccountClient1 = "NL123";
        this.bankAccountClient2 = "BE125";

        this.bankAccountRepository.createAccount(bankAccountClient1, BigDecimal.valueOf(100), BigDecimal.valueOf(1.2));
        this.bankAccountRepository.createAccount(bankAccountClient2, BigDecimal.valueOf(100), BigDecimal.valueOf(1.2));
    }

    @Test
    public void whenTransferAmountFromToBankAccountThenCorrectBalance() {
        this.bankAccountRepository.transfer(this.bankAccountClient1, this.bankAccountClient2, BigDecimal.valueOf(50));
        var balanceClient1 = this.bankAccountRepository.getBalance(this.bankAccountClient1);
        var balanceClient2 = this.bankAccountRepository.getBalance(this.bankAccountClient2);


        Assertions.assertEquals(BigDecimal.valueOf(50), balanceClient1);
        Assertions.assertEquals(BigDecimal.valueOf(150), balanceClient2);
    }

    @ParameterizedTest(name = "#{index} - Test with bankAccountNumber {0}, withdrawAmount {1}, expectedEndBalance {2} ")
    @MethodSource("withdrawDataProvider")
    public void whenWithdrawAmountFromBankAccountThenCorrectBalance(String bankAccountNumber, float withdrawAmount, float expectedEndBalance) {
        this.bankAccountRepository.withdraw(bankAccountNumber, BigDecimal.valueOf(withdrawAmount));
        var balanceClient1 = this.bankAccountRepository.getBalance(bankAccountNumber);

        Assertions.assertEquals(BigDecimal.valueOf(expectedEndBalance), balanceClient1);
    }

    @Test
    public void whenDepositAmountFromBankAccountThenCorrectBalance() {
        this.bankAccountRepository.deposit(this.bankAccountClient1, BigDecimal.valueOf(20));
        var balanceClient1 = this.bankAccountRepository.getBalance(this.bankAccountClient1);

        Assertions.assertEquals(BigDecimal.valueOf(120), balanceClient1);
    }

    private static Stream<Arguments> withdrawDataProvider() {
        return Stream.of(
                arguments("NL123", 20, 80),
                arguments("BE125", 50.5f, 49.5f)
        );
    }
}