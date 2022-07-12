/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad_1;

import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
public class Taller3_eje2 {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        double lado, apotema, perimetro;
        System.out.print("INGRESE EL NUMERO DE L: ");
        lado = cs.nextDouble();

        apotema = ((Math.sqrt(3) * lado) / 6);
        perimetro = apotema * 6 * Math.sqrt(3);
        System.out.println("EL APOTEMA ES: " + apotema);
        System.out.println("EL PERTIMETRO ES: " + perimetro);
    }
}
