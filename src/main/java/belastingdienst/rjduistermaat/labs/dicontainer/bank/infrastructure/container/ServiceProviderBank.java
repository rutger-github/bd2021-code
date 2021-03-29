package belastingdienst.rjduistermaat.labs.dicontainer.bank.infrastructure.container;

import belastingdienst.rjduistermaat.labs.dicontainer.bank.core.TransferMoneyRepositoryInterface;
import belastingdienst.rjduistermaat.labs.dicontainer.bank.core.TransferMoneyService;
import belastingdienst.rjduistermaat.labs.dicontainer.bank.infrastructure.memory.TransferMoneyRepository;
import belastingdienst.rjduistermaat.labs.dicontainer.shared.core.container.Container;
import belastingdienst.rjduistermaat.labs.dicontainer.shared.core.container.ServiceProviderInterface;
import belastingdienst.rjduistermaat.labs.dicontainer.shared.core.logger.LoggerInterface;

public class ServiceProviderBank implements ServiceProviderInterface {

    public void register(Container container) {

        container.putContainerObject(TransferMoneyRepositoryInterface.class.getName(), () -> {
            return new TransferMoneyRepository();
        });

        container.putContainerObject(TransferMoneyService.class.getName(), () -> {
            var logger = (LoggerInterface) container.getContainerObject(LoggerInterface.class.getName());

            return new TransferMoneyService(
                    (TransferMoneyRepositoryInterface) container.getContainerObject(TransferMoneyRepositoryInterface.class.getName()),
                    logger.getLogger("Banking Module")
            );
        });
    }

}
