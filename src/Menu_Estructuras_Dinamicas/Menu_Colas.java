/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu_Estructuras_Dinamicas;

import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
public class Menu_Colas {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String op;
        int casos,num1;
        Colas cola1 = new Colas();
        
        try {
            do {
                casos = mostrarMenu();
                switch (casos) {
                    case 1:
                        System.out.println("\t\t\t 1 - Insertar ");
                        System.out.println("Para dejar de añadir numeros digite -1");
                        System.out.print("numero: ");
                        num1 = sc.nextInt();

                        while (num1 != -1) {
                            System.out.print("numero: ");
                            cola1.insertar(num1);
                            num1 = sc.nextInt();
                        }
                        cola1.imprimir();
                        break;
                    case 2:
                        System.out.println("\t\t\t 2 - Extraer  ");
                        cola1.imprimir();
                        System.out.println("\nExtracción del elemento de la cola: " + cola1.extraer());
                        break;
                    case 3:
                        System.out.println("\t\t\t 3 - Imprimir  ");
                        cola1.imprimir();
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
        }
    }
    static int mostrarMenu() {
        int opcion;
        System.out.println("|= MENU COLAS =|");
        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.println("| 1 - Insertar |");
        System.out.println("| 2 - Extraer  |");
        System.out.println("| 3 - Imprimir |");
        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.print("\n Selecciona una opcion (1-3): ");
        opcion = sc.nextInt();
        return opcion;
    }
    class Nodo {

        int info;
        Nodo sig;
    }

    private Nodo raiz, fondo;

    Menu_Colas() {
        raiz = null;
        fondo = null;
    }

    boolean vacia() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    void insertar(int info) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info = info;
        nuevo.sig = null;

        if (vacia()) {
            raiz = nuevo;
            fondo = nuevo;
        } else {
            fondo.sig = nuevo;
            fondo = nuevo;
        }
    }

    int extraer(int a) {
        if (!vacia()) {
            int informacion = raiz.info;
            if (raiz == fondo) {
                raiz = null;
                fondo = null;
            } else {
                raiz = raiz.sig;
            }
            return informacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public void imprimir() {
        Nodo reco = raiz;
        System.out.println("\nListado de los elementos de la cola : ");

        while (reco != null) {
            System.out.print(reco.info + ";");
            reco = reco.sig;
        }
        System.out.println();
    }
}
