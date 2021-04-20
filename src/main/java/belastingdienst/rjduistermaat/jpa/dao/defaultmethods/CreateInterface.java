package belastingdienst.rjduistermaat.jpa.dao.defaultmethods;

import belastingdienst.rjduistermaat.jpa.dao.GetEntityManagerInterface;

public interface CreateInterface<E> extends GetEntityManagerInterface<E> {
    default void create(E entity) {
        var em = getEntityManager();
        var transaction = em.getTransaction();

        transaction.begin();
        em.persist(entity);
        transaction.commit();

    }

}
