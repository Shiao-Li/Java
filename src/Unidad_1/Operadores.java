package Unidad_1;

import java.text.DecimalFormat;

/**
 *
 * @author SHIAO_LITECH
 */
public class Operadores {
    public static void main(String[] args) {
        System.out.println("Ejemplo de Operadores en Java");
        int x = 5;
        int y = 10;
        int z = x++ * y--; //x=6 y=9
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        System.out.println("\n\t PRIORIDAD DE OPERADORES ARITMETICOS"); 
        System.out.println( ((4+5)*(6/3)));
        System.out.println(  (1+2-3*4/5));
        System.out.println( (10%3+6));
        
        System.out.println("\n\t CADENAS");
        System.out.println("1+2=" + (1+2));
        System.out.println(1+2 + " abc ");
        int a=15;
        int b=10;
        int r=a+b;
        System.out.println("RESULTADO: "+ r);
        
        System.out.println("POTENCIA: " + Math.pow(x,2));
        System.out.println("PI con MATH; "+ Math.PI);// PI valor conocido
        final double VALOR_PI = 3.14;
        System.out.println("PI constante: " + VALOR_PI);
        System.out.println("REDONDEO" +Math.round(Math.PI));
        System.out.println("Raiz Cuadrada: "+Math.sqrt(9));
        System.out.println("Raiz Cubica: " + Math.pow(9,0.33));
        
       DecimalFormat blacktide = new DecimalFormat ("#.00");// "#" MUESTRA DATOS CON DOS DECIMALES
        System.out.println("Pi con Formato de dos decimales: "+blacktide.format(Math.PI));
       
    }
    
}

