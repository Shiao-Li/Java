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
public class MenuPlantilla_SinRetorno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu, opcion;
        try {
            do {

                mostrarMenu();
                System.out.print("Seleccione una de las opciones del menu: ");
                menu = sc.nextInt();

                switch (menu) {
                    case 1:
                      
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    default:
                        System.out.println("Opcion no disponible!!!!!");
                        break;
                }
                System.out.println("Desea continuar con el programa 1.SI");
                opcion = sc.nextInt();
            } while (opcion == 1);

        } catch (Exception ex) {
            System.out.println("Datos incorrectos" + ex.toString());
        }
    }

    static void mostrarMenu() {
        System.out.println("****MENU****");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
    }
}
