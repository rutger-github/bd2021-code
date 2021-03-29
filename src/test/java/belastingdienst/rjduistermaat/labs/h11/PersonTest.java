package belastingdienst.rjduistermaat.labs.h11;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {

    private Person person;

    @BeforeEach
    void setUp() {
        this.person = new Person("Piet", 15);
    }

    @Test
    void createSubHumanTest() {
        Human subhuman1 = this.person.createSubHuman();

        Assertions.assertThat(subhuman1.greet()).isEqualTo("Sub is the best.");
    }
}