package belastingdienst.rjduistermaat.labs.h8.person;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void testToString() {
        var person = new Person("Jan", 45);
        person.setGender(Gender.MALE);
        Assertions.assertThat(person.toString()).isEqualTo("Jan (45) is MALE");
    }


    @Test
    void testEquals() {
        var person = new Person("Jan", 45);
        person.setGender(Gender.MALE);

        var person2 = new Person("Jan", 45);
        person2.setGender(Gender.MALE);

        Assertions.assertThat(person.equals(person2)).isTrue();

        var person3 = new Person("Jan", 46);
        person3.setGender(Gender.MALE);

        Assertions.assertThat(person.equals(person3)).isFalse();
    }

    @Test
    void testHashCode() {
        var person1 = new Person("Jan", 45);
        person1.setGender(Gender.MALE);
        var hash = person1.hashCode();
        Assertions.assertThat(hash).isEqualTo(-658360850);

        var person2 = new Person("Piet", 5);
        person2.setGender(Gender.FEMALE);
        var hash2 = person2.hashCode();
        Assertions.assertThat(hash2).isEqualTo(1315336912);

        var samePersonAsPerson1 = new Person("Jan", 45);
        samePersonAsPerson1.setGender(Gender.MALE);
        var hash3 = person1.hashCode();
        Assertions.assertThat(hash3).isEqualTo(-658360850);

        Assertions.assertThat(person1.equals(samePersonAsPerson1)).isTrue();
        Assertions.assertThat(person1.equals(person2)).isFalse();

    }
}