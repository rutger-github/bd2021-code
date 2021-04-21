package belastingdienst.rjduistermaat.jpa.logger;

public interface LoggerInterface {
    void warn(String message);

    LoggerAdapter getLogger(String name);
}
