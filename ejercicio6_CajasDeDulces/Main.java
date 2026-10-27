/**
 * Autor: Luis Fernando Campuzano Hernandez
 * Fecha: 26/10/2026
 * GTID244
 * Problema: Cajas de dulces
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        ListaSimple lista = new ListaSimple();

        for (int i = 0; i < n; i++) {
            lista.agregar(sc.nextInt());
        }

        System.out.println(lista.sumaMaxima(k));

        sc.close();
    }
}