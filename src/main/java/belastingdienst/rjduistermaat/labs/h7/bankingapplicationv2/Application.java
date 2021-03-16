package belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2;

import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.BankAccountRepositoryInterface;
import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.BankingService;
import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.commands.BankDepositCommand;
import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.commands.BankTransferCommand;
import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.commands.BankWithdrawCommand;
import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.exceptions.InsufficientBalanceException;
import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.exceptions.InvalidAmountToTransferException;
import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.infrastructure.memory.BankAccountRepository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        String bankAccountRutger = "12345";
        String bankAccountPiet = "11111";

        Map<String, BigDecimal> bankAccounts = new HashMap<>();
        bankAccounts.put(bankAccountRutger, BigDecimal.valueOf(0));
        bankAccounts.put(bankAccountPiet, BigDecimal.valueOf(0));

        BankAccountRepositoryInterface bankAccountRepository = new BankAccountRepository(
                bankAccounts
        );

        BankingService bankingService = new BankingService(bankAccountRepository);


        bankingService.deposit(
                new BankDepositCommand(
                        bankAccountRutger, BigDecimal.valueOf(1000L)
                )
        );

        bankingService.deposit(
                new BankDepositCommand(
                        bankAccountPiet, BigDecimal.valueOf(100L)
                )
        );

        try {
            bankingService.transfer(
                    new BankTransferCommand(
                            bankAccountPiet,
                            bankAccountRutger,
                            BigDecimal.valueOf(5.01)
                    )
            );
        } catch (InsufficientBalanceException | InvalidAmountToTransferException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }


        System.out.println(bankingService.getBalance(bankAccountRutger));
        System.out.println(bankingService.getBalance(bankAccountPiet));

        try {
            bankingService.transfer(
                    new BankTransferCommand(
                            bankAccountPiet,
                            bankAccountRutger,
                            BigDecimal.valueOf(10005.01)
                    )
            );
        } catch (InsufficientBalanceException | InvalidAmountToTransferException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }


        System.out.println(bankingService.getBalance(bankAccountRutger));
        System.out.println(bankingService.getBalance(bankAccountPiet));

        try {
            bankingService.withdraw(new BankWithdrawCommand(bankAccountRutger, BigDecimal.valueOf(50)));
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(bankingService.getBalance(bankAccountRutger));
        System.out.println(bankingService.getBalance(bankAccountPiet));
    }
}
