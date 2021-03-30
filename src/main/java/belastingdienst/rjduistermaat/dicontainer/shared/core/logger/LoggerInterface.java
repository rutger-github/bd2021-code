package belastingdienst.rjduistermaat.dicontainer.shared.core.logger;

import belastingdienst.rjduistermaat.dicontainer.shared.infrastructure.logger.LoggerAdapter;

public interface LoggerInterface {
    void warn(String message);

    LoggerAdapter getLogger(String name);
}
