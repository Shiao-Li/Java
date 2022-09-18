/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad_2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
public class Promedio_notas_eje3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        String fyh = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        String estudiante = " ", categoria = " ";
        double nota1, nota2, nota3, promedio;

        System.out.print("Ingrese el nombre del estudiante: ");
        estudiante = sc.nextLine();
        //aqui validar
        if (estudiante.equals("roberto")) {
            System.out.print("Ingrese la 1ra calificación: ");
            nota1 = sc.nextDouble();

            if (nota1 >= 1 && nota1 <= 20) {
                System.out.print("Ingrese la 2da calificación: ");
                nota2 = sc.nextDouble();
                if (nota2 >= 1 && nota2 <= 20) {
                    System.out.print("Ingrese la 3era calificación: ");
                    nota3 = sc.nextDouble();
                    if (nota3 >= 1 && nota3 <= 20) {
                        promedio = (nota1 + nota2 + nota3) / 3;
                        if (promedio < 14) {
                            System.out.println("Promedio insuficiente. REPROBADO");
                        } else {
                            if (promedio >= 14 && promedio <= 16) {
                                categoria = "Promedio equivalente a BUENO.";
                            } else if (promedio >= 17 && promedio <= 18) {
                                categoria = "Promedio equivalente a MUY BUENO.";
                            } else if (promedio >= 19 && promedio <= 20) {
                                categoria = "Promedio equivalente a SOBRESALIENTE.";
                            }

                            System.out.println("Estudiante :" + estudiante);
                            System.out.println("Nota 1: " + nota1 + "\nNota 2: " + nota2 + "\nNota 3: " + nota3);
                            System.out.println("Promedio :" + df.format(promedio));
                            System.out.println("Categoria :" + categoria);

                        }
                    } else {
                        System.out.println("La 3ra calificación (" + nota3 + ") es incorrecta, ingrese un valor entre 1 y 20.");
                    }
                } else {
                    System.out.println("La 2da calificación (" + nota2 + ") es incorrecta, ingrese un valor entre 1 y 20.");
                }
            } else {
                System.out.println("La 1ra calificación (" + nota1 + ") es incorrecta, ingrese un valor entre 1 y 20.");
            }
        } else {
            System.out.println("\nADVERTENCIA: INGRESE EL NOMBRE VALIDO");
        }
        System.out.println("Fecha y hora de la revision: " + fyh );
    }
    
}
