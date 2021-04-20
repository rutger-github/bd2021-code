package belastingdienst.rjduistermaat.jpa;

public class App {

    public static void main(String[] args) {

        var jobDao = JobDao.INSTANCE;

        Job job1 = jobDao.find(3);


        Person person1 = new Person("Pietje", "Puk");
        person1.setJob(job1);

//        var personDao = new PersonDao();

//        personDao.create(person1);

//        System.out.println(personDao.find(8));

        var personDao = PersonDao.INSTANCE;

//        personDao.create(person1);

//        Person test = personDao.find(9);

//        System.out.println(test);
//
        var person2 = personDao.find(2);
        personDao.delete(2);
        personDao.delete(person2);

        var person6 = personDao.find(6);
        personDao.updateFirstname(person6, "Henk");

        var persons = personDao.findAllNamed();

        persons.forEach(System.out::println);


    }
}
