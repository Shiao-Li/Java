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
public class busqueda_secuencial_busquedaDelElemento {
    public static void main(String[] args) {
        Scanner bk = new Scanner(System.in);
        int tamanio;
        int datos[];
        int encontrado = -1;
        int elemento_buscado;
        System.out.print("Ingrese el tamaño del arreglo: ");
        tamanio = bk.nextInt();
        datos = new int[tamanio];

        System.out.println("\nIngreso de datos del arreglo");
        for (int i = 0; i < datos.length; i++) {
            System.out.print("Posicion [" + i + "] --> ");
            datos[i] = bk.nextInt();
        }
        System.out.println("Datos del arreglo");
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Datos Ordenados");
        OrdInser(datos);
        imprimir(datos);
        System.out.print("Ingrese el numero a buscar: ");
        elemento_buscado = bk.nextInt();
        for (int i = 0; i < tamanio ; i++) {
            if (datos[i] == elemento_buscado) {
                encontrado = i;
            }
        }
        System.out.print("El "+elemento_buscado+" se encontro en la posicion: " + encontrado);
        System.out.println("\n");
    }
    static void OrdInser(int a[]) {
        int clave, i;
        for (int j = 1; j < a.length; j++) {
            clave=a[j];
            i=j-1;
            while (i>-1 && a[i]>clave) {                
                a[i+1] = a[i];
                i=i-1;
            }
            a[i+1]=clave;
        }
    }
    static void imprimir(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.println("Posicion [" + i + "] --> " +a[i]);
        }
        System.out.println("\n");
    }
}
