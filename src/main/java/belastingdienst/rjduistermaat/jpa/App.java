package belastingdienst.rjduistermaat.jpa;

public class App {

    public static void main(String[] args) {

        Person person1 = new Person("Rutger", "Duistermaat");

        var personDao = new PersonDao();

        personDao.create(person1);

        System.out.println(personDao.find(1));
        System.out.println(personDao.find(2));


    }
}
