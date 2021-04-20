package belastingdienst.rjduistermaat.jpa;

import belastingdienst.rjduistermaat.jpa.dao.ReadInterface;
import belastingdienst.rjduistermaat.jpa.dao.WriteInterface;
import belastingdienst.rjduistermaat.jpa.dao.defaultmethods.DeleteInterface;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public enum PersonDao
        implements
        ReadInterface<Person, Integer>,
        DeleteInterface<Person, Integer>,
        WriteInterface<Person> {

    INSTANCE;

    @Override
    public EntityManager getEntityManager() {
        return Persistence.createEntityManagerFactory("MySQL-jpademo").createEntityManager();
    }

    @Override
    public Class<Person> getClazz() {
        return Person.class;
    }

    public void updateFirstname(Person person, String newName) {
        EntityManager em = getEntityManager();
        var transaction = em.getTransaction();
        transaction.begin();
        person.setFirstName(newName);
        em.merge(person);
        transaction.commit();
    }
}