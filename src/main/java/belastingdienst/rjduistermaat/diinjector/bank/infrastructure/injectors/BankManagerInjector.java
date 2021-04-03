package belastingdienst.rjduistermaat.diinjector.bank.infrastructure.injectors;


import belastingdienst.rjduistermaat.diinjector.bank.infrastructure.mysql.BankManager;

public interface BankManagerInjector {
    default BankManager getBankManager() {
        return new BankManager();
    }
}
