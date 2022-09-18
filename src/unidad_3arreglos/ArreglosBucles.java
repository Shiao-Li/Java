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
public class ArreglosBucles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion, menu, tamanio;
        int[] datos; //aqui declaro el arreglo globalmente

        try {//control de erros de ejecucion
            do {//repeticion del programa 
                mostrarMenu();
                System.out.print("\nSeleccione una de las opciones del menu: ");
                menu = sc.nextInt();
                switch (menu) {
                    case 1:
                        System.out.println("\nSelecionaste literal 1");
                        System.out.print("Ingrese el tamaño del arreglo: ");
                        tamanio = sc.nextInt();
                        datos = new int[tamanio];
                        System.out.println("\nIngreso de datos del arreglo");
                        for (int i = 0; i < datos.length; i++) {
                            System.out.print("Posicion o index " + i + " elemento: ");
                            datos[i] = sc.nextInt();
                        }

                        System.out.println("Mostrar datos del arreglo");
                        for (int i = 0; i < datos.length; i++) {
                            System.out.println("Indice " + i + "-->" + datos[i]);
                        }
                        break;
                    case 2:
                        System.out.println("\nSelecionaste literal 2");
                        datos = new int[21];
                        int suma = 0,
                         numero = 1;
                        double media;
                        System.out.println("\nAsignando de datos del arreglo");
                        for (int i = 0; i < datos.length; i++) {
                            datos[i] = numero;
                            numero += 2;
                        }
                        for (int i = 0; i < datos.length; i++) {
                            System.out.print("Posicion o index " + i + " --> "+datos[i]);
                            suma = suma + datos[i];
                        }
                        System.out.println("La suma es: " + suma);
                        System.out.println("La media es: " + (suma / datos.length));
                        break;
                    case 3:
                        System.out.println("\nSelecionaste literal 3");
                        System.out.print("Ingrese el tamaño del arreglo: ");
                        tamanio = sc.nextInt();
                        datos = new int[tamanio];

                        System.out.println("\nIngreso de datos del arreglo");
                        for (int i = 0; i < datos.length; i++) {
                            System.out.print("Posicion o index " + i + " elemento: ");
                            datos[i] = sc.nextInt();
                        }

                        System.out.println("Mostrar los elementos del array");
                        for (int i = 0; i < datos.length; i++) {
                            if (i >= 5 && i <= 8) {
                                continue;
                            }
                            System.out.println("Posicion o index " + i + "-->" + datos[i]);
                            if (i == 10) 
                                break;
                            if(datos[i]==10)
                                break;
                        }
                        break;
                    default:
                        System.out.println("\nOpcion no valida!!!");
                        break;
                }

                System.out.print("\nDesea continuar con el programa 1.SI: ");
                opcion = sc.nextInt();
            } while (opcion == 1);

        } catch (Exception ex) {
            System.out.println("\nIngreso de datos incorrecto " + ex.toString());
        }
    }

    static void mostrarMenu() {
        System.out.println("****MENU****");
        System.out.println("1. Arreglo con valores n");
        System.out.println("2. Arreglo con incrementos");
        System.out.println("3. Uso de continue y break");
    }
}
