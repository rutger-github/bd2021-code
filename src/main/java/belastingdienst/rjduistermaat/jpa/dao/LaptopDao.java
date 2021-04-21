package belastingdienst.rjduistermaat.jpa.dao;

import belastingdienst.rjduistermaat.jpa.Laptop;
import belastingdienst.rjduistermaat.jpa.dao.defaultmethods.DeleteInterface;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public enum LaptopDao
        implements
        ReadInterface<Laptop, Integer>,
        DeleteInterface<Laptop, Integer>,
        WriteInterface<Laptop> {

    INSTANCE;

    private EntityManager entityManager = Persistence.createEntityManagerFactory("MySQL-jpademo").createEntityManager();

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public EntityManager getEntityManager() {
        return this.entityManager;
    }


    @Override
    public Class<Laptop> getEntityClass() {
        return Laptop.class;
    }

    public Laptop findByBrand(String brand) {
        var namedQuery = getEntityManager().createNamedQuery("Laptop.findByBrand", Laptop.class);
        namedQuery.setParameter("brand", brand);
        return namedQuery.getSingleResult();
    }
}
