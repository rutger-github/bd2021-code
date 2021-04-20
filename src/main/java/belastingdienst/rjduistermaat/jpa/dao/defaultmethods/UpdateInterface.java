package belastingdienst.rjduistermaat.jpa.dao.defaultmethods;

import belastingdienst.rjduistermaat.jpa.dao.GetEntityManagerInterface;

public interface UpdateInterface<E> extends GetEntityManagerInterface<E> {
    default void update(E e) {
        var em = getEntityManager();
        var transaction = em.getTransaction();
        transaction.begin();
        em.merge(e);
        transaction.commit();
    }
}
