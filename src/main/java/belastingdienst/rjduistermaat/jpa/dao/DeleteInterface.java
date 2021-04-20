package belastingdienst.rjduistermaat.jpa.dao;

public interface DeleteInterface<E, I> extends GetEntityManagerInterface<E>, GetClazzInterface<E> {

    default <D extends GetId<I>> void delete(D entity) {
        if (entity == null) {
            return;
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
        var managedEntity = em.find(getClazz(), id);
        if (managedEntity != null) {
            em.remove(managedEntity);
        }
        transaction.commit();
    }

}
