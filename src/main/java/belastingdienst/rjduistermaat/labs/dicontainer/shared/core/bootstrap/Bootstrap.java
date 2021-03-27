package belastingdienst.rjduistermaat.labs.dicontainer.shared.core.bootstrap;

public class Bootstrap {
    private Container container;

    public void start() {
        this.container = new Container();


//        TransferMoneyRepositoryInterface transferMoneyRepository = () -> {
//            return "";
//            return new TransferMoneyRepository();
//        };

//        var test2 = (() -> {
//            System.out.println("test");
//        });


//        System.out.println();

//        var test = (() -> {
//            System.out.println("test");
//        });


//
//        String transferMoneyService = () -> {
//            return "";
////            return new TransferMoneyService(transferMoneyRepository);
//        };

//        $container[ListUploadFoldersController::class] = function (Container $container): ListUploadFoldersController {
//            return new ListUploadFoldersController($container[ListUploadFolderService::class]);
//        };

//        this.container.register(TransferMoneyRepositoryInterface.class.getName(), transferMoneyRepository);
//        this.container.register(TransferMoneyService.class.getName(), transferMoneyService);

    }

    public Container getContainer() {
        return this.container;
    }

}
