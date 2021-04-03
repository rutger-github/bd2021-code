package belastingdienst.rjduistermaat.diinjector;

import belastingdienst.rjduistermaat.diinjector.bank.core.Bank;

public class App {


    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.manageBank();

//        Container testcontainerinstance = Container.getInstance();
//
//        Bank bank = testcontainerinstance.getContainerObject(Bank.class);
//        bank.manageBank();

//
//        TransferMoneyService transferMoneyService = testcontainerinstance.getContainerObject(TransferMoneyService.class);
//
//        transferMoneyService.transfer(
//                new BankTransferCommand(
//                        "", "", BigDecimal.valueOf(1)
//                )
//        );


//        TransferMoneyService transferMoneyService2 = testcontainerinstance.getContainerObject(TransferMoneyService.class);
//        try {
//            transferMoneyService2.transfer(
//                    new BankTransferCommand(
//                            "", "", BigDecimal.valueOf(1)
//                    )
//            );
//        } catch (InsufficientBalanceException e) {
//            e.printStackTrace();
//        } catch (InvalidAmountToTransferException e) {
//            e.printStackTrace();
//        }
//
//        ContactService contactService = testcontainerinstance.getContainerObject(ContactService.class);
//        contactService.call();
//
//        var testVar = testcontainerinstance.getContainerObject("VarShared");
//        System.out.println(testVar);
//
//        testcontainerinstance.overwriteContainerObject("VarShared", () -> "hallo");
//        var testVar2 = testcontainerinstance.getContainerObject("VarShared");
//        System.out.println(testVar2);
//
//        testcontainerinstance.overwriteContainerObject("VarShared", () -> 1);
//        var testVar3 = testcontainerinstance.getContainerObject("VarShared");
//        System.out.println(testVar3);
    }


}
