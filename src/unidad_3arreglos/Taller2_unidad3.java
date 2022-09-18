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
public class Taller2_unidad3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nEjercicio de bucles con randómicos");
        int aleatorios[] = new int[20];
        String repetir, opcionIngresada;
        do {
            opcionIngresada = mostrarMenu();
            switch (opcionIngresada) {
                case "A": {
                    System.out.println("\tAsignación de randómicos");
                    for (int i = 0; i < aleatorios.length; i++) {
                        aleatorios[i] = (int) (Math.random() * 20) + 1;
                    }
                    System.out.println("Se ha asignado todos los valores randómicos al array");
                }
                break;
                case "B": {
                    System.out.println("\tMostrar datos");
                    for (int i = 0; i < aleatorios.length; i++) {
                        System.out.println("Numero aleatorio " + (i + 1) + " -->" + aleatorios[i]);
                    }
                }
                break;
                case "C": {
                    System.out.println("\tMostrar el número mayor");
                    int mayor = 0;
                    for (int i = 0; i < aleatorios.length; i++) {
                        if (aleatorios[i] > mayor) {
                            mayor = aleatorios[i];
                        }
                    }
                    System.out.println("El número mayor corresponde a: " + mayor);
                }
                break;
                case "D": {
                    System.out.println("\tMostrar la suma de los elementos");
                    int suma = 0;
                    for (int i = 0; i < aleatorios.length; i++) {
                        suma = suma + aleatorios[i];
                    }
                    System.out.println("La suma de los valores del array es: " + suma);
                }
                break;
                default: {
                    System.out.println("Opcion ingresada no corresponde al menu.");
                }
                break;
            }
            System.out.print("Deseas continuar ejecutando el programa? (y/n):");
            repetir = sc.next().toUpperCase();
        } while (repetir.equals("Y"));

    }

    static String mostrarMenu() {
        String opcion = "";
        try {
            System.out.println("***** MENU *****");
            System.out.println("A. Asignar randomicos.");
            System.out.println("B. Mostrar datos.");
            System.out.println("C. Número mayor.");
            System.out.println("D. Suma.");
            System.out.print("Ingresa tu opcion: ");
            opcion = sc.next().toUpperCase();
        } catch (Exception e) {
            System.out.println("Ingresaste datos incorrectos.");
        }
        return opcion;
    }

}
