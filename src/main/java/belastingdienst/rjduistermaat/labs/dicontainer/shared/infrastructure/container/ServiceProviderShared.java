package belastingdienst.rjduistermaat.labs.dicontainer.shared.infrastructure.container;

import belastingdienst.rjduistermaat.labs.dicontainer.shared.core.contacts.ContactService;
import belastingdienst.rjduistermaat.labs.dicontainer.shared.core.container.Container;
import belastingdienst.rjduistermaat.labs.dicontainer.shared.core.container.ServiceProviderInterface;
import belastingdienst.rjduistermaat.labs.dicontainer.shared.core.logger.LoggerInterface;
import belastingdienst.rjduistermaat.labs.dicontainer.shared.infrastructure.logger.LoggerAdapter;

public class ServiceProviderShared implements ServiceProviderInterface {
    @Override
    public void register(Container container) {
        container.putContainerObject(LoggerInterface.class.getName(), () -> {
            return new LoggerAdapter();
        });

        container.putContainerObject(ContactService.class.getName(), () -> {
            return new ContactService(
                    container.getContainerObject(LoggerInterface.class)
            );
        });
    }
}
