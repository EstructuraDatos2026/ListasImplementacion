
/**
 * Autor: Luis Fernando Campuzano Hernández
 * Grupo: GTID244
 * Fecha: 26/10/2026
 *
 * Implementa una lista enlazada simple propia de enteros.
 * Permite agregar números, insertar -1 antes de cada número
 * impar y mostrar el contenido de la lista.
 */
public class ListaSimple {
    private Nodo cabeza;
    private Nodo cola;

    /**
     * Crea una lista vacía.
     */
    public ListaSimple() {
        cabeza = null;
        cola = null;
    }

    /**
     * Agrega un número al final de la lista.
     *
     * @param dato número que se agregará
     */
    public void agregar(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            cola = nuevo;
        }
    }

    /**
     * Inserta un nodo con valor -1 antes de cada nodo
     * que contiene un número impar.
     *
     * @return cantidad de nodos insertados
     */
    public int Parcial3() {
        int insertados = 0;
        Nodo actual = cabeza;
        Nodo anterior = null;

        while (actual != null) {
            if (actual.dato % 2 != 0) {
                Nodo nuevo = new Nodo(-1);
                nuevo.siguiente = actual;

                if (anterior == null) {
                    cabeza = nuevo;
                } else {
                    anterior.siguiente = nuevo;
                }

                insertados++;
            }

            anterior = actual;
            actual = actual.siguiente;
        }

        return insertados;
    }

    /**
     * Muestra todos los valores de la lista enlazada.
     * Si la lista está vacía, muestra NULL.
     */
    public void mostrar() {
        Nodo actual = cabeza;

        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }

        System.out.println("NULL");
    }
}
