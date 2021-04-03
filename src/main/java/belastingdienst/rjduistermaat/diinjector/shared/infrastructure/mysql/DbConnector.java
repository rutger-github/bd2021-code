package belastingdienst.rjduistermaat.diinjector.shared.infrastructure.mysql;

import belastingdienst.rjduistermaat.diinjector.shared.core.mysql.DbConnectorInterface;

public class DbConnector implements DbConnectorInterface {

    public void query() {
        System.out.println("query run");
    }
}
