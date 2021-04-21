package belastingdienst.rjduistermaat.jpa;

import belastingdienst.rjduistermaat.jpa.dao.JobDao;
import belastingdienst.rjduistermaat.jpa.dao.LaptopDao;
import belastingdienst.rjduistermaat.jpa.dao.PersonDao;
import belastingdienst.rjduistermaat.jpa.logger.LoggerAdapter;

public class App {

    public static void main(String[] args) {

        var logger = new LoggerAdapter().getLogger("App");

        var jobDao = JobDao.INSTANCE;

        Job job1 = jobDao.find(3);


//        var personDao = new PersonDao();

//        personDao.create(person1);

//        System.out.println(personDao.find(8));

        var personDao = PersonDao.INSTANCE;
        var laptopDao = LaptopDao.INSTANCE;

//        laptopDao.create(new Laptop("Dell"));
//        laptopDao.create(new Laptop("Hp"));


//        Person person1 = new Person("Pietjesdasdadsasdadsa", "Puk");
        Person person1 = new Person("Pietje", "Puk");
        person1.setJob(job1);
        person1.setEmail("example@domain.com");
//        person1.setEmail("invalidEmail!");
//        try {
//
//            Set<Laptop> laptopSet = Set.of(
//                    laptopDao.findByBrand("Dell"),
//                    laptopDao.findByBrand("Hp")
//            );
//            person1.setLaptops(laptopSet);
//        } catch (Exception exception) {
//            logger.warn("Laptop not found by brand");
//        }


        personDao.create(person1);

//        Person test = personDao.find(9);

//        System.out.println(test);

//        Person personNull = null;
//        try {
//            personDao.delete(personNull);
//        } catch (InvalidEntityException exception) {
//            logger.warn("Person entity is null");
//        }
//
//        var person2 = personDao.find(2);
//        personDao.delete(2);
//        personDao.delete(person2);

//        var person6 = personDao.find(6);
//        personDao.updateFirstname(person6, "Henk");

        var persons = personDao.findAllNamed();

        persons.forEach(System.out::println);


    }
}
