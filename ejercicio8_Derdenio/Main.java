/**
 * Autor: Luis Fernando Campuzano Hernandez
 * Fecha: 26/10/2026
 * GTID244
 * Problema: Derdenio y sus Estructuras de Datos 
*/

import java.util.Scanner;

/**
 * Combina dos listas ordenadas de números enteros.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ListaSimple lista1 = new ListaSimple();
        ListaSimple lista2 = new ListaSimple();

        for (int i = 0; i < n; i++) {
            lista1.agregar(sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            lista2.agregar(sc.nextInt());
        }

        ListaSimple resultado = lista1.combinar(lista2);
        resultado.mostrarInverso();

        sc.close();
    }
}
