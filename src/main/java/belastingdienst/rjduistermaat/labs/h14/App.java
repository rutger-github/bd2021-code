package belastingdienst.rjduistermaat.labs.h14;

import belastingdienst.rjduistermaat.labs.h14.person.Gender;
import belastingdienst.rjduistermaat.labs.h14.person.Person;

public class App {
    public static void main(String[] args) {
        PersonCollection personCollection = new PersonCollection();

        personCollection.addPerson(
                new Person("Piet", 30),
                new Person("Piet", 30, Gender.MALE),
                new Person("Henk", 30, Gender.MALE),
                new Person("Henk", 30, Gender.UNKNOWN),
                new Person("Piet", 30),
                new Person("Jan", -30)
        );

        for (Person person : personCollection.getPersons()) {
            System.out.println(person);

        }

    }
}
