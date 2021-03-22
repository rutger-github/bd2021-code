package belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2;

public class Application {

    public static void main(String[] args) {

//        String bankAccountRutger = "12345";
//        String bankAccountPiet = "11111";
//
//
//        BankAccountRepositoryInterface bankAccountRepository = new BankAccountRepository();
//        bankAccountRepository.createAccount(bankAccountRutger, BigDecimal.valueOf(0), BigDecimal.valueOf(1.2));
//        bankAccountRepository.createAccount(bankAccountPiet, BigDecimal.valueOf(100), BigDecimal.valueOf(1.3));
//
//
//        BankingService bankingService = new BankingService(bankAccountRepository);
//
//
//        bankingService.deposit(
//                new BankDepositCommand(
//                        bankAccountRutger, BigDecimal.valueOf(1000L)
//                )
//        );
//
//        bankingService.deposit(
//                new BankDepositCommand(
//                        bankAccountPiet, BigDecimal.valueOf(100L)
//                )
//        );
//
//        try {
//            bankingService.transfer(
//                    new BankTransferCommand(
//                            bankAccountPiet,
//                            bankAccountRutger,
//                            BigDecimal.valueOf(5.01)
//                    )
//            );
//        } catch (InsufficientBalanceException | InvalidAmountToTransferException e) {
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Something went wrong");
//        }
//
//
//        System.out.println(bankingService.getBalance(bankAccountRutger));
//        System.out.println(bankingService.getBalance(bankAccountPiet));
//
//        try {
//            bankingService.transfer(
//                    new BankTransferCommand(
//                            bankAccountPiet,
//                            bankAccountRutger,
//                            BigDecimal.valueOf(10005.01)
//                    )
//            );
//        } catch (InsufficientBalanceException | InvalidAmountToTransferException e) {
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Something went wrong");
//        }
//
//
//        System.out.println(bankingService.getBalance(bankAccountRutger));
//        System.out.println(bankingService.getBalance(bankAccountPiet));
//
//        try {
//            bankingService.withdraw(new BankWithdrawCommand(bankAccountRutger, BigDecimal.valueOf(50)));
//        } catch (InsufficientBalanceException | InvalidAmountToTransferException e) {
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println(bankingService.getBalance(bankAccountRutger));
//        System.out.println(bankingService.getBalance(bankAccountPiet));
    }
}
