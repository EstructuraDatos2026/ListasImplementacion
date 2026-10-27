
import java.util.Scanner;

/**
 * Autor: Luis Fernando Campuzano Hernández
 * Grupo: GTID244
 * Fecha: 26/10/2026
 * Programa principal del ejercicio 4.
 * Lee números hasta el final de la entrada, procesa
 * la lista y muestra la cantidad de nodos insertados
 * y el contenido actualizado.
 */
public class Main {

    /**
     * Punto de entrada del programa.
     *
     * @param args argumentos de ejecución
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ListaSimple lista = new ListaSimple();

        // Lee los números hasta que ya no haya más entrada.
        while (entrada.hasNextInt()) {
            int numero = entrada.nextInt();
            lista.agregar(numero);
        }

        int cantidad = lista.Parcial3();

        System.out.println(cantidad);
        lista.mostrar();

        entrada.close();
    }
}
