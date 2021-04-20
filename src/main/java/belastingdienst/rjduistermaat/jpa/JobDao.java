package belastingdienst.rjduistermaat.jpa;

import belastingdienst.rjduistermaat.jpa.dao.ReadInterface;
import belastingdienst.rjduistermaat.jpa.dao.WriteInterface;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public enum JobDao
        implements
        WriteInterface<Job>,
        ReadInterface<Job, Integer> {

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
