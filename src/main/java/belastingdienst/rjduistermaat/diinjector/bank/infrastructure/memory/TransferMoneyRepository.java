package belastingdienst.rjduistermaat.diinjector.bank.infrastructure.memory;


import belastingdienst.rjduistermaat.diinjector.bank.core.TransferMoneyRepositoryInterface;

public class TransferMoneyRepository implements TransferMoneyRepositoryInterface {

    @Override
    public void transfer() {
        System.out.println("transfer money");
    }
}
