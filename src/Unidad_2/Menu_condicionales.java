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
public class Menu_condicionales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0, dato;
        double lado, a, b, h, perimetro, apotema;

        while (opcion != 4) {
            System.out.println("\n    *** MENU ESTRUCTURADO CON SENTENCIAS SWITCH *** ");
            System.out.println();
            System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
            System.out.println("| 1 - Numeros (pares / impares)                          |");
            System.out.println("| 2 - Estacion del año                                   |");
            System.out.println("| 3 - Submenu (calculadora areas de figuras geometricas) |");
            System.out.println("| 4 -               SALIR                                |");
            System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
            System.out.print("\n Selecciona una de las opciones disponibles (1-3): ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n\tOPCION 1: Numeros (pares / impares)");
                    System.out.print("\nIngrese un valor para la comparacion: ");
                    dato = sc.nextInt();
                    if (dato >= 0) {
                        if (dato % 2 == 0) {
                            System.out.println("El valor ingresado(" + dato + ") es PAR");
                        } else {
                            System.out.println("El valor ingresado(" + dato + ") es IMPAR");
                        }
                    } else {
                        System.out.println("\nVALOR INGRESADO ES INCORRECTO");
                    }
                    break;
                case 2:
                    System.out.println("\n\t\tOPCION 2: Estacion del año");
                    System.out.print("\nIngrese el numero del mes del año: ");
                    dato = sc.nextInt();
                    switch (dato) {
                        case 1:
                        case 2:
                        case 3:
                            System.out.println("INVIERNO");
                            break;
                        case 4:
                        case 5:
                        case 6:
                            System.out.println("VERANO");
                            break;
                        case 7:
                        case 8:
                        case 9:
                            System.out.println("OTOÑO");
                            break;
                        case 10:
                        case 11:
                        case 12:
                            System.out.println("PRIMAVERA");
                            break;
                        default:
                            System.out.println("DATO INCORECTO!!!!!, PORFAVOR INGRESE UN VALOR DEL 1 -12");
                            break;
                    }
                    break;
                case 3:
                    opcion = 0;
                    while (opcion != 4) {
                        System.out.println("\n\t\t\tSUBMENU\n\t(Calculadora areas de figuras geometricas)");
                        System.out.println();
                        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
                        System.out.println("| 1 - Area del cuadrado    |");
                        System.out.println("| 2 - Area del triangulo   |");
                        System.out.println("| 3 - Area del poligono    |");
                        System.out.println("| 4 -     SALIR            |");
                        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
                        System.out.print("\n Selecciona una de las opciones disponibles (1-3): ");
                        opcion = sc.nextInt();
                        if (opcion > 5) {
                            System.out.println("¡¡¡ADVERTENCIA: EL VALOR INGRESADO NO ESTA EN EL RANGO!!!");
                        }
                        switch (opcion) {
                            case 1:
                                System.out.println("\n\t\tCalcular el area del cuadrado");
                                System.out.print("\nIngrese el valor del lado: ");
                                lado = sc.nextDouble();
                                System.out.println("\nEL valor del area es de: " + Math.pow(lado, 2));
                                break;
                            case 2:
                                System.out.println("\n\t\tCalcular el area del trapecio");
                                System.out.print("\nIngrese el valor de a: ");
                                a = sc.nextDouble();
                                System.out.print("\nIngrese el valor de b: ");
                                b = sc.nextDouble();
                                System.out.print("\nIngrese el valor de h: ");
                                h = sc.nextDouble();
                                double areaTrapecio = (((a + b) / 2) * h);
                                System.out.println("\nEL valor del area es de: " + areaTrapecio);
                                break;
                            case 3:
                                System.out.println("\n\t\tCalcular el area del poligono");
                                System.out.print("\nIngrese el valor del perimetro: ");
                                perimetro = sc.nextDouble();
                                System.out.print("\nIngrese el valor del apotema: ");
                                apotema = sc.nextDouble();
                                double areaPoligono = ((perimetro * apotema) / 2);
                                System.out.println("\nEl valor del area es de: " + areaPoligono);
                                break;
                            default:
                                System.out.println("\nREGRESANDO......");
                                break;
                        } // cierra switch 

                    }// cierra while 
                    opcion = 0;
                    break;
                
            }

        }

    }

}
