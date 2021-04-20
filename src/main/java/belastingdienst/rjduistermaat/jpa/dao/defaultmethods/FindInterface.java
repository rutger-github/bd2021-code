package belastingdienst.rjduistermaat.jpa.dao.defaultmethods;

import belastingdienst.rjduistermaat.jpa.dao.GetClazzInterface;
import belastingdienst.rjduistermaat.jpa.dao.GetEntityManagerInterface;

public interface FindInterface<E, I> extends GetClazzInterface<E>, GetEntityManagerInterface<E> {

    default E find(I id) {

        var clazz = getClazz();

        return (E) getEntityManager().find(clazz, id);
    }


}