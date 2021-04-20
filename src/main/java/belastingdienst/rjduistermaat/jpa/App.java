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

        var personDaoEnum = PersonDaoEnum.INSTANCE;

//        personDaoEnum.create(person1);

//        Person test = personDaoEnum.find(9);

//        System.out.println(test);
//
        var person2 = personDaoEnum.find(2);
        personDaoEnum.delete(2);
        personDaoEnum.delete(person2);

        var persons = personDaoEnum.findAllNamed();

        persons.forEach(System.out::println);


    }
}
