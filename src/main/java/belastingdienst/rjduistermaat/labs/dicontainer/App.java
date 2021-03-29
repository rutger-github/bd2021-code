package belastingdienst.rjduistermaat.labs.dicontainer;

import belastingdienst.rjduistermaat.labs.dicontainer.bank.core.BankTransferCommand;
import belastingdienst.rjduistermaat.labs.dicontainer.bank.core.TransferMoneyService;
import belastingdienst.rjduistermaat.labs.dicontainer.shared.core.contacts.ContactService;
import belastingdienst.rjduistermaat.labs.dicontainer.shared.core.container.Container;
import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.exceptions.InsufficientBalanceException;
import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.exceptions.InvalidAmountToTransferException;

import java.math.BigDecimal;

public class App {


    public static void main(String[] args) {

        var testcontainerinstance = Container.getInstance();
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

        TransferMoneyService transferMoneyService2 = (TransferMoneyService) testcontainerinstance.getContainerObject(TransferMoneyService.class.getName());
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

        ContactService contactService = (ContactService) testcontainerinstance.getContainerObject(ContactService.class.getName());
        contactService.call();

    }


}