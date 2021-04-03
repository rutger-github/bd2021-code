package belastingdienst.rjduistermaat.diinjector.bank.infrastructure.mysql;

import belastingdienst.rjduistermaat.diinjector.bank.core.BankManagerInterface;
import belastingdienst.rjduistermaat.diinjector.shared.core.mysql.DbConnectorInterface;
import belastingdienst.rjduistermaat.diinjector.shared.infrastructure.injectors.DbConnectorInjector;

public class BankManager implements BankManagerInterface, DbConnectorInjector {
    private final DbConnectorInterface dbConnector = getDbConnector();

    @Override
    public void getAccounts() {
        this.dbConnector.query();
        System.out.println("Hier zijn de accounts van de mysql BankManager.");
    }
}
