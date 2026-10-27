
import java.util.Scanner;

/**
 * Autor: Luis Fernando Campuzano Hernandez
 * Fecha: 26/10/2026
 * GTID244
 * Problema: Cuenta letras al vector
 * Cuenta las apariciones de las letras de la a a la z.
 */

public class Main {

    /**
     * Lee la cadena, calcula las frecuencias y muestra los resultados.
     * @param args argumentos de ejecucion
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String cadena = entrada.nextLine();

        ListaSimple frecuencias = new ListaSimple();

        // Se crea un nodo para cada letra del alfabeto.
        for (int i = 0; i < 26; i++) {
            frecuencias.agregar(0);
        }

        // Se cuenta cada caracter en la posicion que le corresponde.
        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            int posicion = letra - 'a';

            frecuencias.contarLetra(posicion);
        }

        // Se imprimen las 26 frecuencias en una sola linea.
        for (int i = 0; i < 26; i++) {
            if (i > 0) {
                System.out.print(" ");
            }

            System.out.print(frecuencias.obtener(i));
        }

        System.out.println();

        // Se muestran solamente las letras que aparecen.
        for (int i = 0; i < 26; i++) {
            int cantidad = frecuencias.obtener(i);

            if (cantidad > 0) {
                char letra = (char) ('a' + i);

                System.out.println(
                    "La letra " + letra + " aparece "
                    + cantidad + " veces"
                );
            }
        }

        entrada.close();
    }
}
