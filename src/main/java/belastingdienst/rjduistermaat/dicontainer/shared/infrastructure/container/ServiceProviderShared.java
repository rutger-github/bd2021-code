package belastingdienst.rjduistermaat.dicontainer.shared.infrastructure.container;

import belastingdienst.rjduistermaat.dicontainer.shared.core.logger.LoggerInterface;
import belastingdienst.rjduistermaat.dicontainer.shared.core.contacts.ContactService;
import belastingdienst.rjduistermaat.dicontainer.shared.core.container.Container;
import belastingdienst.rjduistermaat.dicontainer.shared.core.container.ServiceProviderInterface;
import belastingdienst.rjduistermaat.dicontainer.shared.infrastructure.logger.LoggerAdapter;

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

        container.putContainerObject("VarShared", () -> {
            return "Application shared constant";
        });
    }
}
