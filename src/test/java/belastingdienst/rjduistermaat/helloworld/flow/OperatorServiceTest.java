package belastingdienst.rjduistermaat.helloworld.flow;

import belastingdienst.rjduistermaat.helloworld.core.OperatorService;
import belastingdienst.rjduistermaat.helloworld.core.Person;
import belastingdienst.rjduistermaat.helloworld.infrastructure.memory.LogOutputter;
import org.junit.Assert;
import org.junit.Test;

public class OperatorServiceTest {
    private LogOutputter logOutputter;
    private OperatorService operatorService;

    @Test
    public void sayHelloTest() {
        Person person = new Person("RutgerTest");
        this.operatorService.sayHello(person);
        Assert.assertEquals("RutgerTest", this.logOutputter.getOutput());
    }

    @Test
    public void sayGoodbyeTest() {
        Person person = new Person("RutgerTest");
        this.operatorService.sayGoodbye(person);
    }

    public void before() {
        this.logOutputter = new LogOutputter();
        this.operatorService = new OperatorService(
                this.logOutputter
        );
    }

}
