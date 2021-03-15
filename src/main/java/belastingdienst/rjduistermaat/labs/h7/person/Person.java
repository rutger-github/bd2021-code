package belastingdienst.rjduistermaat.labs.h7.person;

public class Person {
    private String name;
    private int age;
    private Gender gender;

    public static int numberOfPossibleGenders = Gender.values().length;
    private final static int maximumAge = 130;
    private final static String personDiedExceptionMessage = "The maximum age of a person is " + maximumAge;

    public Person(String name, int age) throws PersonDiedException {
        if (age > maximumAge) {
            throw new PersonDiedException(personDiedExceptionMessage);
        }

        this.name = name;
        this.age = age;
    }

    public void haveBirthday() throws PersonDiedException {
        if (this.age + 1 > maximumAge) {
            throw new PersonDiedException(personDiedExceptionMessage);
        }
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
