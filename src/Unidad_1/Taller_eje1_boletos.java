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
public class Taller_eje1_boletos {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        double  valorBoleto,descuento, totalPagar;
        int numBoleto;
        String destino, transporte, cliente, responsables;
        DecimalFormat df=new DecimalFormat("#.00");
        
        System.out.println("\n\t ++++DATOS FACTURACION DEL BOLETO+++");
        System.out.print("INGRESE EL NOMBRE DEL CLIENTE: ");
        cliente = sc.nextLine();
        System.out.print("INGRESE EL NUMERO DE BOLETOS QUE PRESENTA: ");
        numBoleto = sc.nextInt();
        System.out.print("INGRESE EL COSTO DEL BOLETO: ");
        valorBoleto = sc.nextDouble();
        
        System.out.print("INGRESE EL PORCENTAJE DE DESCUENTO: ");
        descuento = sc.nextDouble();
        
        double valor1= valorBoleto * numBoleto;
        double  valorDesc = valor1 * descuento/100;
        totalPagar = valor1-valorDesc;
        System.out.println("\n\t+++++++++Datos del viaje+++++++++ ");
        System.err.print("INGRESE EL LUGAR DE DESTINO: ");
        destino = sc.next();
        System.out.print("INGRESE EL TIPO DE TRANSPORTE: ");
        transporte = sc.next();
        System.out.print("INGRESE EL NOMBRE DEL RESPONSABLE: ");
        responsables = sc.next();
        
        
        //SALIDA
        System.out.println("\n procesando......\t\nprocesando......\t\n............");
        System.out.println("\nINFORMACION DEL VIAJE");
        System.out.println("==================================================");
        System.out.println("Destino : " + destino+"\tTransporte :"+transporte );
        System.out.println("# de boletos : "+ numBoleto+"\tValor del boleto : " +valorBoleto);
        System.out.println("# descuento  :"+descuento+"\tValor descuento : "+valorBoleto);
        
        System.out.println("Valor sin descuento  :"+valor1+"Dólares\n"+"Valor a pagar  : "
                +df.format(totalPagar)+"Dolares");
        
        System.out.println("==================================================");
        System.out.println("Cliente: "+cliente+"\nResponsable: "+responsables);
        
    }
    
}
