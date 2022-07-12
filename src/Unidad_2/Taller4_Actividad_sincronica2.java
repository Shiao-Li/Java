/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad_2;

import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
public class Taller4_Actividad_sincronica2 {
    public static void main(String[] args) {
        int opcion;
        String op;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
            System.out.println("| 1 - Do while numeros apartir del 2                     |");
            System.out.println("| 2 - numeros del 80 al 40 for                           |");
            System.out.println("| 3 - comntador hasta el 7                               |");
            System.out.println("| 4 - sumar 3 numeros for                                |");
            System.out.println("| 5 - multiplos del 5                                    |");
            System.out.println("| 6 - tablas de multiplicas while                        |");
            System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
            System.out.print("\n Selecciona una de las opciones disponibles (1-6): ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    int num1;
                    int i = 2;
                    System.out.print("Hasta que numero quiere que se imprima: ");
                    num1 = sc.nextInt();

                    do {
                        System.out.println(i);
                        i += 3;
                        
                    } while (i <= num1);
                    System.out.println("\nNumeros del 1 al " + num1 + ": " +i);
                    break;
                case 2:
                    System.out.println("\n *** USO DE FOR");
                    
                    for (int inicio = 80; inicio >= 44; inicio -= 5) {
                        System.out.println("decremento " +inicio);
                    }

                    break;
                case 3:
                    int contadorinicial,
                     contadorfinal;
                    do {
                        System.out.println("El valor del contador inicial no debe ser mayor o igual al contador final");
                        System.out.print("Ingrese el valor del contador inicial:");
                        contadorinicial = sc.nextInt();
                        System.out.print("Ingrese el valor del contador final:");
                        contadorfinal = sc.nextInt();
                    } while (contadorfinal <= contadorinicial);
                    int contador = contadorinicial;
                    System.out.println("\tImpresion n de n meros: ");
                    do {
                        if (contador == 7) {
                            System.out.println(contador);
                            break;
                        }
                        System.out.println(contador);
                        contador++;
                    } while (contadorinicial <= contadorfinal);

                    break;
                case 4:
                    int numero,suma = 0;
                    for (int ii = 1; ii <= 3; ii++) {
                        do {
                            System.out.print("Ingrese un numero mayor a 0: ");
                            numero = sc.nextInt();
                        } while (numero <= 0);
                        suma = numero + suma;
                    }
                    int residuo = suma % 3;
                    System.out.println("Suma de los 3 numeros ingresados: " + suma);
                    System.out.println("Residuo de 3: " + residuo);

                    break;
                case 5:
                    int contadorr = 0;
                    System.out.println("Multiplos de 5:");
                    do {
                        if (contadorr % 5 == 0) {
                            System.out.println(contadorr);
                        }
                        contadorr++;
                    } while (contadorr <= 23);

                    break;
                case 6:
                    int ii = 1;
                    int numm1 = 0, numm2 = 0, tabla = 0;
                    do {
                        System.out.print("Ingrese el primer numero: ");
                        numm1 = sc.nextInt();
                    } while (numm1 < 1 || numm1 > 20);
                    do {
                        System.out.print("Ingrese el segundo numero: ");
                        numm2 = sc.nextInt();
                    } while (numm2 < 1 || numm2 > 16);
                    
                    while (ii <= numm2) {
                        ii++;
                        tabla = numm1 * ii;
                        System.out.println(numm1 + " * " + ii + " = " + tabla);
                    }
                    break;
            }

            System.out.println("Deseas continuar con el programa?? (s/n)");
            op = sc.next().toLowerCase();
        } while (op.equals("s"));
    }
}
