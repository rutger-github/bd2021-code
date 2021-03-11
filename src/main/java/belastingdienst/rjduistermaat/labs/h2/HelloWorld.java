package belastingdienst.rjduistermaat.labs.h2;

import java.util.ArrayList;

public class HelloWorld {

    /**
     * @param args CLIarguments
     */
    public static void main(String[] args) {

        String[] arguments = {"test", "test2", "test3", "test4"};
        ArrayList<String> arguments2 = new ArrayList<String>();

        arguments2.add("testList1");
        arguments2.add("testList2");

        System.out.println(arguments2);


        System.out.printf("This is a %1$s, %2$s, %3$s and a %4$s %n", arguments[0], arguments[1], arguments[2], arguments[3]);

        System.out.print("Hello World");
        System.out.print("testHello World");
    }
}
