package belastingdienst.rjduistermaat.jpa;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public enum PersonDaoEnum
        implements
        DaoFindInterface<Person>,
        DaoCreateInterface<Person>,
        DaoFindAllNamedInterface<Person> {

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
