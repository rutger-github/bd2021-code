package belastingdienst.rjduistermaat.lambda.h1;

public class Printer implements Consumer {

    @Override
    public void accept(Apple apple) {
        System.out.println(apple);
    }
}
