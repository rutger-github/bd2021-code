package belastingdienst.rjduistermaat.helloworld.core;

public class OperatorService {

    private final OutputInterface outputInterface;

    public OperatorService(OutputInterface outputInterface) {
        this.outputInterface = outputInterface;
    }

    public void sayHello(Person person) {
        this.outputInterface.output("Welcome to the world " + person.getName());
    }

    public void sayGoodbye(Person person) {
        this.outputInterface.output("Dear " + person.getName() + ", thank you for visiting us!");
    }
}
