/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_shiao_roberto;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
public class Shiao_Roberto {

    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#.00");

    public static void main(String[] args) {
        String opcion;

        try {

            do {
                String menu = mostrarMenu().toUpperCase();
                switch (menu) {
                    case "A":
                        System.out.println("\nEJERCICIO LITERAL A\n");
                        int cant = 0;
                        int tamanio,
                         suma1 = 0;
                        int[] datos,
                         datosMul3;
                        System.out.print("Ingrese el tamaño del arreglo: ");
                        tamanio = sc.nextInt();
                        datos = new int[tamanio];
                        datosMul3 = new int[tamanio];
                        for (int i = 0; i < datos.length; i++) {
                            datos[i] = (int) (Math.random() * (100 - 25 + 1) + 25);
                            System.out.println("Ingreso de dato " + (i + 1) + "--> " + datos[i]);
                            if (datos[i] % 3 == 0) {
                                datosMul3[cant] = datos[i];
                                cant++;
                            }
                        }
                        System.out.println(" ");
                        System.out.println("Cantidad datos múltiplos de tres --> " + cant);
                        for (int i = 0; i < cant; i++) {
                            System.out.println("Los números múltiplos de 3 son:" + datosMul3[i]);
                            suma1 = suma1 + datosMul3[i];
                        }
                        System.out.println("Suma de datos múltiplos de 3 --> " + suma1);

                        break;
                    case "B":
                        System.out.println("\nEJERCICIO LITERAL C\n");
                        int cant1 = 0,
                         cant2 = 0;
                        int tamanio1;
                        int[] datos1,
                         numerosN;
                        String nom;
                        System.out.print("Nombre de la materia: ");
                        sc.nextLine();
                        nom = sc.nextLine();
                        System.out.print("Ingrese el tamaño del arreglo: ");
                        tamanio1 = sc.nextInt();
                        datos1 = new int[tamanio1];
                        numerosN = new int[tamanio1];

                        for (int i = 0; i < datos1.length; i++) {
                            do {
                                System.out.print("Valor " + (i + 1) + " -->");
                                datos1[i] = sc.nextInt();
                            } while (datos1[i] > 100 || datos1[i] < -30);

                            if (datos1[i] > 0) {
                                cant1++;
                            }
                            if (datos1[i] < 0) {
                                numerosN[cant2] = datos1[i];
                                cant2++;
                            }
                        }
                        System.out.println(" ");
                        System.out.println("Nombre de la materia: " + nom);
                        System.out.println("Cantidad números positivos --> " + cant1);
                        System.out.println("Cantidad de números negativos --> " + cant2);
                        for (int i = 0; i < cant2; i++) {
                            System.out.println("Numeros negativos almacenados: " + numerosN[i]);
                        }

                        break;
                    case "C":
                        System.out.println("\nEJERCICIO LITERAL D\n");
                        int f,
                         c;
                        double suma = 0,
                         promedio;
                        double numeros[][];
                        System.out.print("Ingrese el # de filas: ");
                        f = sc.nextInt();
                        System.out.print("Ingrese el # de columnas: ");
                        c = sc.nextInt();
                        numeros = new double[f][c];

                        for (int i = 0; i < numeros.length; i++) {
                            for (int j = 0; j < numeros[i].length; j++) {
                                numeros[i][j] = (Math.random() * ((50 - 10 + 1) + 10));
                                System.out.println("Index [" + i + "][" + j + "] -->" + df.format(numeros[i][j]));
                            }
                        }
                        System.out.println(" ");
                        mostrarMatriz(numeros);
                        double mayor = 0;
                        for (int i = 0; i < numeros.length; i++) {
                            for (int j = 0; j < numeros[i].length; j++) {
                                if (numeros[i][j] > mayor) {
                                    mayor = numeros[i][j];
                                }
                            }
                        }
                        for (int i = 0; i < numeros.length; i++) {
                            for (int j = 0; j < numeros[i].length; j++) {
                                suma = suma + numeros[i][j];
                            }
                        }
                        System.out.println(" ");
                        promedio = suma / numeros.length;
                        System.out.println("\nEl mayor numero de la matriz es: " + df.format(mayor));
                        System.out.println("\nEl promedio de los elementos de la matriz: " + df.format(promedio));
                        break;
                }
                System.out.print("\nDeseas continuar con el programa?? (s/n):");
                opcion = sc.next().toLowerCase();
            } while (opcion.equals("s"));

        } catch (Exception ex) {
            System.out.println("\n\t\t\tADVERTENCIA");
            System.out.println("\n\t\t¡¡¡¡ Datos incorrectos !!!!");
            System.out.println(ex.toString());
        } finally {
            System.out.println("\n\t\tEL PROGRAMA A FINALIZADO");
        }

    }

    static String mostrarMenu() {;
        String menu;
        System.out.println("|========== MENU ========|");
        System.out.println("|A.- EJERCICIO LITERAL A |");
        System.out.println("|B.- EJERCICIO LITERAL C |");
        System.out.println("|C.- EJERCICIO LITERAL D |");
        System.out.println("|========================|");
        System.out.print("Seleccione una opcion: ");
        menu = sc.next().toUpperCase();
        return menu;
    }

    static void mostrarMatriz(double opciones[][]) {

        for (int i = 0; i < opciones.length; i++) {
            for (int j = 0; j < opciones[i].length; j++) {
                System.out.print(df.format(opciones[i][j]) + " | ");
            }
            System.out.println("");
        }
    }
}
