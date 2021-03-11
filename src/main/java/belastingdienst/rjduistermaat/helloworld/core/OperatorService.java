package belastingdienst.rjduistermaat.helloworld.core;

import belastingdienst.rjduistermaat.helloworld.core.Person;

public class OperatorService {

    private OperatorOutputInterface operatorOutputInterface;

    public OperatorService(OperatorOutputInterface operatorOutputInterface) {
        this.operatorOutputInterface = operatorOutputInterface;
    }

    public void sayHello(Person person) {
        this.operatorOutputInterface.output("Welcome to the world " + person.getName());
    }

    public void sayGoodbye(Person person) {
        this.operatorOutputInterface.output("Dear " + person.getName() + ", thank you for visiting us!");
    }
}
