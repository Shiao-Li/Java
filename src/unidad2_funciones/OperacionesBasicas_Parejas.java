/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2_funciones;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
public class OperacionesBasicas_Parejas {

    static Scanner sc = new Scanner(System.in);// estoy usando como clase, no como objeto
    static DecimalFormat df = new DecimalFormat("#.00");
    static int resultado = 0;

    public static void main(String[] args) {
        String menu, opcion;
        int num1, num2, num3;
        do {
            mostrarMenu();
            menu = sc.next().toUpperCase();
            switch (menu) {
                case "A": {
                    System.out.println("Suma");
                    System.out.print("Ingrese el 1er valor: ");
                    num1 = sc.nextInt();
                    System.out.print("Ingrese el 2do valor: ");
                    num2 = sc.nextInt();
                    System.out.print("Ingrese el 3er valor: ");
                    num3 = sc.nextInt();
                    System.out.print("La suma es: " + sumar(num1, num2, num3) + "\n\n");
                }
                break;
                case "B": {
                    System.out.println("Resta");
                    System.out.print("Ingrese el 1er valor: ");
                    num1 = sc.nextInt();
                    System.out.print("Ingrese el 2do valor: ");
                    num2 = sc.nextInt();
                    restar(num1, num2);
                }
                break;
                case "C": {
                    System.out.println("Multiplicacion");
                    System.out.println("El resultado de la multiplicacion es: " + multiplicar());
                }
                break;
                case "D": {
                    System.out.println("Division");
                    System.out.println("Recuerde que el 1er valor debe ser mayor al 2do y el 2do valor no debe ser igual a 0");
                    do {
                        System.out.print("Ingrese el 1er valor: ");
                        num1 = sc.nextInt();
                        do {
                            System.out.print("Ingrese el 2do valor: ");
                            num2 = sc.nextInt();
                        } while (num2 == 0);
                    } while (!(num1 > num2));
                    System.out.println("El resultado de la division es: " + df.format(dividir(num1, num2)) + "\n\n");
                }
                break;
                case "E": {
                    System.out.println("Potencia");
                    System.out.println("Recuerde que el dato 1 y dato 2 deben ser mayor a 2.");
                    do {
                        System.out.print("Ingrese la base: ");
                        num1 = sc.nextInt();
                    } while (!(num1 > 2));// estoy usando la negacion para usar tal cual el enunciado
                    do {
                        System.out.print("Ingrese el exponente: ");
                        num2 = sc.nextInt();
                    } while (!(num2 > 2));
                    calcularPotencia(num1, num2);
                }
                break;
                case "F": {
                    System.out.println("Par o impar");
                    do {
                        System.out.println("Ingrese un numero positivo (es decir mayor a 0)");
                        System.out.print("Ingrese el valor: ");
                        num1 = sc.nextInt();
                    } while (num1 <= 0);
                    if (determinarParImpar(num1)) {
                        System.out.println("El numero " + num1 + " es PAR." + "\n\n");
                    } else {
                        System.out.println("El numero " + num1 + " es IMPAR." + "\n\n");
                    }
                }
                break;
                default: {
                    System.out.println("\nOpcion no disponible. Escoja una opcion del menu.");
                }
                break;
            }
            System.out.print("Deseas continuar ejecutando el programa? (y/n):");
            opcion = sc.next().toUpperCase();
        } while (opcion.equals("Y"));

    }

    static void mostrarMenu() {// metodo debe llevar verbo infinito, metodo sin retorno, sin parametros
        System.out.println("***** MENU *****");
        System.out.println("A. Suma");
        System.out.println("B. Resta");
        System.out.println("C. Multiplicar");
        System.out.println("D. Dividir");
        System.out.println("E. Potencia");
        System.out.println("F. Par o impar");
        System.out.print("Seleccione una de las opciones disponibles: ");
    }

    //metodo con retorno y 3 parametros
    static int sumar(int a, int b, int c) {
        resultado = a + b + c;
        return resultado;
    }
    //metodo sin retorno y 2 parametros

    static void restar(double a, double b) {
        System.out.print("El resultado de la resta es: " + Math.abs(a - b) + "\n\n");
    }
    //metodo con retorno y sin parametros

    static double multiplicar() {
        System.out.print("Ingrese el 1er valor: ");
        double num1 = sc.nextDouble();
        System.out.print("Ingrese el 2do valor: ");
        double num2 = sc.nextDouble();
        return num1 * num2;
    }
    //metodo con retorno

    static double dividir(int num1, int num2) {
        double resultadoFinal = (double) num1 / num2;
        return resultadoFinal;
    }

    static void calcularPotencia(int a, int b) {
        System.out.println("el resultado de la potencia es: " + Math.pow(a, b) + "\n\n");
    }

    static boolean determinarParImpar(int num1) {
        boolean esPar = false;
        if (num1 % 2 == 0) {
            esPar = true;
        }
        return esPar;
    }

}
