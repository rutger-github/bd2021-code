package belastingdienst.rjduistermaat.diinjector.shared.core.logger;

import belastingdienst.rjduistermaat.diinjector.shared.infrastructure.logger.LoggerAdapter;

public interface LoggerInterface {
    void warn(String message);

    LoggerAdapter getLogger(String name);
}
