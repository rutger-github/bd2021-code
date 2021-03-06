package belastingdienst.rjduistermaat.labs.h8.person;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private Gender gender;

    public static int numberOfPossibleGenders = Gender.values().length;
    private final static int maximumAge = 130;
    private final static String personDiedExceptionMessage = "The maximum age of a person is " + maximumAge;

    public Person(String name, int age) {
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

    public String toString() {
        return this.name + " (" + this.age + ") is " + this.gender;
    }

//    public boolean equals(Person personToCompare) {
//        if (this == personToCompare) return true;
//        if (personToCompare == null || getClass() != personToCompare.getClass()) return false;
//        return age == personToCompare.age && Objects.equals(name, personToCompare.name) && gender == personToCompare.gender;
//    }

//    public int hashCode() {
//        return age * Objects.hashCode(name) * Objects.hashCode(gender);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    public void experimentObject() {
        var cls = this.getClass();
        var name = cls.getName();

        var declaredMethods = cls.getDeclaredMethods();
        System.out.println(Arrays.toString(declaredMethods));

        var methods = cls.getMethods();
        System.out.println(Arrays.toString(methods));

        var fields = cls.getDeclaredFields();
        System.out.println(Arrays.toString(fields));
    }
}
