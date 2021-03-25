package belastingdienst.rjduistermaat.labs.h10;

public class App {
    public static void main(String[] args) {
        var person1 = new Person("Piet", 15);

        System.out.println(person1.greet());

        var android1 = new Android();

        System.out.println(android1.greet());

        var employee1 = new Employee("Henkie", 30);

        System.out.println(employee1.greet());

        var teacher1 = new Teacher("Henkie", 30);

        System.out.println(teacher1.greet());

        System.out.println(android1.charge(50));
        System.out.println(android1.greet());
        System.out.println(android1.charge(190));
        System.out.println(android1.greet());
    }
}
