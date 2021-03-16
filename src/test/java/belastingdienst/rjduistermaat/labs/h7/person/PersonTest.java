package belastingdienst.rjduistermaat.labs.h7.person;

import org.junit.Test;
import org.junit.Before;

public class PersonTest {
    @Test
    public void testPerson() {
        try {
            Person p = new Person("Jan", 130);


            System.out.println(p.getGender());
            p.setGender(Gender.MALE);
            System.out.println(p.getGender());
            p.haveBirthday(); // person gets one year older
            System.out.println(p.getAge());
            System.out.println(Person.numberOfPossibleGenders);

        } catch (PersonDiedException exception) {
            System.out.println(exception.getMessage());
        } catch (Exception exception) {
            System.out.println("Something went wrong");
        }


    }

    @Test
    public void testPersonMaximumAgeReached() {
        try {
            Person p = new Person("Jan", 131);

            System.out.println(p.getGender());
            p.setGender(Gender.MALE);
            System.out.println(p.getGender());
            p.haveBirthday(); // person gets one year older
            System.out.println(p.getAge());
            System.out.println(Person.numberOfPossibleGenders);

        } catch (PersonDiedException exception) {
            System.out.println(exception.getMessage());
        } catch (Exception exception) {
            System.out.println("Something went wrong");
        }


    }
}
