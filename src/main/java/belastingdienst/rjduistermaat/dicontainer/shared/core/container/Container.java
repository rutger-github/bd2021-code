package belastingdienst.rjduistermaat.dicontainer.shared.core.container;

import belastingdienst.rjduistermaat.dicontainer.bank.infrastructure.container.ServiceProviderBank;
import belastingdienst.rjduistermaat.dicontainer.shared.infrastructure.container.ServiceProviderShared;

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

        return (R) container.get(containerName).run();
    }

    public String getContainerObject(String containerName) {

        if (this.container.containsKey(containerName) == false) {
            throw new RuntimeException("unknown container");
        }

        return container.get(containerName).run().toString();
    }

    public void putContainerObject(String containerName, ContainerObject containerObject) {
        if (this.container.containsKey(containerName)) {
            throw new RuntimeException("Container '" + containerName + "' already created");
        }
        this.container.put(containerName, containerObject);
    }

    public void overwriteContainerObject(String containerName, ContainerObject containerObject) {
        this.container.put(containerName, containerObject);
    }

    private void registerContainer(ServiceProviderInterface serviceProvider) {
        serviceProvider.register(this);
    }

}
