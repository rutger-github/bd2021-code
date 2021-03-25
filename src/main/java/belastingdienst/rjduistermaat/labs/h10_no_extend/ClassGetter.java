package belastingdienst.rjduistermaat.labs.h10_no_extend;

public interface ClassGetter {
    default void getThisClass() {
        System.out.println(this.getClass().getName());
        System.out.println(this.getName());
    }

    String getName();
}
