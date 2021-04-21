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

    private EntityManager entityManager;

    JobDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    JobDao() {
        this.entityManager = Persistence.createEntityManagerFactory("MySQL-jpademo").createEntityManager();
    }

    @Override
    public EntityManager getEntityManager() {
        return this.entityManager;
    }

    @Override
    public Class<Job> getEntityClass() {
        return Job.class;
    }
}
