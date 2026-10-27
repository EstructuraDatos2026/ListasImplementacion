/**
 * Autor: Luis Fernando Campuzano Hernandez
 * Fecha: 26/10/2026
 * GTID244
 * Problema: Derdenio y sus Estructuras de Datos 
*/

public class Nodo {
    int dato;
    Nodo siguiente;

    /**
     * Crea un nodo con un número entero.
     * @param dato número que se guardará
     */
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
