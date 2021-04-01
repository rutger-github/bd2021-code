package belastingdienst.rjduistermaat.labs.h14;

import belastingdienst.rjduistermaat.labs.h14.person.Person;

import java.util.Collections;
import java.util.HashSet;

public class PersonCollection {
    HashSet<Person> persons = new HashSet<>();

    public void addPerson(Person... persons) {
        Collections.addAll(this.persons, persons);
    }

    public HashSet<Person> getPersons() {
        return persons;
    }


}
