package belastingdienst.rjduistermaat.labs.dicontainer.bank.infrastructure.memory;


import belastingdienst.rjduistermaat.labs.dicontainer.bank.core.TransferMoneyRepositoryInterface;

public class TransferMoneyRepository implements TransferMoneyRepositoryInterface {

    @Override
    public void transfer() {
        System.out.println("transfer money");
    }
}
