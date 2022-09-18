/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2_RS_2bim;

import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
public class Taller2_2BIM {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String opcion;
        int aleatoreos[] = new int[20];
        

        try {

            do {
                String menu = mostrarMenu().toUpperCase();
                switch (menu) {
                    case "A":
                        System.out.println("Ingreso de datos aleatorios\n");
                        for (int i = 0; i < aleatoreos.length; i++) {
                            aleatoreos[i] = (int) (Math.random() * 20 + 1);
                        }
                        break;
                    case "B":
                        System.out.println("Impresion del arreglo\n");
                        System.out.println("\nImpresion de datos del array ");
                        for (int i = 0; i < aleatoreos.length; i++) {
                            System.out.println("indice " + i + "-->" + aleatoreos[i]);
                        }
                        break;
                    case "C":
                        int mayor = 0;
                        for (int i = 0; i < aleatoreos.length; i++) {
                            if (aleatoreos[i] > mayor) {
                                mayor = aleatoreos[i];
                            }
                        }
                        System.out.println("\n El tiempo mayor corresponde a: " + mayor);
                        break;
                    case "D":
                        double suma = 0;
                        for (int i = 0; i < aleatoreos.length; i++) {
                            suma = suma + aleatoreos[i];
                        }
                        System.out.println("\n La suma de los valores del array es: " + suma);
                        break;
                }
                System.out.print("\nDeseas continuar con el programa?? (s/n):");
                opcion = sc.next().toLowerCase();
            } while (opcion.equals("s"));

        } catch (Exception e) {
            System.out.println("Ingreso de datos erroneos");
        }

    }

    static String mostrarMenu() {;
        String menu;
        System.out.println("===== MENU =====");
        System.out.println("A.- asignar randomicos");
        System.out.println("B.- mostrar datos");
        System.out.println("C.- # mayor");
        System.out.println("D.- suma");
        System.out.println("Seleccione una opcion: ");
        menu = sc.next().toUpperCase();
        return menu;
    }
}
