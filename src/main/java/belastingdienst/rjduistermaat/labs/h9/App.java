package belastingdienst.rjduistermaat.labs.h9;

public class App {
    public static void main(String[] args) {
        var person1 = new Person("Piet", 15);

        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        person1.finalize();

    }
}
