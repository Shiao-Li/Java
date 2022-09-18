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
public class taller3_bucles_arreglos {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int[] datos = null;
        int opcion = 0, menu, tamanio;
        int pares = 0, impares = 0;

        try {
            do {
                mostrar_menu();
                System.out.print("Seleccione una de las opciones: ");
                menu = sc.nextInt();

                switch (menu) {
                    case 1:
                        System.out.println("Selecionaste ejercicio 1 arreglo par e impar");
                        System.out.print("Ingrese el tamaño del arreglo: ");
                        tamanio = sc.nextInt();
                        datos = new int[tamanio];

                        System.out.println("Ingreso de datos del arreglo: ");
                        for (int i = 0; i < datos.length; i++) {
                            System.out.print("Index " + i + " elemento: ");
                            datos[i] = sc.nextInt();

                            if (datos[i] % 2 == 0) {
                                pares++;
                            } else {
                                impares++;
                            }
                        }

                        int par[] = new int[pares];
                        int impar[] = new int[impares];

                        pares = 0;
                        impares = 0;
                        for (int i = 0; i < datos.length; i++) {
                            if (datos[i] % 2 == 0) {
                                par[pares] = datos[i];
                                pares++;
                            } else {
                                impar[impares] = datos[i];
                                impares++;
                            }
                        }
                        System.out.println("\nArreglo pares: ");
                        for (int i = 0; i < pares; i++) {
                            System.out.println(par[i]);
                        }
                        System.out.println("\nArreglo impares: ");
                        for (int i = 0; i < impares; i++) {
                            System.out.println(impar[i]);
                        }
                        break;

                    case 2:
                        System.out.println("Seleccionaste ejercicio 2 arreglo aleatorio");
                        System.out.println("Ingreso de datos del arreglo");
                        for (int i = 0; i < datos.length; i++) {
                            System.out.print("Index " + i + " elemento: ");
                            datos[i] = sc.nextInt();
                        }
                        break;

                    case 3:
                        System.out.println("Seleccionaste ejercicio 3 posicion invertida ");
                        int[] valores = {1, 2, 3, 4, 5};
                        int resultado[] = new int[valores.length];
                        int j = 0; //represt la posicion del arreglo actual

                        for (int i = valores.length - 1; i >= 0; i--) {
                            resultado[j] = valores[i];
                            j++;
                        }
                        break;

                    default:
                        System.out.println("Opcion no disponible!!!!!");
                }

                System.out.println("Desea ejecutar otra vez el programa? 1.SI");
                opcion = sc.nextInt();

            } while (opcion == 1);

        } catch (Exception ex) {
            System.out.println("Datos incorrectos" + ex.toString());
        }
    }

    static void mostrar_menu() {
        System.out.println("*** MENÚ ***");
        System.out.println("1. Arreglo par e impar");
        System.out.println("2. Arreglo con numeros aleatorios ");
        System.out.println("3. Arreglo con 5 posiciones invertidas");
    }
}
