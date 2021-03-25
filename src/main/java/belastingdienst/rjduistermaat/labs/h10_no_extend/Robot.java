package belastingdienst.rjduistermaat.labs.h10_no_extend;

public class Robot implements Chargeable, ClassGetter {
    private String name;
    private int level;

    public Robot(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

}
