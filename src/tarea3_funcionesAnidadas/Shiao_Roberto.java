/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_funcionesAnidadas;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
public class Shiao_Roberto {

    static Scanner sc = new Scanner(System.in);
    static final double PI = 3.14;
    static DecimalFormat df = new DecimalFormat("#.00");

    public static void main(String[] args) {
        String op;
        int casos;
        double lado1, diagonal_M, diagonal_m, resultado, radio_R, radio_r, comparacion50;
        try {
            do {
                casos = mostrarMenu();
                switch (casos) {
                    case 1:
                        System.out.println("\tIngresaste al ejercicio 1: area del cuadrado");
                        do {
                            System.out.print("\nIngrese el valor del lado: ");
                            lado1 = sc.nextDouble();
                        } while (lado1 <= 0);
                        calcularCuadrado(lado1);
                        break;
                    case 2:
                        System.out.println("\tIngresaste al ejercicio 2: area del rombo");
                        do {
                            System.out.print("\nIngrese el valor del la diagonal mayor: ");
                            diagonal_M = sc.nextDouble();
                        } while (diagonal_M <= 0);
                        do {
                            System.out.print("Ingrese el valor del la diagonal menor: ");
                            diagonal_m = sc.nextDouble();
                        } while (diagonal_m <= 0);
                        resultado = calcularRombo(diagonal_M, diagonal_m);
                        System.out.println("\nEL area del rombo es: " + df.format(resultado));
                        break;
                    case 3:
                        System.out.println("\tIngresaste al ejercicio 3: area de la corona");
                        do {
                            System.out.print("\nIngrese el valor del radio mayor: ");
                            radio_R = sc.nextDouble();
                        } while (radio_R <= 0);
                        do {
                            System.out.print("Ingrese el valor del radio menor: ");
                            radio_r = sc.nextDouble();
                        } while (radio_r <= 0);
                        resultado = calcularCorona(radio_R, radio_r);
                        System.out.println("\nEL area de la corona es: " + df.format(resultado));
                        break;
                    case 4:
                        System.out.println("\tIngresaste al ejercicio 4: comparacion 50");
                        System.out.print("\nIngrese ingrese un numero: ");
                        comparacion50 = sc.nextDouble();
                        verificarNumero(comparacion50);

                        break;
                    default:
                        System.out.println("°° EL NUMERO INGRESADO NO ESTA EN EL RANGO DE OPCIONES °°");

                }
                System.out.print("\nDeseas continuar con el programa?? (s/n):");
                op = sc.next().toLowerCase();
            } while (op.equals("s"));

        } catch (Exception ex) {
            System.out.println("\n\t\t\tADVERTENCIA");
            System.out.println("\n\t\t¡¡¡¡ Datos incorrectos !!!!");
        }//Fin control de error
    }

    //inicio de funciones 
    //funcion de menu
    static int mostrarMenu() {
        int opcion;
        System.out.println("|====================   MENU   ===================|");
        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.println("| 1 - Area del cuadrado                           |");
        System.out.println("| 2 - Area del rombo                              |");
        System.out.println("| 3 - Area de la corona                           |");
        System.out.println("| 4 - Numero mayor o menor a 50(par, impar, igual)|");
        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.print("\n Selecciona una de las opciones disponibles (1-4): ");
        opcion = sc.nextInt();
        return opcion;
    }// fin funcion menu 

    //funcion area del cuadrado(sin retorno)
    static void calcularCuadrado(double a) {
        System.out.println("EL area del cuadrado es: " + df.format(Math.pow(a, 2)));
    }

    //funcion area del rombo 
    static double calcularRombo(double diagonal_M, double diagonal_m) {
        double rombo;
        rombo = (diagonal_M * diagonal_m) / 2;
        return rombo;
    }

    //funcion area de la corona 
    static double calcularCorona(double radio_R, double radio_r) {
        double corona;
        corona = PI * (Math.pow(radio_R, 2) * Math.pow(radio_r, 2));
        return corona;
    }

    //funciones anidadas
    static void verificarNumero(double num) {
        if (num > 50) {
            System.out.println("El numero " + num + " es mayor a 50");
            if (verificarPar(num)) {
                System.out.println("El numero " + num + " es par");
            } else {
                System.out.println("El numero no es par");
            }
        } else if (num < 50) {
            System.out.println("El numero es " + num + " menor a 50");
            if (verificarImpar(num)) {
                System.out.println("El numero " + num + " es impar");
            } else {
                System.out.println("El numero no es impar");
            }
        }
        if (num == 50) {
            Igual(num);
        }
    }

    //funcion mayor 50, comprueba si es par o no 
    static boolean verificarPar(double num) {
        boolean Par = false;
        if (num % 2 == 0) {
            Par = true;
        }
        return Par;
    }

    // funcion menor a 50, comprueba si es impar 
    static boolean verificarImpar(double num) {
        boolean Impar = true;
        if (num % 2 == 0) {
            Impar = false;
        }
        return Impar;
    }

    //funcion igual a 50
    static void Igual(double num) {
        System.out.println("El numero " + num + " es igual a 50");
    }
}
