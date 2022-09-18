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
public class Ejercicio3_Tablas_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = 0, num2 = 0, tabla = 0;
        String opcion;
        do {
            do {
                System.out.print("Ingrese el primer numero: ");
                num1 = sc.nextInt();
            } while (num1 < 1 || num1 > 20);
            do {
                System.out.print("Ingrese el segundo numero: ");
                num2 = sc.nextInt();
            } while (num2 < 1 || num2 > 16);

            for (int i = 1; i <= num2; i++) {
                tabla = num1 * i;
                System.out.println(num1 + " * " + i + " = " + tabla);
            }
            System.out.println("Deseas continuar con el programa?? (s/n)");
            opcion = sc.next().toLowerCase();
        } while (opcion.equals("s"));
    }
}
