/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoErrores_funcionesAnidadas;

import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
public class FuncionesAnidadas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        try {
            do {
                System.out.print("Ingrese el nombre de usuario: ");
                String user = sc.next();
                System.out.print("Igrese la contraseña: ");
                String pass = sc.next();
                verificar(user, pass);
                System.out.print("\t***CONTINUAR?*  1=si ");
                opcion = sc.nextInt();
            } while (opcion == 1);
        } catch (Exception ex) {//ex es el nombre de la excepcion
            System.out.println("\t***Ingreso de datos incorrectos*");
        } finally {//opcional!!
            System.out.println("De ley se muestra ese mensaje");
        }
    }

    static void verificar(String a, String b) {//funcion sin retorno
        String usuario = "Roberto";
        String password = "1234";
        if (a.equals(usuario) && b.equals(password)) {
            mostrarDatos();
        } else {
            //funcion con retorno
            System.out.println(mostrarMensaje());
        }

    }

    static String mostrarMensaje() {//funcion con retorno
        String msj = "Los datos son incorrectos";

        return msj;
    }

    static void mostrarDatos() {//funcion sin retorno
        System.out.println("Usuario y contraseña correctos");
    }
}
