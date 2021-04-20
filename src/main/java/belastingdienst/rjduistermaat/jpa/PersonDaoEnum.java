package belastingdienst.rjduistermaat.jpa;

import belastingdienst.rjduistermaat.jpa.dao.CreateInterface;
import belastingdienst.rjduistermaat.jpa.dao.ReadInterface;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public enum PersonDaoEnum
        implements
        ReadInterface<Person, Integer>,
        CreateInterface<Person> {

    INSTANCE;

    @Override
    public EntityManager getEntityManager() {
        return Persistence.createEntityManagerFactory("MySQL-jpademo").createEntityManager();
    }

    @Override
    public Class<Person> getClazz() {
        return Person.class;
    }
}
