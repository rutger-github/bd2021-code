package belastingdienst.rjduistermaat.jpa;

import java.lang.reflect.ParameterizedType;

public interface GetClazzInterface<E> {
    default Class<E> getClazz2() {
        ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();

        return (Class<E>) parameterizedType.getActualTypeArguments()[0];
    }

    Class<E> getClazz();
}
