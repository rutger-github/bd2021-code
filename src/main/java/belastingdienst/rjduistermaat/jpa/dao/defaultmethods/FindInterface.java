package belastingdienst.rjduistermaat.jpa.dao.defaultmethods;

import belastingdienst.rjduistermaat.jpa.dao.GetEntityClassInterface;
import belastingdienst.rjduistermaat.jpa.dao.GetEntityManagerInterface;

public interface FindInterface<E, I> extends GetEntityClassInterface<E>, GetEntityManagerInterface<E> {

    default E find(I id) {
        return (E) getEntityManager().find(getEntityClass(), id);
    }


}
