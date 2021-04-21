package belastingdienst.rjduistermaat.jpa.dao.defaultmethods;

import belastingdienst.rjduistermaat.jpa.InvalidEntityException;
import belastingdienst.rjduistermaat.jpa.dao.GetEntityClassInterface;
import belastingdienst.rjduistermaat.jpa.dao.GetEntityManagerInterface;
import belastingdienst.rjduistermaat.jpa.dao.GetId;

public interface DeleteInterface<E, I> extends GetEntityManagerInterface<E>, GetEntityClassInterface<E> {



    default <D extends GetId<I>> void delete(D entity) {
        if (entity == null) {
            throw new InvalidEntityException();
        }

        if (entity.getId() == null) {
            return;
        }
        delete(entity.getId());
    }

    default void delete(I id) {
        var em = getEntityManager();
        var transaction = em.getTransaction();
        transaction.begin();
        var managedEntity = em.find(getEntityClass(), id);
        if (managedEntity != null) {
            em.remove(managedEntity);
        }
        transaction.commit();
    }

}
