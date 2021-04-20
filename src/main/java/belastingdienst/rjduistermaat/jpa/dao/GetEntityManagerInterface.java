package belastingdienst.rjduistermaat.jpa.dao;

import javax.persistence.EntityManager;

public interface GetEntityManagerInterface<E> {
    EntityManager getEntityManager();
}
