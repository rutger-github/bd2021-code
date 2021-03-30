package belastingdienst.rjduistermaat.dicontainer.shared.core.contacts;

import belastingdienst.rjduistermaat.dicontainer.shared.core.logger.LoggerInterface;

public class ContactService {
    private LoggerInterface logger;

    public ContactService(LoggerInterface logger) {
        this.logger = logger;
    }

    public void call() {
        this.logger.warn("test call");
    }
}
