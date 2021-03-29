package belastingdienst.rjduistermaat.labs.dicontainer.shared.infrastructure.logger;

import belastingdienst.rjduistermaat.labs.dicontainer.shared.core.logger.LoggerInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerAdapter implements LoggerInterface {
    private Logger logger;

    private LoggerAdapter(Logger logger) {
        this.logger = logger;
    }

    public LoggerAdapter() {
        this.logger = LoggerFactory.getLogger("Application");
    }

    public LoggerAdapter getLogger(String name) {
        return new LoggerAdapter(LoggerFactory.getLogger(name));
    }

    @Override
    public void warn(String message) {
        this.logger.warn(message);
    }
}
