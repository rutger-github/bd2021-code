package belastingdienst.rjduistermaat.diinjector.shared.core.contacts;

import belastingdienst.rjduistermaat.diinjector.shared.core.logger.LoggerInterface;
import belastingdienst.rjduistermaat.diinjector.shared.infrastructure.injectors.LoggerInjector;

public class ContactService implements LoggerInjector {
    private LoggerInterface logger;

    public ContactService() {
        this.logger = getLogger();
    }

    public ContactService(LoggerInterface logger) {
        this.logger = logger;
    }

    public void call() {
        this.logger.warn("test call");
    }
}
