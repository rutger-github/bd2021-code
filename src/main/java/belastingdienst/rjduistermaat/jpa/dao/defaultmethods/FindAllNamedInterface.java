package belastingdienst.rjduistermaat.jpa.dao.defaultmethods;

import belastingdienst.rjduistermaat.jpa.dao.GetClazzInterface;
import belastingdienst.rjduistermaat.jpa.dao.GetEntityManagerInterface;

import java.util.List;

public interface FindAllNamedInterface<E> extends GetEntityManagerInterface<E>, GetClazzInterface<E> {
    default List<E> findAllNamed() {
        return getEntityManager().createNamedQuery(getClazz().getSimpleName() + ".findAll", getClazz()).getResultList(); // JPQL Java Persistence Query Language
    }
}
