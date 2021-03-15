package belastingdienst.rjduistermaat.labs.h7;

public class Person {
    private String name;
    private int age;
    private Gender gender;

    public static int numberOfPossibleGenders = Gender.values().length;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void haveBirthday() {
        this.age++;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        if (this.gender == null) {
            return Gender.UNKNOWN;
        }
        return this.gender;
    }

    public int getAge() {
        return age;
    }
}
