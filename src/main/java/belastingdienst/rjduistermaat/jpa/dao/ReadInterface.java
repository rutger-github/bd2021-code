package belastingdienst.rjduistermaat.jpa.dao;

import belastingdienst.rjduistermaat.jpa.dao.defaultmethods.FindAllNamedInterface;
import belastingdienst.rjduistermaat.jpa.dao.defaultmethods.FindInterface;

public interface ReadInterface<E, I> extends FindInterface<E, I>, FindAllNamedInterface<E> {
}
