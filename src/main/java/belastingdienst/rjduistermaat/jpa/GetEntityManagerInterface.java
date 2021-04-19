package belastingdienst.rjduistermaat.jpa;

import javax.persistence.EntityManager;

public interface GetEntityManagerInterface<E> {
    EntityManager getEntityManager();
}
