/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad_2;

import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
public class Ejercicio3_ForWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limite, cont = 0;
        String opcion;
        do {
            System.out.println("ingrese el limite del contador: ");
            limite = sc.nextInt();

            System.out.println("\n *** USO DE WHILE ***");
            while (cont <= limite) {
                System.out.println("Valor del contador" + cont);
                cont++;
                if (cont == 5) {
                    break;
                }
            }

            System.out.println("\n *** USO DE FOR ***");
            for (cont = 0; cont <= limite; cont++) {
                System.out.println("Valor del contador" + cont);
                cont++;
                if (cont == 5) {
                    break;
                }
            }

            System.out.println("Deseas continuar con el programa?? (s/n)");
            opcion = sc.next().toLowerCase();
        } while (opcion.equals("s"));
    }
}
