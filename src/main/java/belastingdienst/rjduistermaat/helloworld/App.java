package belastingdienst.rjduistermaat.helloworld;

public class App {

    public static void main(String[] args) {
        Operator operator = new Operator(
                new Person("Rutger")
        );

        System.out.println(operator.sayHello());
        System.out.println(operator.sayGoodbye());
    }
}
