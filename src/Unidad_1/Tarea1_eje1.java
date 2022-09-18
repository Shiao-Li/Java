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
public class Tarea1_eje1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.000");
        
        double radio;
        final double PI =3.1416;
        
        System.out.println("*** CALCULADORA DEl AREA Y PERIMETRO DEL CIRCULO ***");
        System.out.print("\nIngrese el valor del radio: ");
        radio = sc.nextDouble();
        
        double area = (Math.PI*Math.pow(radio, 2));
        System.out.println("\n*** El area del circulo es: " + df.format(area));
        double perimetro = (2*PI*radio);
        System.out.println("***** El area del circulo es: " + df.format(perimetro));
        
        System.out.println("\n************************************************************");
        System.out.println("\t\t ¡¡VUELVE PRONTO!!");
    }
}
