
/**
 * Autor: Luis Fernando Campuzano Hernandez
 * Fecha: 26/10/2026
 * GTID244
 * Problema: Cuenta letras al vector
 * Representa un nodo que almacena la frecuencia de una letra.
 */

public class Nodo {

    int dato;
    Nodo siguiente;

    /**
     * Inicializa un nodo con una frecuencia.
     * @param dato cantidad inicial de apariciones
     */
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
