/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricesEjercicios;

import java.util.Scanner;

/**
 * Este ejercicio se esta utilizando randomicos
 *
 * @author SHIAO_LITECH
 */
public class Ejempo2_Matrices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fila, columna, inicio, fin;

        //1.declarar la matriz
        int numeros[][];

        //2. instanciar la matriz (dar tamaño) a la matriz
        System.out.print("Ingrese el # de filas: ");
        fila = sc.nextInt();
        System.out.print("Ingrese el # de columnas: ");
        columna = sc.nextInt();

        //especifico el taño de fxc de la matriz
        numeros = new int[fila][columna];

        //3.Iinicilizar los elementos de la matriz
        System.out.println("\n\tAsignacion de datos a la matriz");
        System.out.print("Ingrese el inicio del randomico:  ");
        inicio = sc.nextInt();
        System.out.print("Ingrese el limite del randomico:  ");
        fin = sc.nextInt();

        for (int k = 0; k < numeros.length; k++) {//FILAS
            for (int j = 0; j < numeros[k].length; j++) {//COLUMNAS, en la condicion se pone el interador del prier bucle
                numeros[k][j] = (int) (Math.random() * (fin - inicio + 1) + inicio);//esta forma es cuando recibo los datos por teclado y limite + 1 cuando los datos son establecidos
                System.out.println("Index [" + k + "][" + j + "] -->" + numeros[k][j]);
                //muestre los randomicos asignados
            }
        }
        //4.mostrar elementos de la matriz
        for (int filas = 0; filas < numeros.length; filas++) {
            for (int columnas = 0; columnas < numeros[filas].length; columnas++) {
                System.out.print(numeros[filas][columnas] + " | ");
            }
            System.out.println("");
        }
    }
}
