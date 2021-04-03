package belastingdienst.rjduistermaat.diinjector.shared.infrastructure.injectors;

import belastingdienst.rjduistermaat.diinjector.shared.core.logger.LoggerInterface;
import belastingdienst.rjduistermaat.diinjector.shared.infrastructure.logger.LoggerAdapter;

public interface LoggerInjector {
    default LoggerInterface getLogger() {
        return new LoggerAdapter();
    }
}
