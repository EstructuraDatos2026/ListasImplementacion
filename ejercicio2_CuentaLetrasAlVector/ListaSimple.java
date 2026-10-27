
/**
 * Autor: Luis Fernando Campuzano Hernandez
 * Fecha: 26/10/2026
 * GTID244
 * Problema: Cuenta letras al vector
 * Administra las frecuencias mediante una lista enlazada propia.
 */

public class ListaSimple {

    private Nodo cabeza;
    private Nodo cola;

    /**
     * Crea una lista vacia.
     */
    public ListaSimple() {
        cabeza = null;
        cola = null;
    }

    /**
     * Agrega un nodo al final de la lista.
     * @param dato frecuencia inicial del nodo
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
     * Aumenta en uno la frecuencia de una posicion.
     * @param posicion indice de la letra entre 0 y 25
     */
    public void contarLetra(int posicion) {
        Nodo actual = cabeza;
        int indice = 0;

        while (actual != null && indice < posicion) {
            actual = actual.siguiente;
            indice++;
        }

        if (actual != null) {
            actual.dato++;
        }
    }

    /**
     * Obtiene la frecuencia almacenada en una posicion.
     * @param posicion indice que se desea consultar
     * @return frecuencia o -1 si la posicion no existe
     */
    public int obtener(int posicion) {
        Nodo actual = cabeza;
        int indice = 0;

        while (actual != null && indice < posicion) {
            actual = actual.siguiente;
            indice++;
        }

        if (actual == null) {
            return -1;
        }

        return actual.dato;
    }

    /**
     * Devuelve el primer nodo de la lista.
     * @return cabeza de la lista
     */
    public Nodo obtenerCabeza() {
        return cabeza;
    }
}

