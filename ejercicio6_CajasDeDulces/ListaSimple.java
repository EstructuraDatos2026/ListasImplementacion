/**
 * Autor: Luis Fernando Campuzano Hernandez
 * Fecha: 26/10/2026
 * GTID244
 * Problema: Cajas de dulces
 * Calcula la suma máxima de K cajas consecutivas.
 * @param k cantidad de cajas que se pueden tomar
 * @return suma máxima de dulces
*/

public class ListaSimple {

    private Nodo cabeza;
    private Nodo cola;

    /**
     * Agrega una caja al final de la lista.
     *
     * @param dato cantidad de dulces de la caja
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
     * Calcula la suma máxima de K cajas consecutivas.
     *
     * @param k cantidad de cajas que se pueden tomar
     * @return suma máxima de dulces
     */
    public int sumaMaxima(int k) {
        if (k <= 0 || cabeza == null) {
            return 0;
        }

        Nodo actual = cabeza;
        int suma = 0;

        for (int i = 0; i < k; i++) {
            if (actual == null) {
                return 0;
            }

            suma += actual.dato;
            actual = actual.siguiente;
        }

        int maxima = suma;
        Nodo sale = cabeza;
        Nodo entra = actual;

        while (entra != null) {
            suma -= sale.dato;
            suma += entra.dato;

            if (suma > maxima) {
                maxima = suma;
            }

            sale = sale.siguiente;
            entra = entra.siguiente;
        }

        return maxima;
    }
}