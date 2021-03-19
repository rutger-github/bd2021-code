package belastingdienst.rjduistermaat.labs.h5;

public class Calculator {


    /**
     * @deprecated
     */
    public static int greatest(int a, int b) {
        return Math.max(a, b);
    }

    public static String greatest(String a, String b) {

        if (a.length() < b.length()) {
            return b;
        }

        return a;


    }

    // greatest(1,2,3,4,51,2,41,51,51,52)
    public static int greatest(int... values) {
        // values.for + tab

        int max = 0;
        for (int value : values) {
            // vergelijk met max van hierboven
            // als huidige getal hoger dan max
            // dan zet max op dat getal
            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    /**
     * @deprecated
     */
    public static int factorial(int n, int sum) {

        // ternary operator
        // (inline condition)
        // if(statement) ? do this(true) : dothis(false)
//        return (n == 1) ? sum : factorial(n - 1, sum * n);

        // stop
        if (n == 1) return sum;
        sum = sum * n;

        return factorial(n - 1, sum);


    }

    public static int factorialImproved(int n) {
        return recursiveFactorialImproved(n, 0);
    }

    private static int recursiveFactorialImproved(int n, int sum) {

        if (n >= -1 && n <= 1) return sum;

        var newN = n > 0 ? n - 1 : n + 1;

        if (sum == 0) sum = n > 0 ? 1 : -1;

        return recursiveFactorialImproved(newN, sum * n);
    }

}