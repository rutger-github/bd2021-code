package belastingdienst.rjduistermaat.labs.dicontainer.shared.core.contacts;

import belastingdienst.rjduistermaat.labs.dicontainer.shared.core.logger.LoggerInterface;

public class ContactService {
    private LoggerInterface logger;

    public ContactService(LoggerInterface logger) {
        this.logger = logger;
    }

    public void call() {
        this.logger.warn("test call");
    }
}
