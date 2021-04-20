package belastingdienst.rjduistermaat.jpa.dao;

import java.util.List;

public interface FindAllNamedInterface<E> extends GetEntityManagerInterface<E>, GetClazzInterface<E> {
    default List<E> findAllNamed() {
        return getEntityManager().createNamedQuery(getClazz().getSimpleName() + ".findAll", getClazz()).getResultList(); // JPQL Java Persistence Query Language
    }
}
