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
public class Tarea1_eje2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.000");
        double altura, lado;
        
        System.out.println("*** CALCULADORA APOTEMA DE UNA PIRAMIDE RECTA ***");
        
        System.out.print("\nIngrese la altura(h): ");
        altura = sc.nextDouble();
        System.out.print("Ingrese uno de los lados(l): ");
        lado = sc.nextDouble();
        
        double apotema = (Math.pow(altura, 2))+(Math.pow((lado/2), 2));
        System.out.println("\n***** El apotema es  " + df.format(apotema));
        
        System.out.println("\n************************************************************");
        System.out.println("\t\t ¡¡VUELVE PRONTO!!");
    
    }
}
