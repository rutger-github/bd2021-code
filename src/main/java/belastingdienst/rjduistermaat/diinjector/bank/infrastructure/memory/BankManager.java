package belastingdienst.rjduistermaat.diinjector.bank.infrastructure.memory;

import belastingdienst.rjduistermaat.diinjector.bank.core.BankManagerInterface;

public class BankManager implements BankManagerInterface {


    @Override
    public void getAccounts() {
        System.out.println("Hier zijn de accounts van de memory BankManager.");
    }
}
