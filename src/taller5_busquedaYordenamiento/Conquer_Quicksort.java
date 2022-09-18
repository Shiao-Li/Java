/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller5_busquedaYordenamiento;

import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
public class Conquer_Quicksort {

    public static void main(String[] args) {
        Scanner bk = new Scanner(System.in);
        int tamanio;
        int datos[];

        System.out.print("Ingrese el tamaño del arreglo: ");
        tamanio = bk.nextInt();
        datos = new int[tamanio];

        System.out.println("\nIngreso de datos del arreglo");
        for (int i = 0; i < datos.length; i++) {
            System.out.print("Posicion [" + i + "] --> ");
            datos[i] = bk.nextInt();
        }
        System.out.println("Datos antes de ordenar");
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Datos despues de ordenar");
        quicksort(datos, 0, tamanio - 1);
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i] + " ");
        }
        System.out.println("\n");
    }

    static void quicksort(int arreglo[], int primero, int ultimo) {
        int central, i, j;
        int pivote;
        central = (primero + ultimo) / 2;
        pivote = arreglo[central];
        i = primero;
        j = ultimo;
        do {
            while (arreglo[i] < pivote) {
                i++;
            }
            while (arreglo[j] > pivote) {
                j--;
            }
            if (i <= j) {
                int temp;
                temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j) {
            quicksort(arreglo, primero, j);
        }
        if (i < ultimo) {
            quicksort(arreglo, i, ultimo);
        }
    }
}
