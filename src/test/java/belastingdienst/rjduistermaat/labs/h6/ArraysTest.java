package belastingdienst.rjduistermaat.labs.h6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArraysTest {
    private Arrays arraysInstance;

    @BeforeEach
    void setUp() {
        this.arraysInstance = new Arrays();
    }

    @ParameterizedTest(name = "#{index} - Test with inputArray = {0}, expected = {1}")
    @MethodSource("increaseCapacityOfLongArrayProvider")
    void increaseCapacityOfLongArray(long[] inputArray, long[] expected) {
        var increasedArray = this.arraysInstance.increaseCapacityOfLongArray(inputArray);
        assertArrayEquals(expected, increasedArray);
    }

    @ParameterizedTest(name = "#{index} - Test with inputArray = {0}, multiplier = {1}, expected = {2}")
    @MethodSource("multiplyEachElementProvider")
    void multiplyEachElement(long[] inputArray, int multiplier, long[] expected) {
        var multipliedArray = this.arraysInstance.multiplyEachElement(inputArray, multiplier);
        assertArrayEquals(expected, multipliedArray);
    }

    static Stream<Arguments> multiplyEachElementProvider() {
        return Stream.of(
                Arguments.of(new long[]{1, 2, 3, 4, 5}, 2, new long[]{2, 4, 6, 8, 10}),
                Arguments.of(new long[]{2, 4, 6, 8, 10}, 4, new long[]{8, 16, 24, 32, 40}),
                Arguments.of(new long[]{2, 4, 6, 8, 10}, 0, new long[]{0, 0, 0, 0, 0})
        );
    }

    static Stream<Arguments> increaseCapacityOfLongArrayProvider() {
        return Stream.of(
                Arguments.of(new long[]{1, 2, 3, 4}, new long[]{1, 2, 3, 4, 0, 0, 0, 0}),
                Arguments.of(new long[]{2, 4, 6, 8, 10}, new long[]{2, 4, 6, 8, 10, 0, 0, 0, 0, 0})
        );
    }
}