/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6_recursividad;

import java.util.Scanner;

/**
 *
 * @author AYED
 */
public class Shiao_Roberto {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion, menu, numero = 0;

        try {
            do {
                mostrar_menu();
                do {
                    System.out.print("\nSelecciona una opcion: ");
                    menu = sc.nextInt();
                } while (menu > 10);

                // VALIDAD OPCIONES CORRECTAS DEL MENU(1y2) --WHILE --DO WHILE
                // VALIDAD OPCIONES CORRECTAS DEL MENU(3 - 6) --WHILE --DO WHILE
                switch (menu) {
                    case 1:
                        System.out.println("\nEJERCICIO SIN RECURSIVIDAD");
                        do {
                            System.out.print("Ingresa el valor a calcular del factorial : ");
                            numero = sc.nextInt();
                        } while (numero < 0);
                        int resultado = mostrarFactorial_Bucles(numero);
                        System.out.println("Factorial con Bucle: " + resultado);
                        break;
                    case 2:
                        System.out.println("\nEJERCICIO CON RECURSIVIDAD");
                        do {
                            System.out.print("Ingresa el valor a calcular del factorial : ");
                            numero = sc.nextInt();
                        } while (numero < 0);
                        System.out.println("Recursividad " + mostrtrarFactorial_Recursivo(numero));
                        break;
                    case 3:
                        System.out.println("\nImpresion array con bucles");
                        //Declarar e instanciar el array
                        //int numero, arreglos y matrices en plural numero
                        int numeros[] = {7, 8, 3, 2, 5, 1};
                        mostrar_array_bucles(numeros);

                        break;
                    case 4:
                        System.out.println("\nImpresion array recursivo");
                        double numerosDobles[] = {7.2, 8.4, 3.5, 2.6, 5.4, 1.3};
                        mostrar_array_recursivo(numerosDobles, 0);//envio al array y la posicion de inicioi

                        break;
                    case 5:
                        System.out.println("\nImpresion matriz con bucles");
                        int numerosMatriz[][] = {{5, 8, 6}, {4, 3, 1}, {8, 7, 9}};//matriz 3x3
                        recorrer_matriz_bucles(numerosMatriz, 0, 0);

                        break;
                    case 6:
                        System.out.println("\nImpresion matriz recursivo");
                        int numerosRecursivos[][] = {{5, 8, 6, 8}, {4, 3, 1, 5}, {8, 7, 9, 5}}; //matriz3x4
                        recorrer_matriz_recursivo(numerosRecursivos, 0, 0);
                        break;
                    case 7:
                        do {
                            System.out.print("Introduce numero mayor que 1: ");
                            numero = sc.nextInt();
                        } while (numero < 0);
                        System.out.println("\nFibonacci bucles");
                        System.out.println("\nLos " + numero + " términos de la serie de Fibonacci son:");
                        mostrar_fibonacci_bucles(numero);
                        break;
                    case 8:
                        System.out.println("\nFibonacci recursivo");
                        int num;
                        System.out.print("Posicion del # de fibonacci a conocer: ");
                        num = sc.nextInt();
                        System.out.println("\nLa " + num + " posicion tiene el #: " + mostrar_fibonacci_recursivo(num));
                        break;
                    case 9:
                        System.out.println("\nAkerman recursivo");
                        int n,
                         m;
                        System.out.print("Ingrese el valor de n: ");
                        n = sc.nextInt();
                        System.out.print("Ingrese el valor de m: ");
                        m = sc.nextInt();
                        System.out.println(mostrar_ackerman(n, m));
                        break;
                    case 10:
                        System.out.println("\nPar o Impar (cruzada)");
                        int array[] = {5, 6, 4, 5, 6, 8, 3};
                        System.out.println("\nEL ARRAY A VERIFICAR ES");
                        for (int i = 0; i < array.length; i++) {
                            System.out.print(array[i] + " | ");
                            
                        }
                        System.out.println("\nVERIFICACION DE PARES");
                        for (int i = 0; i < array.length; i++) {
                            System.out.println("["+array[i]+"] --> " + par(array[i]));
                        }
                        System.out.println("\nVERIFICACION DE IMPARES");
                        for (int i = 0; i < array.length; i++) {
                            System.out.println("["+array[i]+"] --> " + impar(array[i]));
                        }
                        break;
                    default:
                        System.out.println("Opcion no valida !!!");

                }

                System.out.println("\nDeseas ejecutar nuevamente el programa? 1.SI ");
                opcion = sc.nextInt();
            } while (opcion == 1);
        } catch (Exception ex) {
            System.out.println("Error de ejecuccion : " + ex.getMessage());
        } finally {
            System.out.println("Porgrama dinalizado !!!");
        }

    }

    static void mostrar_menu() {
        System.out.println("\t|============ M E N U ==========|");
        System.out.println("\t| 1. Factorial con bucles       |");
        System.out.println("\t| 2. Factorial con recursividad |");
        System.out.println("\t| 3. Impresion array con bucles |");
        System.out.println("\t| 4. Impresion array recursivo  |");
        System.out.println("\t| 5. Impresion matriz con bucles|");
        System.out.println("\t| 6. Impresion matriz recursivo |");
        System.out.println("\t| 7. Fibonacci bucles            |"); //falta RETO
        System.out.println("\t| 8. Fibonacci recursivo         |");
        System.out.println("\t| 9. Akerman recursivo          |");
        System.out.println("\t| 10. Par o Impar (cruzada)     |");//ARRAY
        System.out.println("\t|===============================|");

    }

    static int mostrarFactorial_Bucles(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    static int mostrtrarFactorial_Recursivo(int n) {
        int resultado;
        //caso trivial
        if (n == 1) { // n== 0 return 0
            return 1;
        } else {
            resultado = n * mostrtrarFactorial_Recursivo(n - 1);
        }
        return resultado;
    }

    static void mostrar_array_bucles(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + "-->" + array[i]);
        }
    }

    static void mostrar_array_recursivo(double array[], int indice) {//indice debe ser pequeño
        if (indice == (array.length - 1)) {// caso trivial cunando no hay datos que recorrer
            System.out.println(array[indice]);
        } else {
            System.out.println(array[indice]);
            mostrar_array_recursivo(array, indice + 1);
        }
    }

    static void recorrer_matriz_bucles(int matriz[][], int i, int j) {
        //completar
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("");
        }
    }

    static void recorrer_matriz_recursivo(int matriz[][], int i, int j) { //datos pequeños
        System.out.print(matriz[i][j] + " | ");
        if (i != matriz.length - 1 || j != matriz[i].length - 1) {
            if (j == matriz[i].length - 1) {
                i++;
                j = 0;
                System.out.println(" ");
            } else {
                j++;
            }
            recorrer_matriz_recursivo(matriz, i, j);
        }
    }

    static void mostrar_fibonacci_bucles(int n) {
        int fibo1 = 0, fibo2 = 1, i;

        System.out.print(fibo1 + " ");
        for (i = 2; i <= n; i++) {
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
            
        }
        System.out.println();
    }

    static int mostrar_fibonacci_recursivo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return mostrar_fibonacci_recursivo(n - 1) + mostrar_fibonacci_recursivo(n - 2);
        }
    }

    static int mostrar_ackerman(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        if (n == 0) {
            return mostrar_ackerman(m - 1, 1);
        } else {
            return mostrar_ackerman(m - 1, mostrar_ackerman(m, n - 1));
        }

    }

    static boolean par(int n) {
        if (n == 0) {
            return true;
        } else {
            return impar(n - 1);
        }
    }

    static boolean impar(int n) {
        if (n == 0) {
            return false;
        } else {
            return par(n - 1);
        }
    }

}
