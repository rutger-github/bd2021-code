package belastingdienst.rjduistermaat.labs.dicontainer.bank.core;

import belastingdienst.rjduistermaat.labs.dicontainer.bank.infrastructure.memory.TransferMoneyRepository;

import java.util.HashMap;


interface ObjFunction {
    Object run();
}

public class TestContainer {
    public static TestContainer instance;

    private HashMap<Object, Object> container = new HashMap<>();

    public static TestContainer getInstance() {
        if (TestContainer.instance != null) {
            return TestContainer.instance;
        }

        var container = new TestContainer();
        container.serviceprovider();

        TestContainer.instance = container;

        return TestContainer.instance;
    }

    public void serviceprovider() {


        this.container.put(TransferMoneyRepositoryInterface.class.getName(), (ObjFunction) () -> {
            System.out.println("transferMoneyRepository");
            return new TransferMoneyRepository();
        });

        this.container.put(TransferMoneyService.class.getName(), (ObjFunction) () -> {
            System.out.println("TransferMoneyService");
            return new TransferMoneyService(
                    (TransferMoneyRepositoryInterface) getContainerObject(TransferMoneyRepositoryInterface.class.getName())
            );
        });
        System.out.println("");

    }


    public Object getContainerObject(Object containerName) {

        var format = (ObjFunction) container.get(containerName);
        return format.run();
//        System.out.println(result);
    }

}
