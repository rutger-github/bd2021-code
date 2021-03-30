package belastingdienst.rjduistermaat.dicontainer.bank.infrastructure.memory;


import belastingdienst.rjduistermaat.dicontainer.bank.core.TransferMoneyRepositoryInterface;

public class TransferMoneyRepository implements TransferMoneyRepositoryInterface {

    @Override
    public void transfer() {
        System.out.println("transfer money");
    }
}
