package belastingdienst.rjduistermaat.diinjector.shared.infrastructure.logger;

import belastingdienst.rjduistermaat.diinjector.shared.core.logger.LoggerInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerAdapter implements LoggerInterface {
    private Logger logger;
    private static String DEFAULT_LOGGER = "Application";

    private LoggerAdapter(Logger logger) {
        this.logger = logger;
    }

    public LoggerAdapter() {
        this.logger = LoggerFactory.getLogger(DEFAULT_LOGGER);
    }

    public LoggerAdapter getLogger(String name) {
        return new LoggerAdapter(LoggerFactory.getLogger(name));
    }

    @Override
    public void warn(String message) {
        this.logger.warn(message);
    }
}
