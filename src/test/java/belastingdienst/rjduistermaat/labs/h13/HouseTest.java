package belastingdienst.rjduistermaat.labs.h13;

import belastingdienst.rjduistermaat.labs.h13.person.Android;
import belastingdienst.rjduistermaat.labs.h13.person.Gender;
import belastingdienst.rjduistermaat.labs.h13.person.Human;
import belastingdienst.rjduistermaat.labs.h13.person.Person;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class HouseTest {

    @ParameterizedTest(name = "#{index} - givenHumanObject {0}, WhenToString {1}, ThenExpectedStringReturn {2} ")
    @MethodSource("toStringDataProvider")
    <T extends Human> void testToString(T humanObj, String expected) {

        House<T> house1 = new House<>(humanObj);
        String actual = house1.toString();

        Assertions.assertThat(actual).isEqualTo(expected);


    }

    private static Stream<Arguments> toStringDataProvider() {
        return Stream.of(
                arguments(new Person("Piet", 10, Gender.UNKNOWN), "This house is owned by [Piet (10) is UNKNOWN] and it says [Hello, my name is Piet. Nice to meet you!]"),
                arguments(new Person("Henkie", 99, Gender.MALE), "This house is owned by [Henkie (99) is MALE] and it says [Hello, my name is Henkie. Nice to meet you!]"),
                arguments(new Android(), "This house is owned by [Android has no name, age and gender..] and it says [I'm only half human, but human still... My energy level is 0%]")
        );
    }
}