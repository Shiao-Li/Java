/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad_3arreglos;

import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
public class Ejercicio1_Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. Declaracion de arreglos 
        String nombres[];

        //2. Instancio el arreglos
        nombres = new String[3];
        System.out.println("\nImpresion sin bucle \n");
        //3. Inicializar el arreglo --> es decir le doy valores
        nombres[0] = "Sebastian";
        nombres[2] = "Carla";
        //nombres[3]="XXXXX"; no es posible 

        //4. Mostrar elementos del arreglo
        System.out.println("\tPosicion 0: " + nombres[0]);
        System.out.println("\tPosicion 1: " + nombres[1]);
        System.out.println("\tPosicion 2: " + nombres[2]);
        //System.out.println("Posicion 3: "+ nombres[3]); NO ES POSIBLE 

        System.out.println("\nImpresion con bucle \n");
        double numeros[] = new double[6];
        numeros[0] = 8.5;
        numeros[1] = 12.5;
        numeros[2] = 94.3;
        numeros[3] = 8.5;
        numeros[4] = 65.5;
        numeros[5] = 5.65;

        for (int i = 0; i < numeros.length; i++) { // no usar el tamaño del arreglo directamente, sino con el .length
            System.out.println("\tPosicion " + i + "--> " + numeros[i]);
        }
        //ingrese NNNNNN calificaciones de estudiantes
        System.out.println("\n===========================================================================");
        System.out.println("\n\tEJERCICIO NOTAS DE N NUMEROS\n");
        int n = 6;
        double nota = 0, suma = 0;

        double notas[] = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la calificacion " + (i + 1) + " : ");
            nota = sc.nextDouble();
            //suma = suma + nota;
            notas[i] = nota;
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota" + (i + 1) + "--> " + notas[i]);
            suma = suma + notas[i];
        }
        System.out.println("Suma : " + suma);

    }
}
