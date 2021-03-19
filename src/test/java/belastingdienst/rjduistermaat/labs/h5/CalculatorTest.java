package belastingdienst.rjduistermaat.labs.h5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void greatest() {
        int greatest = Calculator.greatest(5, 4, 3, 2, 1);
        assertEquals(5, greatest);

        int greatest2 = Calculator.greatest(5, 28, 26, 80, 1, 63);
        assertEquals(80, greatest2);
    }

    @ParameterizedTest(name = "#{index} - Test with a = {0}, b = {1}, , expected = {2}")
    @CsvSource({
            "hoi, hallo, hallo",
            "hallo, hoiii, hallo",
            "ditiskort, ditislang....., ditislang....."
    })
    void testGreatest(String a, String b, String expected) {
        String greatestString = Calculator.greatest(a, b);
        assertEquals(expected, greatestString);
    }

    @Test
    void factorial() {
        int factorial5 = Calculator.factorial(5, 1);
        assertEquals(120, factorial5);
    }

    @ParameterizedTest(name = "#{index} - Test with n = {0}, expected = {1}")
    @CsvSource({
            "5, 120",
            "-5, -120",
            "-4, 24",
            "-1, 0",
            "0, 0",
            "3, 6"
    })
    void factorialImproved(int n, int expected) {
        int factorial = Calculator.factorialImproved(n);
        assertEquals(expected, factorial);
    }
}