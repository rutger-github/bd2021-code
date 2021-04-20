package belastingdienst.rjduistermaat.jpa;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public enum JobDao
        implements
        DaoCreateInterface<Job>,
        DaoReadInterface<Job> {

    INSTANCE;

    @Override
    public EntityManager getEntityManager() {
        return Persistence.createEntityManagerFactory("MySQL-jpademo").createEntityManager();
    }

    @Override
    public Class<Job> getClazz() {
        return Job.class;
    }
}
