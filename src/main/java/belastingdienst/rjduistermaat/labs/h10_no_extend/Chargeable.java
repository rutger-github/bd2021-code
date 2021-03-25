package belastingdienst.rjduistermaat.labs.h10_no_extend;

public interface Chargeable {
    default int charge(int amount) {
        this.setLevel(this.getLevel() + amount);
        return this.getLevel();
    }

    int getLevel();

    void setLevel(int level);
}
