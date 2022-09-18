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
public class Colas {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        Colas cola1 = new Colas();
        int num1;
        
        System.out.println("Para dejar de añadir numeros digite -1");
        System.out.print("numero: ");
        num1 = sc.nextInt();
        
        while (num1 != -1) {     
            System.out.print("numero: ");
            cola1.insertar(num1);
            num1 = sc.nextInt();
        }
        
        cola1.imprimir();
        System.out.println("\nExtracción del elemento de la cola: " + cola1.extraer());
        cola1.imprimir();

    }

    String extraer(int numExtraido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    class Nodo {

        int info;
        Nodo sig;
    }

    private Nodo raiz, fondo;

    Colas() {
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

    int extraer() {
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
