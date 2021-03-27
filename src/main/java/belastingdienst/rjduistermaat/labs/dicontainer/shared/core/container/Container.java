package belastingdienst.rjduistermaat.labs.dicontainer.shared.core.container;

import belastingdienst.rjduistermaat.labs.dicontainer.bank.infrastructure.container.ServiceProviderBank;

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

        Container.instance = container;

        return Container.instance;
    }

    public Object getContainerObject(Object containerName) {
        if (this.container.containsKey(containerName) == false) {
            throw new RuntimeException("unknown container");
        }

        return container.get(containerName).run();
    }

    public void putContainerObject(String containerName, ContainerObject containerObject) {
        this.container.put(containerName, containerObject);
    }

    private void registerContainer(ServiceProviderInterface serviceProvider) {
        serviceProvider.register(this);
    }

}
