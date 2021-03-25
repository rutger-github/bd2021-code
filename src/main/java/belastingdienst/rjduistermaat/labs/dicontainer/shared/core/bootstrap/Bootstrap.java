package belastingdienst.rjduistermaat.labs.dicontainer.shared.core.bootstrap;

import belastingdienst.rjduistermaat.labs.dicontainer.bank.core.TransferMoneyRepositoryInterface;
import belastingdienst.rjduistermaat.labs.dicontainer.bank.core.TransferMoneyService;
import belastingdienst.rjduistermaat.labs.dicontainer.bank.infrastructure.memory.TransferMoneyRepository;

public class Bootstrap {
    private Container container;

    public void start() {
        this.container = new Container();


        var transferMoneyRepository = new TransferMoneyRepository();
        var transferMoneyService = new TransferMoneyService(transferMoneyRepository);

        this.container.register(TransferMoneyRepositoryInterface.class.getName(), transferMoneyRepository);
        this.container.register(TransferMoneyService.class.getName(), transferMoneyService);
    }

    public Container getContainer() {
        return this.container;
    }
}
