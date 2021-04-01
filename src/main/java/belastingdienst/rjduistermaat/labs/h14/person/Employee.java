package belastingdienst.rjduistermaat.labs.h14.person;

public class Employee extends Person {
    public Employee(String name, int age) {
        super(name, age);
    }

    public String greet() {
        return "I'm tired of working. This is inhuman!";
    }
}
