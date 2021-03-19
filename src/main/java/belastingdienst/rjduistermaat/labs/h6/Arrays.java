package belastingdienst.rjduistermaat.labs.h6;

public class Arrays {
    public long[] increaseCapacityOfLongArray(long[] inputArray) {

        var newLongArray = new long[inputArray.length * 2];
        System.arraycopy(inputArray, 0, newLongArray, 0, inputArray.length);

        return newLongArray;
    }

    public long[] multiplyEachElement(long[] inputArray, int multiplier) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] *= multiplier;
        }

        return inputArray;
    }

}
