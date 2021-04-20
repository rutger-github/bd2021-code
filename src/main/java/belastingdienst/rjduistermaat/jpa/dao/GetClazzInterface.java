package belastingdienst.rjduistermaat.jpa.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public interface GetClazzInterface<E> {
    default Class<E> getClazz2() {
        var genericInterfaces = getClass().getGenericInterfaces();
        for (Type genericInterface : genericInterfaces) {
            System.out.println(genericInterface.getClass().getClassLoader());
            System.out.println(genericInterface.getTypeName());
            System.out.println(genericInterface.getTypeName().getClass());
            System.out.println(genericInterface.getTypeName().getClass().getName());
            System.out.println(genericInterface.getClass().getGenericSuperclass());
            System.out.println(genericInterface.getClass().getName());
            System.out.println(genericInterface.getClass().getGenericSuperclass());
            System.out.println(genericInterface.getClass().getGenericInterfaces().getClass());
        }
        ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();


        var actualTypeArgument2 = parameterizedType.getActualTypeArguments()[0];
        var test = actualTypeArgument2.getClass().getTypeParameters();
        Class<E> actualTypeArgument = (Class<E>) parameterizedType.getActualTypeArguments()[0];
        return actualTypeArgument;
    }

    Class<E> getClazz();
}
