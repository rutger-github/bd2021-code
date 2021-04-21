package belastingdienst.rjduistermaat.jpa.dao.defaultmethods;

import belastingdienst.rjduistermaat.jpa.dao.GetEntityClassInterface;
import belastingdienst.rjduistermaat.jpa.dao.GetEntityManagerInterface;

import java.util.List;

public interface FindAllNamedInterface<E> extends GetEntityManagerInterface<E>, GetEntityClassInterface<E> {
    default List<E> findAllNamed() {
        return getEntityManager().createNamedQuery(getEntityClass().getSimpleName() + ".findAll", getEntityClass()).getResultList(); // JPQL Java Persistence Query Language
    }
}
