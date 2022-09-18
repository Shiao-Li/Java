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
public class Tarea1_eje3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.000");
        
        double valor_prod, valor_des;
        String producto;
        final Double IVA = 0.12;
        
        System.out.println("*** BIENVENIDO AL SUPERMERCADO RS ***");
        
        System.out.print("\nIngrese el nombre del producto: ");
        producto = sc.nextLine();
        System.out.print("Ingrese el valor de producto: ");
        valor_prod = sc.nextDouble();
        System.out.print("Ingrese el porcentaje de descuento del producto: ");
        valor_des = sc.nextDouble();
        System.out.println("\n================ PROCESANDO SU FACTURA ================");
        System.out.println("\n** Nombre del producto: " + producto);
        System.out.println("*** Valor del producto: " + valor_prod);
        
        double valor_iva = valor_prod * IVA;
        System.out.println("**** IVA a pagar: " + df.format(valor_iva));
        double subtotal = valor_iva + valor_prod;
        System.out.println("***** Subtotal: " + subtotal);
        double descuento = (subtotal*valor_des)/100;
        System.out.println("****** Su descuento es de: " + df.format(descuento));
        double total = subtotal - descuento;
        System.out.println("******* El total a pagas es: " + df.format(total));
                System.out.println("\n==================================================");
        System.out.println("\t\t ¡¡VUELVE PRONTO!!");
        
        
    }
    
}
