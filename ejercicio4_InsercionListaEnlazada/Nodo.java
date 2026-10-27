
/**
 * Autor: Luis Fernando Campuzano Hernández
 * Grupo: GTID244
 * Fecha: 26/10/2026
 * Representa un nodo de una lista enlazada simple.
 * Cada nodo almacena un entero y la referencia al siguiente nodo.
 */

public class Nodo {
    int dato;
    Nodo siguiente;

    /**
     * Crea un nodo con el valor recibido.
     *
     * @param dato valor entero que se almacenará
     */
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
