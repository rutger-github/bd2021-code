package belastingdienst.rjduistermaat.helloworld;

import belastingdienst.rjduistermaat.helloworld.core.OperatorService;
import belastingdienst.rjduistermaat.helloworld.core.Person;
import belastingdienst.rjduistermaat.helloworld.infrastructure.cli.SystemOutPrintln;

public class App {

    public static void main(String[] args) {
        OperatorService operatorService = new OperatorService(
                new SystemOutPrintln()
        );

        Person person = new Person("Rutger");

        operatorService.sayHello(person);
        operatorService.sayGoodbye(person);
    }
}
