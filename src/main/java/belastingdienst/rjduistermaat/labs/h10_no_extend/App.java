package belastingdienst.rjduistermaat.labs.h10_no_extend;

public class App {
    public static void main(String[] args) {
        var teacher1 = new Teacher();

        System.out.println(teacher1.charge(50));
        System.out.println(teacher1.charge(150));

        var robot1 = new Robot("Robin", 2);
        System.out.println(robot1.getLevel());

        robot1.charge(20);
        System.out.println(robot1.getLevel());

        robot1.getThisClass();
        teacher1.getThisClass();


    }
}
