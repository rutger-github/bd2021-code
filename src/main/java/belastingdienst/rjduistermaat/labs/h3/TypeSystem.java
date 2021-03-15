package belastingdienst.rjduistermaat.labs.h3;

import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class TypeSystem {
    private boolean testBoolean;
    private Client client;

    public void showDifference() {
        int i = 10;
        System.out.println("i:" + i);
        System.out.println("i++: " + i++);
        System.out.println("i after i++: " + i);
        int i2 = 10;
        System.out.println("i2: " + i2);
        System.out.println("++i2: " + ++i2);
        System.out.println("i2 after ++i2: " + i2);
    }

    public void explainJ() {
        int i = 3;
        int j = i < 3 ? i++ + ++i : ++i >>> 1;

        System.out.println(j);
    }

    public void calculateBinarySum(int binaryValue1, int binaryValue2) {
        System.out.println(binaryValue1 + binaryValue2);
    }

    public void calculateNewHourUsingModuleOperator(int hours, int startHour) {

        if (startHour > 24 || startHour < 0) {
            System.out.println("Enter a startHour between 0 and 24.");
        }

        LocalDateTime time = LocalDateTime.of(2021, Month.JANUARY, 1, startHour, 0, 0, 0);
        LocalDateTime endtime = time.plusHours(80);

        System.out.println("Calculate using LocalDateTime.plusHours (to check):" + endtime);

        int endHour = (startHour + hours) % 24;

        System.out.println("Calculate using modulo:" + endHour);

    }

    public void calculateDifferenceInDaysUsingModuleOperator(int hours, int startHour) {

        if (startHour > 24 || startHour < 0) {
            System.out.println("Enter a startHour between 0 and 24.");
        }

        LocalDateTime startDateTime = LocalDateTime.of(2021, Month.JANUARY, 1, startHour, 0, 0, 0);
        LocalDateTime endDateTime = startDateTime.plusHours(hours);

        System.out.println("Calculate using Duration.between (to check): " + Duration.between(startDateTime, endDateTime).toDays());

        int daysBetween = (hours / 24);

        System.out.println("Calculate using modulo: " + daysBetween);


    }

    public void minMaxValuesPrimitives() {
        System.out.println("byte min value = " + Byte.MIN_VALUE);
        System.out.println("byte max value = " + Byte.MAX_VALUE);
        System.out.println("short min value = " + Short.MIN_VALUE);
        System.out.println("short max value = " + Short.MAX_VALUE);
        System.out.println("int min value = " + Integer.MIN_VALUE);
        System.out.println("int max value = " + Integer.MAX_VALUE);
        System.out.println("long min value = " + Long.MIN_VALUE);
        System.out.println("long max value = " + Long.MAX_VALUE);
        System.out.println("float min value = " + Float.MIN_VALUE);
        System.out.println("float max value = " + Float.MAX_VALUE);
        System.out.println("double min value = " + Double.MIN_VALUE);
        System.out.println("double max value = " + Double.MAX_VALUE);
        System.out.println("character min value = " + (int) Character.MIN_VALUE);
        System.out.println("character max value = " + (int) Character.MAX_VALUE);
    }

    public void outputDefaultValueOfVars() {
        // not possible
        //        boolean test;
        //        if (test) {
        //            System.out.println();
        //        }

        System.out.println(this.testBoolean);

        var testVar = 2;
        var testVar2 = "test";
        testVar2 = "test2";

        System.out.println(testVar);
        System.out.println(testVar2);
        System.out.println(this.client);

        if (this.client == null) {
            System.out.println("client not initialized");
        } else {
            System.out.println("client initialized");
        }

        char one = '1';
        char two = '2';

        int one1 = 1;
        int two2 = 2;

        String.valueOf(1);


    }
}
