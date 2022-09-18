/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad_2;

/**
 *
 * @author SHIAO_LITECH
 */
public class Dias_semanas_eje4 {
    public static void main(String[] args) {
        int dia = (int) (Math.random() * 7) + 1; // esta haciendo un cast, para que solo le de enteros
        String nombreDia = " ", tipoDia = "";
        System.out.println("El numero elegido es: " + dia);
        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miercoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Jueves";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
        }
        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                tipoDia = "Dia laborable";
                break;
            case 6:
            case 7:
                tipoDia = "Fin de semana";
                break;
        }
        System.out.println("El dia de la semana es: " + nombreDia + "\nEl dia es: " + tipoDia);
        
    }
}
