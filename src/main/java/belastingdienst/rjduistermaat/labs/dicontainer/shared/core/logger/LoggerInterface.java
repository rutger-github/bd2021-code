package belastingdienst.rjduistermaat.labs.dicontainer.shared.core.logger;

import belastingdienst.rjduistermaat.labs.dicontainer.shared.infrastructure.logger.LoggerAdapter;

public interface LoggerInterface {
    void warn(String message);

    LoggerAdapter getLogger(String name);
}
