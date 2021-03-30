package belastingdienst.rjduistermaat.dicontainer.bank.infrastructure.container;

import belastingdienst.rjduistermaat.dicontainer.bank.infrastructure.memory.TransferMoneyRepository;
import belastingdienst.rjduistermaat.dicontainer.shared.core.logger.LoggerInterface;
import belastingdienst.rjduistermaat.dicontainer.bank.core.TransferMoneyRepositoryInterface;
import belastingdienst.rjduistermaat.dicontainer.bank.core.TransferMoneyService;
import belastingdienst.rjduistermaat.dicontainer.shared.core.container.Container;
import belastingdienst.rjduistermaat.dicontainer.shared.core.container.ServiceProviderInterface;

public class ServiceProviderBank implements ServiceProviderInterface {

    public void register(Container container) {

        container.putContainerObject(TransferMoneyRepositoryInterface.class.getName(), () -> {
            return new TransferMoneyRepository();
        });

        container.putContainerObject(TransferMoneyService.class.getName(), () -> {
            return new TransferMoneyService(
                    container.getContainerObject(TransferMoneyRepositoryInterface.class),
                    container.getContainerObject(LoggerInterface.class).getLogger("Banking Module")
            );
        });
    }

}
