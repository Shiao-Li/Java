/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricesEjercicios;

import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
public class Ejercicio1_Matrices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nxm es igual al ingreso por teclado de filas y columnas 

        int numeros1[][], numeros2[][], resultados[][];
        int fila, columna;

        System.out.print("Ingrese el # de filas: ");
        fila = sc.nextInt();
        System.out.print("Ingrese el # de columnas: ");
        columna = sc.nextInt();

        numeros1 = new int[fila][columna];
        numeros2 = new int[fila][columna];
        resultados = new int[fila][columna];

        System.out.println(" **** Ingreso de elementos de la Matriz 1 ****");
        for (int i = 0; i < numeros1.length; i++) {
            for (int j = 0; j < numeros1[i].length; j++) {
                System.out.print("Index [" + i + "][" + j + "] -->");
                numeros1[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n **** Ingreso de elementos de la Matriz 2 ****");
        for (int i = 0; i < numeros2.length; i++) {
            for (int j = 0; j < numeros2[i].length; j++) {
                System.out.print("Index [" + i + "][" + j + "] -->");
                numeros2[i][j] = sc.nextInt();
            }
        }
        //IMORESION DE LOS ELEMENTOS DE LA MATRIZ
        System.out.println("\nMatriz 1");
        for (int i = 0; i < numeros1.length; i++) {
            for (int j = 0; j < numeros1[i].length; j++) {
                System.out.print(numeros1[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("\nMatriz 2");
        for (int i = 0; i < numeros2.length; i++) {
            for (int j = 0; j < numeros2[i].length; j++) {
                System.out.print(numeros2[i][j] + " | ");
            }
            System.out.println("");
        }

        //CREACION DE NUEVA MATRIZ CON LA SUMA DE LA MATRIZ 1 Y 2
        for (int f = 0; f < resultados.length; f++) {
            for (int c = 0; c < resultados[f].length; c++) {
                resultados[f][c] = numeros1[f][c] + numeros2[f][c];
            }
        }
        System.out.println("\nSuma resultante");
        for (int i = 0; i < resultados.length; i++) {
            for (int j = 0; j < resultados[i].length; j++) {
                System.out.print(resultados[i][j] + " | ");
            }
            System.out.println("");
        }
    }
}
