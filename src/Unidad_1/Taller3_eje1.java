/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad_1;

import java.util.Scanner;

/**
 *  VARIABLES ----> minuscualas 
 *  CONSTANTES ---> MAYUSCULAS
 * @author SHIAO_LITECH
 */

public class Taller3_eje1 {
    public static void main(String[] args) {
     Scanner declaraciones= new Scanner(System.in); 
        
        int hora, dia;
        final int VALOR = 10;
        final int DIA_S = 5;

        System.out.print("INGRESE LAS HORAS TRABAJADAS: ");
        hora = declaraciones.nextInt();
        System.out.print("INGRESE EL NUMERO DE DIAS TRABAJADOS: ");
        dia = declaraciones.nextInt();
        double result = hora * VALOR;
        System.out.println("EL VALOR A PAGAR ES: " + result);
        System.out.println("SEMANA TRABAJADAS APROX: " + dia / DIA_S);
        System.out.println("VALOR QUE RECIBE POR SEMANA: " + result / DIA_S);
    }
}
