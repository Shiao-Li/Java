/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad_1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
public class Taller3_eje3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, nota5;
        final double PORC_1 = 0.30, PORC_2 = 0.20, PORC_3 = 0.15, PORC_4 = 0.10, PORC_5 = 0.25;

        System.out.println("*** CALCULADORA DE PROMEDIO EN LA MATERIA DE EDD ***");
        System.out.println("\n\t\t¡¡ ATENCION !!");
        System.out.println("Las notas tendran la sigueinte ponderacion");
        System.out.println("Nota 1 --> 30%\nNota 2 --> 20%\nNota 3 --> 15\nNota 2 --> 10%\nNota 2 --> 25%");
        System.out.println("===================================================");
        System.out.println("\t**NOTAS PRIMER PARCIAL**");
        System.out.print("Ingrese su primera nota del parcial: ");
        nota1 = sc.nextDouble();
        System.out.print("Ingrese su segunda nota del parcial: ");
        nota2 = sc.nextDouble();
        System.out.println("\n\tNotas ponderadas 1er parcial");

        double pon1 = nota1 * PORC_1;
        System.out.println("Ponderacion nota 1: " + pon1);
        double pon2 = nota2 * PORC_2;
        System.out.println("Ponderacion nota 2: " + pon2);

        System.out.println("\n\t**NOTAS SEGUNDO PARCIAL**");
        System.out.print("Ingrese su primera nota del parcial: ");
        nota3 = sc.nextDouble();
        System.out.print("Ingrese su segunda nota del parcial: ");
        nota4 = sc.nextDouble();
        System.out.print("Ingrese su tercera nota del parcial: ");
        nota5 = sc.nextDouble();
        System.out.println("\n\tNotas ponderadas 1er parcial");

        double pon3 = nota3 * PORC_3;
        System.out.println("Ponderacion nota 1: " + pon3);
        double pon4 = nota4 * PORC_4;
        System.out.println("Ponderacion nota 2: " + pon4);
        double pon5 = nota5 * PORC_5;
        System.out.println("Ponderacion nota 2: " + pon5);
        System.out.println("===================================================");

        double promedio = pon1 + pon2 + pon3 + pon4 + pon5;
        System.out.println("Su nota en la materia de ESTRUCRURA DE DATOS es: " + promedio);
    }

}
