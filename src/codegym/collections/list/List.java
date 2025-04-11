package codegym.collections.list;

public interface List <H> {

    /**
     * Añade elementos a la lista
     *
     * @param data dato que queremos añadir a la lista
     */
    void add(H data);

    /**
     * Elimina un elemento de la lista
     *
     * @param index indice del elemento a borrar
     *
     * @return El elemento eliminado
     */
    H remove(int index);

    /**
     * Obtiene un elemento de la lista por índice
     *
     * @param index Indice del elemento deseado
     *
     * @return El elemento deseado
     */
    H get(int index);

    /**
     * Establece un elemento de lista por índice
     * @param index Indice deseado
     * @param data Dato a establecer
     */
    void set(int index, H data);

    /**
     * @return El número de elementos válidos de la lista
     */
    int size();
}
