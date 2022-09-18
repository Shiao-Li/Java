/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4_matrices;

import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
public class Shiao_Roberto {

    static Scanner sc = new Scanner(System.in);
    static int numeros2[][] = new int[4][4];
    static int contador = 0;
    static int file[] = new int[16];
    static int colum[] = new int[16];
    static int busqueda;

    public static void main(String[] args) {
        String op;
        int casos;

        try {
            do {
                casos = mostrarMenu();
                switch (casos) {
                    case 1:
                        System.out.println("\n\t\t1 - Matriz nxm");
                        int fila,
                         columna,
                         inicio,
                         fin;
                        int numerosEje1[][];
                        System.out.print("Ingrese el # de filas: ");
                        fila = sc.nextInt();
                        System.out.print("Ingrese el # de columnas: ");
                        columna = sc.nextInt();

                        numerosEje1 = new int[fila][columna];

                        System.out.println("\n\tAsignacion del rango de los randomicos");
                        System.out.print("Ingrese el inicio del randomico:  ");
                        inicio = sc.nextInt();
                        System.out.print("Ingrese el limite del randomico:  ");
                        fin = sc.nextInt();
                        for (int k = 0; k < numerosEje1.length; k++) {
                            for (int j = 0; j < numerosEje1[k].length; j++) {
                                numerosEje1[k][j] = (int) (Math.random() * (fin - inicio + 1) + inicio);
                                System.out.println("Index [" + k + "][" + j + "] -->" + numerosEje1[k][j]);
                            }
                        }
                        mostrarMatrizEje1(numerosEje1);

                        break;
                    case 2:
                        System.out.println("\n\t2 - Matriz 3x3 con numeros del 1 al 9\n");
                        mostrarEjer2();
                        break;
                    case 3:
                        System.out.println("\n\t\t3 - Matriz de dimension 4");
                        mostrarMatrizRand_Eje3();
                        buscarNumero();
                        encontrarNumero();

                        break;
                    default:
                        System.out.println("°° EL NUMERO INGRESADO NO ESTA EN EL RANGO DE OPCIONES °°");

                }
                System.out.print("\nDeseas continuar con el programa?? (s/n):");
                op = sc.next().toLowerCase();
            } while (op.equals("s"));

        } catch (Exception ex) {
            System.out.println("\n\t\t\tADVERTENCIA" + ex.toString());
            System.out.println("\n\t\t¡¡¡¡ Datos incorrectos !!!!");
        } finally {
            System.out.println("\n\t\tEl programa a finalizado");
        }//Fin control de error
    }

    static int mostrarMenu() {
        int opcion;
        System.out.println("|==============   MENU   ===============|");
        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.println("| 1 - Matriz nxm                        |");
        System.out.println("| 2 - Matriz 3x3 con numeros del 1 al 9 |");
        System.out.println("| 3 - Matriz de dimension 4             |");
        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.print("\n Selecciona una de las opciones disponibles (1-3): ");
        opcion = sc.nextInt();
        return opcion;
    }// fin funcion menu
    //funcion ejercicio 1

    static void mostrarMatrizEje1(int numeros[][]) {
        for (int filas = 0; filas < numeros.length; filas++) {
            for (int columnas = 0; columnas < numeros[filas].length; columnas++) {
                System.out.print(numeros[filas][columnas] + " | ");
            }
            System.out.println("");
        }
    }

    //funcion ejercicio 2
    static void mostrarEjer2() {
        int numeros[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //imprime la mtriz
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " | ");
            }
            System.out.println("");
        }
    }

    //funcion ejercicio 3
    static void mostrarMatrizRand_Eje3(){
        int inicio = 20, fin = 30;
        System.out.println("\nMatriz con randomicos del 20 al 30\n");
        for (int i = 0; i < numeros2.length; i++) {
            for (int j = 0; j < numeros2.length; j++) {
                numeros2[i][j] = (int) (Math.random() * (fin - inicio + 1) + inicio);
                System.out.print(numeros2[i][j] + " | ");
            }
            System.out.println("");
        }
    }
    
    static void buscarNumero() {
        System.out.print("Numero a buscar: ");
        busqueda = sc.nextInt();
        
        for (int fila = 0; fila < numeros2.length; fila++) {
            for (int columna = 0; columna < numeros2[fila].length; columna++) {
                if (numeros2[fila][columna] == busqueda) {
                    file[contador] = fila + 1;
                    colum[contador] = columna + 1;
                    contador++;
                }
            }
        }
    }

    static void encontrarNumero() {
        if (contador > 0) {
            System.out.println("\tEl elemento fue encontrado en\n");
            for (int i = 0; i < contador; i++) {
                System.out.println("fila / columna");
                System.out.println("[" + file[i] + "] [" + colum[i] + "]");
            }
        } else {
            System.out.println( "El # "+ busqueda + " NO SE ENCONTRO." );
        }
    }
}
