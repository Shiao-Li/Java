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
public class Ejercicio1While {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0, suma = 0, cont = 0;

        System.out.println("Ingrese numeros positivos para ejecutar el programa");
        System.out.println("Para salir ingresa un valor negativo");

        while (numero >= 0) {
            numero = sc.nextInt();
            cont++;
            suma = suma + numero;
        }

        System.out.println("El total de numero positivos ingresados es: " + (cont - 1));
        System.out.println("La suma de numero positivos ingresados es " + (suma - numero));
    }
}
