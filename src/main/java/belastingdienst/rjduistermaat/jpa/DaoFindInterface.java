package belastingdienst.rjduistermaat.jpa;

public interface DaoFindInterface<E> extends GetClazzInterface<E>, GetEntityManagerInterface<E> {

    default <E> E find(int id) {

        var clazz = getClazz();

        return (E) getEntityManager().find(clazz, id);
    }


}
