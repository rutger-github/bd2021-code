package belastingdienst.rjduistermaat.labs.h13;

import belastingdienst.rjduistermaat.labs.h13.person.Gender;
import belastingdienst.rjduistermaat.labs.h13.person.Person;

public class App {

    public static void main(String[] args) {
        Person piet = new Person("Piet", 10, Gender.UNKNOWN);
        House<Person> houseOfPiet = new House<>(piet);

        System.out.println(houseOfPiet.toString());
    }
}
