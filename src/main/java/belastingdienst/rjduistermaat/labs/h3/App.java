package belastingdienst.rjduistermaat.labs.h3;

import java.math.BigInteger;

public class App {

    public static void main(String[] args) {
        TypeSystem typeSystem = new TypeSystem();
        typeSystem.showDifference();
//        typeSystem.explainJ();
//        typeSystem.calculateBinarySum(0b1010, 0b100);
//        typeSystem.calculateNewHourUsingModuleOperator(80, 23);
//        typeSystem.calculateDifferenceInDaysUsingModuleOperator(80, 23);
//        typeSystem.minMaxValuesPrimitives();
//        typeSystem.outputDefaultValueOfVars();
//        checkClientNameAssumption();


    }

    private static void checkClientNameAssumption() {

        Client client1 = new Client("Jan");
        Client client2 = new Client("Piet");
        client2 = client1;
        client2.name = "Joris";

        BigInteger bigint = BigInteger.valueOf(12345);
        BigInteger bigint2 = BigInteger.valueOf(56789);

        bigint2 = bigint;
        System.out.println(bigint2);
        System.out.println(bigint);

        String string1 = "Jan";
        String string2 = "Piet";
        string2 = string1;
        System.out.println(string1);

        int int1 = 1;
        int int2 = 4;
        int2 = int1;
        System.out.println(int2);

        System.out.println(client1.name);
    }
}
