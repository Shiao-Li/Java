/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantilla_menu;

import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
public class MenuPlantila_ConRetorno {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String op;
        int casos;
        try {
            do {
                casos = mostrarMenu();
                switch (casos) {
                    case 1:
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    default:
                        System.out.println("°° EL NUMERO INGRESADO NO ESTA EN EL RANGO DE OPCIONES °°");

                }
                System.out.print("\nDeseas continuar con el programa?? (s/n):");
                op = sc.next().toLowerCase();
            } while (op.equals("s"));

        } catch (Exception ex) {
            System.out.println("\n\t\t\tADVERTENCIA");
            System.out.println("\n\t\t¡¡¡¡ Datos incorrectos !!!!");
        }//Fin control de error
    }

    //inicio de funciones 
    //funcion de menu
    static int mostrarMenu() {
        int opcion;
        System.out.println("|====================   MENU   ===================|");
        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.println("| 1 - |");
        System.out.println("| 2 - |");
        System.out.println("| 3 - |");
        System.out.println("| 4 - |");
        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.print("\n Selecciona una de las opciones disponibles (1-): ");
        opcion = sc.nextInt();
        return opcion;
    }// fin funcion menu 
    }

