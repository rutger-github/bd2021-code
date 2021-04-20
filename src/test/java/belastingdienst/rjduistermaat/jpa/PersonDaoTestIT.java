package belastingdienst.rjduistermaat.jpa;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.Persistence;
import java.util.List;

class PersonDaoTestIT {
    private PersonDao target;

    @BeforeEach
    void before() {
        PersonDao.INSTANCE.setEntityManager(Persistence.createEntityManagerFactory("MySQL-jpademo").createEntityManager());
        this.target = PersonDao.INSTANCE;
    }

    @Test
    void createPerson() {
        var beforeSize = target.findAllNamed().size();

        Person personToBeAdded = new Person("Vreek", "Fonk");
        target.create(personToBeAdded);

        List<Person> allNamed = target.findAllNamed();
        int size = allNamed.size();

        Assertions.assertThat(size).isEqualTo(beforeSize + 1);

        var lastAddedPerson = target.find(allNamed.get(size - 1).getId());
        Assertions.assertThat(lastAddedPerson).isEqualTo(personToBeAdded);

    }
}