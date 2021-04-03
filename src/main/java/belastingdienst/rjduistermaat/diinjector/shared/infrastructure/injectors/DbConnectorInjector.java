package belastingdienst.rjduistermaat.diinjector.shared.infrastructure.injectors;

import belastingdienst.rjduistermaat.diinjector.shared.infrastructure.mysql.DbConnector;

public interface DbConnectorInjector {
    default DbConnector getDbConnector() {
        return new DbConnector();
    }
}
