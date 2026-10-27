/**
 * Autor: Luis Fernando Campuzano Hernandez
 * Fecha: 26/10/2026
 * GTID244
 * Problema: Derdenio y sus Estructuras de Datos 
*/

public class ListaSimple {

    private Nodo cabeza;
    private Nodo cola;

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
     * Muestra los números en el orden en que están guardados.
     */
    public void mostrarInverso() {
        Nodo actual = cabeza;
        boolean primero = true;

        while (actual != null) {
            if (!primero) {
                System.out.print(" ");
            }

            System.out.print(actual.dato);
            primero = false;
            actual = actual.siguiente;
        }

        System.out.println();
    }

    /**
     * Combina dos listas ordenadas de menor a mayor
     * y guarda el resultado de mayor a menor.
     *
     * @param otra segunda lista
     * @return lista combinada de mayor a menor
     */
    public ListaSimple combinar(ListaSimple otra) {
        ListaSimple resultado = new ListaSimple();

        int[] a = convertirArreglo(this.cabeza);
        int[] b = convertirArreglo(otra.cabeza);

        int i = a.length - 1;
        int j = b.length - 1;

        while (i >= 0 && j >= 0) {
            if (a[i] >= b[j]) {
                resultado.agregar(a[i]);
                i--;
            } else {
                resultado.agregar(b[j]);
                j--;
            }
        }

        while (i >= 0) {
            resultado.agregar(a[i]);
            i--;
        }

        while (j >= 0) {
            resultado.agregar(b[j]);
            j--;
        }

        return resultado;
    }

    /**
     * Convierte los datos de la lista en un arreglo auxiliar.
     *
     * @param nodo inicio de la lista
     * @return arreglo con los números
     */
    private int[] convertirArreglo(Nodo nodo) {
        int cantidad = 0;
        Nodo actual = nodo;

        while (actual != null) {
            cantidad++;
            actual = actual.siguiente;
        }

        int[] arreglo = new int[cantidad];
        actual = nodo;

        for (int i = 0; i < cantidad; i++) {
            arreglo[i] = actual.dato;
            actual = actual.siguiente;
        }

        return arreglo;
    }
}


/**
 * Implementa una lista enlazada simple para combinar números.
 */
public class ListaSimple {

    private Nodo cabeza;
    private Nodo cola;

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
     * Muestra los números en el orden en que están guardados.
     */
    public void mostrarInverso() {
        Nodo actual = cabeza;
        boolean primero = true;

        while (actual != null) {
            if (!primero) {
                System.out.print(" ");
            }

            System.out.print(actual.dato);
            primero = false;
            actual = actual.siguiente;
        }

        System.out.println();
    }

    /**
     * Combina dos listas ordenadas de menor a mayor
     * y guarda el resultado de mayor a menor.
     *
     * @param otra segunda lista
     * @return lista combinada de mayor a menor
     */
    public ListaSimple combinar(ListaSimple otra) {
        ListaSimple resultado = new ListaSimple();

        int[] a = convertirArreglo(this.cabeza);
        int[] b = convertirArreglo(otra.cabeza);

        int i = a.length - 1;
        int j = b.length - 1;

        while (i >= 0 && j >= 0) {
            if (a[i] >= b[j]) {
                resultado.agregar(a[i]);
                i--;
            } else {
                resultado.agregar(b[j]);
                j--;
            }
        }

        while (i >= 0) {
            resultado.agregar(a[i]);
            i--;
        }

        while (j >= 0) {
            resultado.agregar(b[j]);
            j--;
        }

        return resultado;
    }

    /**
     * Convierte los datos de la lista en un arreglo auxiliar.
     *
     * @param nodo inicio de la lista
     * @return arreglo con los números
     */
    private int[] convertirArreglo(Nodo nodo) {
        int cantidad = 0;
        Nodo actual = nodo;

        while (actual != null) {
            cantidad++;
            actual = actual.siguiente;
        }

        int[] arreglo = new int[cantidad];
        actual = nodo;

        for (int i = 0; i < cantidad; i++) {
            arreglo[i] = actual.dato;
            actual = actual.siguiente;
        }

        return arreglo;
    }
}

