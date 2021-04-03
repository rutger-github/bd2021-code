package belastingdienst.rjduistermaat.diinjector.bank.core;

import belastingdienst.rjduistermaat.diinjector.bank.infrastructure.injectors.BankManagerInjector;
import belastingdienst.rjduistermaat.diinjector.shared.core.logger.LoggerInterface;
import belastingdienst.rjduistermaat.diinjector.shared.infrastructure.injectors.LoggerInjector;

public class Bank implements BankManagerInjector, LoggerInjector {
    private final BankManagerInterface bankManager = getBankManager();
    private final LoggerInterface logger = getLogger().getLogger(this.getClass().getName());

    public void manageBank() {
        this.bankManager.getAccounts();
        this.logger.warn("getting accounts");
    }
}
