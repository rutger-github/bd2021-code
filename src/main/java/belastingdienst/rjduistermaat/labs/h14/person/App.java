package belastingdienst.rjduistermaat.labs.h14.person;

public class App {
    public static void main(String[] args) {
        var person1 = new Person("Piet", 15);

        person1.addHistory("geschiedenis");
        person1.addHistory("geschiedenis2");

        person1.printHistory();
    }
}
