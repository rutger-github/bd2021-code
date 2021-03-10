package belastingdienst.rjduistermaat.helloworld;

public class Operator {
    private final Person person;

    public Operator(Person person) {
        this.person = person;
    }

    public String sayHello() {
        return "Welcome to the world " + this.person.getName();
    }

    public String sayGoodbye() {
        return "Dear " + this.person.getName() + ", thank you for visiting us!";
    }
}
