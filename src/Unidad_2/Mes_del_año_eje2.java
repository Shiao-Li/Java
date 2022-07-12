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
public class Mes_del_año_eje2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;
        System.out.print("Ingrese el mes del año (rango 1 - 12)");
        mes = sc.nextInt();

        if (mes >= 1 && mes <= 12) {
            if (mes == 1) {
                System.out.println("El numero ingresado(" + mes + ") corresponde a ENERO");
            } else if (mes == 2) {
                System.out.println("El numero ingresado(" + mes + ") corresponde a FEBRERO");
            }
            if (mes == 3) {
                System.out.println("El numero ingresado(" + mes + ") corresponde a MARZO");
            } else if (mes == 4) {
                System.out.println("El numero ingresado(" + mes + ") corresponde a ABRIL");
            }
            if (mes == 5) {
                System.out.println("El numero ingresado(" + mes + ") corresponde a MAYO");
            } else if (mes == 6) {
                System.out.println("El numero ingresado(" + mes + ") corresponde a JUNIO");
            }
            if (mes == 7) {
                System.out.println("El numero ingresado(" + mes + ") corresponde a JULIO");
            } else if (mes == 8) {
                System.out.println("El numero ingresado(" + mes + ") corresponde a AGOSTO");
            }
            if (mes == 9) {
                System.out.println("El numero ingresado(" + mes + ") corresponde a SEPTIEMBRE");
            } else if (mes == 10) {
                System.out.println("El numero ingresado(" + mes + ") corresponde a OCTUBRE");
            }
            if (mes == 11) {
                System.out.println("El numero ingresado(" + mes + ") corresponde a NOVIEMBRE");
            } else if (mes == 12) {
                System.out.println("El numero ingresado(" + mes + ") corresponde a DICIEMBRE");
            }
        } else {
            System.out.println("ADVERTENCIA: EL NUMERO NO SE ECUENTRA EN EL RANGO");
        }

    }
}
