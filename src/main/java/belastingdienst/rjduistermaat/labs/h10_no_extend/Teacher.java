package belastingdienst.rjduistermaat.labs.h10_no_extend;


final public class Teacher implements Chargeable, ClassGetter {
    private String subject;
    private String name;
    private int level;

    public String getSubject() {
        return subject;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return "ik heb geen zin in override";
    }
}
