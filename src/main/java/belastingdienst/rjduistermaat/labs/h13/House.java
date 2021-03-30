package belastingdienst.rjduistermaat.labs.h13;


import belastingdienst.rjduistermaat.labs.h13.person.Human;

public class House<T extends Human> {
    private final Human humanObj;

    public House(Human humanObj) {
        this.humanObj = humanObj;
    }

    @Override
    public String toString() {
        return "This house is owned by [" + this.humanObj.toString() + "] and it says [" + this.humanObj.greet() + "]";
    }
}
