package belastingdienst.rjduistermaat.jpa;

public class App {

    public static void main(String[] args) {


        Person person1 = new Person("Pietje", "Puk");

//        var personDao = new PersonDao();

//        personDao.create(person1);

//        System.out.println(personDao.find(8));

        var personDaoEnum = PersonDaoEnum.INSTANCE;

//        personDaoEnum.create(person1);

        Person test = personDaoEnum.find(9);
//
        System.out.println(test);
//
//        var persons = personDaoEnum.findAllNamed();
//
//        persons.forEach(System.out::println);


    }
}
