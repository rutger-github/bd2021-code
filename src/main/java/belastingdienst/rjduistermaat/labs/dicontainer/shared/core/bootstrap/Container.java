package belastingdienst.rjduistermaat.labs.dicontainer.shared.core.bootstrap;

import java.util.HashMap;
import java.util.Map;

public class Container {
    Map<String, Object> containers = new HashMap<String, Object>();

    public Map<String, Object> getContainers() {
        return containers;
    }

    public void register(String name, Object classObject) {
        this.containers.put(name, classObject);
    }

}
