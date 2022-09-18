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
public class Ejercicio1_2_Matrices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //atriz identidad 
        int matriz[][] = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("");
        }
    }
}
