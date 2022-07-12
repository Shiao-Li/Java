/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad_2;

import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
public class Ejercicio2_DoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad, opcion;
        do {
            do {
                System.out.println("Ingrese la edad (1 - 85): ");
                edad = sc.nextInt();
            } while (edad < 1 || edad > 85);

            if (edad >= 1 && edad <= 12) {
                System.out.println("La aedad ingresada es (" + edad + ") corresponfiente a Niño");
            } else if (edad >= 13 && edad <= 20) {
                System.out.println("La aedad ingresada es (" + edad + ") corresponfiente a Adolescente");
            } else if (edad >= 21 && edad <= 64) {
                System.out.println("La aedad ingresada es (" + edad + ") corresponfiente a Adulto");
            } else if (edad >= 65) {
                System.out.println("La aedad ingresada es (" + edad + ") corresponfiente a Adulto mayor ");
            }

            System.out.println("Quieres seguir ejecutando el programa ?? 1.SI");
            opcion = sc.nextInt();
        } while (opcion == 1);
        System.out.println("VUELVA PRONTO !!");
    }
}
