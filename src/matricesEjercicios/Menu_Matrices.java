/*
 REVISAR EN LA CLASE VIRTUAL DE MATRICES ESTE EJERCICIO SE DEBE COMPLETAR 
 */
package matricesEjercicios;

import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
public class Menu_Matrices {

    static int f, c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opciones[][] = {};
        int menu, fila, columna, suma = 0, op;
        double promedio;
        
        try {
            do {
                mostrarMenu();
                System.out.print("Seleccione una de las opciones del menu: ");
                menu = sc.nextInt();

                switch (menu) {

                    case 1:
                        System.out.println("\n1. Rellenar matriz");

                        System.out.print("Ingrese el # de filas: ");
                        f = sc.nextInt();
                        System.out.print("Ingrese el # de columnas: ");
                        c = sc.nextInt();
                        opciones = new int[f][c];

                        for (int i = 0; i < opciones.length; i++) {
                            for (int j = 0; j < opciones[i].length; j++) {
                                System.out.print("Index [" + i + "][" + j + "] -->");
                                opciones[i][j] = sc.nextInt();
                            }
                        }
                        break;
                    case 2:
                        //COMPLETAR USANDO FUNCIONES
                        System.out.println("\n2. Suma de filas");

                        mostrarMatriz(opciones);
                        System.out.println("Ingrese el # de fila a sumar [0-" + f + "]: ");
                        fila = sc.nextInt();
                        while (fila < 0 || fila > f) {
                            System.out.println("Indice invalido, solo se permiten indices entre 0-" + f);
                            System.out.println("Ingrese el # de fila a sumar [0-" + f + "]: ");
                            fila = sc.nextInt();
                        }

                        for (int i = 0; i < opciones.length; i++) {
                            for (int j = 0; j < opciones[i].length; j++) {
                                if (fila == i) {
                                    suma = suma + opciones[i][j];
                                }
                            }
                        }
                        System.out.println("\nLa sumatoria de la fila (" + fila + ") es: " + suma);
                        break;

                    case 3:
                        System.out.println("\n3. Sumar de columnas");
                        //COMPLETAR CON UNA FUNCION

                        mostrarMatriz(opciones);
                        System.out.println("Ingrese el # de la columna a sumar [0-" + c + "]: ");
                        columna = sc.nextInt();
                        while (columna < 0 || columna > c) {
                            System.out.println("Indice invalido, se permiten indices entre 0-" + c);
                            System.out.println("Ingrese el # de la columna a sumar [0-" + c + "]: ");
                            columna = sc.nextInt();
                        }
                        for (int i = 0; i < opciones.length; i++) {
                            for (int j = 0; j < opciones[i].length; j++) {
                                if (columna == j) {
                                    suma = suma + opciones[i][j];
                                }
                            }
                        }
                        System.out.println("\nLa sumatoria de la columna (" + columna + ") es " + suma);

                        break;
                    case 4:
                        System.out.println("\n4. Promedio de la matrices");
                        //COMPLETAR CON UNA FUNCION

                        mostrarMatriz(opciones);
                        for (int i = 0; i < opciones.length; i++) {
                            for (int j = 0; j < opciones[i].length; j++) {
                                suma = suma + opciones[i][j];
                            }
                        }
                        promedio = suma / (opciones.length * opciones.length);
                        System.out.println("\nEl promedio de los elementos de la atriz es " + promedio);

                        break;
                    default:
                        System.out.println("Opcion no disponible!!!!!");
                        break;
                }
                System.out.println("Desea continuar con el programa 1.SI");
                op = sc.nextInt();
            } while (op == 1);

        } catch (Exception ex) {
            System.out.println("Excepcion " + ex.toString());
        } finally {
            System.out.println("\nEl programa a finalizado");
        }
    }

    static void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("1. Rellenar matriz");
        System.out.println("2. Suma de filas");
        System.out.println("3. Suma de columna");
        System.out.println("4. Promedio de la matrices");
    }

    static void mostrarMatriz(int opciones[][]) {

        for (int i = 0; i < opciones.length; i++) {
            for (int j = 0; j < opciones[i].length; j++) {
                System.out.print(opciones[i][j] + " | ");
            }
            System.out.println("");
        }
    }
}
