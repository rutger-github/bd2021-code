package belastingdienst.rjduistermaat.jpa.dao;

import belastingdienst.rjduistermaat.jpa.dao.defaultmethods.CreateInterface;
import belastingdienst.rjduistermaat.jpa.dao.defaultmethods.UpdateInterface;

public interface WriteInterface<E> extends CreateInterface<E>, UpdateInterface<E> {
}
