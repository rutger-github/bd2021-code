package belastingdienst.rjduistermaat.labs.h12.person;

public class Android extends Human implements Chargeable {
    private int level;

    @Override
    public String greet() {
        return "I'm only half human, but human still... My energy level is " + this.level + "%";
    }

    @Override
    public int charge(int amount) {
        if (this.level == 100) return 100;

        var newLevel = this.level += amount;
        if (newLevel > 100) return this.level = 100;

        return this.level = newLevel;
    }

    public String toString() {
        return "Android has no name, age and gender..";
    }
}
