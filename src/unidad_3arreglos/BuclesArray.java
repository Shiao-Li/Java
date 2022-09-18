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
public class BuclesArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu, opcion;
        int numeros[] = new int[5];

        try {
            do {

                mostrarMenu();
                System.out.print("Seleccione una de las opciones del menu: ");
                menu = sc.nextInt();

                switch (menu) {
                    case 1:
                        System.out.println("\n1. ingreso de datos en el arreglo");
                        for (int i = 0; i < numeros.length; i++) {
                            System.out.print("Ingrese el elemento de la posicion " + i + " : ");
                            numeros[i] = sc.nextInt();
                        }
                        break;
                    case 2:
                        System.out.println("\n2. Ipresion del arreglo");
                        imprimir(numeros);
                        break;
                    case 3:
                        System.out.println("\n3. Array invertido");
                        int[] retorno = invertirAray(numeros);
                        imprimir(retorno);
                        break;
                    default:
                        System.out.println("Opcion no disponible!!!!!");
                        break;
                }
                System.out.println("Desea continuar con el programa 1.SI");
                opcion = sc.nextInt();
            } while (opcion == 1);

        } catch (Exception ex) {
            System.out.println("Datos incorrectos" + ex.toString());
        }
    }

    static void mostrarMenu() {
        System.out.println("****MENU****");
        System.out.println("1. Ingreso de datos arreglos");
        System.out.println("2. Mostrar datos arreglos");
        System.out.println("3. Invertir del datos arreglos");
    }

    //eta funcion imprime el arreglo
    static void imprimir(int[] datos) { //aqui estoy poniendo un tipo de dato arreglo
        System.out.println("\nImpresion de elementos del array");
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Posicion del arreglo " + i + "-->" + datos[i]);
        }
    }

    //esta funcion invirte el arreglo
    static int[] invertirAray(int[] datos) { //los corchetes despues del tipo me dice que coy a retornar un arreglo 
        int resultado[] = new int[datos.length];
        int j = 0; //representa la posicion del arreglo actual

        for (int i = datos.length - 1; i >= 0; i--) { //el tamaño es menos 1 porque inicia desde cero
            resultado[j] = datos[i];
            j++;
        }
        return resultado;
    }
}
