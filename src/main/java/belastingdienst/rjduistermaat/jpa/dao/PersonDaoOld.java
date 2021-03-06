package belastingdienst.rjduistermaat.jpa.dao;

import belastingdienst.rjduistermaat.jpa.Person;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class PersonDaoOld {
    public static final EntityManager em = Persistence.createEntityManagerFactory("MySQL-jpademo").createEntityManager();

    public Person find(int id) {
        return em.find(Person.class, id);
    }

    public void create(Person person) {
        var transaction = em.getTransaction();

        transaction.begin();
        em.persist(person);
        transaction.commit();


    }
}
