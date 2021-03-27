package belastingdienst.rjduistermaat.labs.dicontainer;

import belastingdienst.rjduistermaat.labs.dicontainer.bank.OutsideTest;
import belastingdienst.rjduistermaat.labs.dicontainer.bank.core.BankTransferCommand;
import belastingdienst.rjduistermaat.labs.dicontainer.bank.core.TestContainer;
import belastingdienst.rjduistermaat.labs.dicontainer.bank.core.TransferMoneyService;
import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.exceptions.InsufficientBalanceException;
import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.exceptions.InvalidAmountToTransferException;

import java.math.BigDecimal;

public class App {


    public static void main(String[] args) {

        var testcontainerinstance = TestContainer.getInstance();
        TransferMoneyService transferMoneyService = (TransferMoneyService) testcontainerinstance.getContainerObject(TransferMoneyService.class.getName());
        try {
            transferMoneyService.transfer(
                    new BankTransferCommand(
                            "", "", BigDecimal.valueOf(1)
                    )
            );
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        } catch (InvalidAmountToTransferException e) {
            e.printStackTrace();
        }

        var testContainer = TestContainer.getInstance();
        TransferMoneyService transferMoneyService2 = (TransferMoneyService) testContainer.getContainerObject(TransferMoneyService.class.getName());
        try {
            transferMoneyService2.transfer(
                    new BankTransferCommand(
                            "", "", BigDecimal.valueOf(1)
                    )
            );
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        } catch (InvalidAmountToTransferException e) {
            e.printStackTrace();
        }

        var outsideTest = new OutsideTest();
        outsideTest.outside();


//        var test = new TestContainer();
//        test.serviceprovider();
//
//        TransferMoneyService transferMoneyService = (TransferMoneyService) test.getContainerObject(TransferMoneyService.class.getName());
//        try {
//            transferMoneyService.transfer(
//                    new BankTransferCommand(
//                            "", "", BigDecimal.valueOf(1)
//                    )
//            );
//        } catch (InsufficientBalanceException e) {
//            e.printStackTrace();
//        } catch (InvalidAmountToTransferException e) {
//            e.printStackTrace();
//        }

//        var container = Container.getInstance();
//        var transferMoneyService = (TransferMoneyService) container.getContainers().get(TransferMoneyService.class.getName());
//
//        try {
//            transferMoneyService.transfer(new BankTransferCommand("test", "test2", BigDecimal.valueOf(1)));
//        } catch (InsufficientBalanceException e) {
//            e.printStackTrace();
//        } catch (InvalidAmountToTransferException e) {
//            e.printStackTrace();
//        }

    }


}
