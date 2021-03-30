package belastingdienst.rjduistermaat.labs.dicontainer.shared.core.container;

import belastingdienst.rjduistermaat.labs.dicontainer.bank.infrastructure.container.ServiceProviderBank;
import belastingdienst.rjduistermaat.labs.dicontainer.shared.infrastructure.container.ServiceProviderShared;
import com.sun.jdi.ClassObjectReference;

import java.util.HashMap;


public class Container {
    public static Container instance;

    private HashMap<Object, ContainerObject> container = new HashMap<>();

    public static Container getInstance() {
        if (Container.instance != null) {
            return Container.instance;
        }

        var container = new Container();

        container.registerContainer(new ServiceProviderBank());
        container.registerContainer(new ServiceProviderShared());

        Container.instance = container;

        return Container.instance;
    }

    public <R> R getContainerObject(Class<R> containerClass) {
        String containerName = containerClass.getName();

        if (this.container.containsKey(containerName) == false) {
            throw new RuntimeException("unknown container");
        }

        ContainerObject containerObject = container.get(containerName);
        Object run = containerObject.run();
        return (R) run;
    }

    public void putContainerObject(String containerName, ContainerObject containerObject) {
        this.container.put(containerName, containerObject);
    }

    private void registerContainer(ServiceProviderInterface serviceProvider) {
        serviceProvider.register(this);
    }

}
