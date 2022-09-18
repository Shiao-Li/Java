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
public class Menu_Listas {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String op2;
        int casos2,num2, eliminarNum;
        Listas n1 = new Listas();
        
        try {
            do {
                casos2 = mostrarMenuListas();
                switch (casos2) {
                    case 1:
                        System.out.println("\t\t\t 1 - Insertar ");
                        System.out.println("Para dejar de añadir numeros digite -1");
                        System.out.print("numero: ");
                        num2 = sc.nextInt();
                        while (num2 != -1) {
                            System.out.print("numero: ");
                            n1.insertarPrimero(num2);
                            n1.insertarFinal(num2);
                            num2 = sc.nextInt();
                        }
                        
                        System.out.println("Listamos elementos");
                        n1.listar();
                        break;
                    case 2:
                        System.out.println("\t\t\t 2 - Eliminar  ");
                        n1.listar();
                        System.out.print("Ingrese el numero a eliminar: ");
                        eliminarNum = sc.nextInt();
                        n1.borrar(eliminarNum);
                        break;
                    case 3:
                        System.out.println("\t\t\t 3 - Imprimir  ");
                        System.out.println("Listamos elementos");
                        n1.listar();
                        break;
                    default:
                        System.out.println("°° EL NUMERO INGRESADO NO ESTA EN EL RANGO DE OPCIONES °°");

                }
                System.out.print("\nDeseas continuar con el programa?? (s/n):");
                op2 = sc.next().toLowerCase();
            } while (op2.equals("s"));

        } catch (Exception ex) {
            System.out.println("\n\t\t\tADVERTENCIA");
            System.out.println("\n\t\t¡¡¡¡ Datos incorrectos !!!!");
        }
    }
    static int mostrarMenuListas() {
        int opcion;
        System.out.println("[ MENU LISTAS ]");
        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.println("| 1 - Insertar |");
        System.out.println("| 2 - Eliminar |");
        System.out.println("| 3 - Imprimir |");
        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.print("\n Selecciona una opcion (1-3): ");
        opcion = sc.nextInt();
        return opcion;
    }
     class Nodo1 {

        private int elemento;
        private Nodo1 siguiente;

        public Nodo1(int elem, Nodo1 sig) {
            elemento = elem;
            siguiente = sig;
        }

        public int getElemento() {
            return elemento;
        }

        public Nodo1 getSig() {
            return siguiente;
        }

        public void setElemento(int elem) {
            elemento = elem;
        }

        public void setSig(Nodo1 sig) {
            siguiente = sig;
        }
    }

    private Nodo1 primero;
    private int numElem;

    public Menu_Listas() {
        primero = null;
        numElem = 0;
    }

    public void insertarPrimero(int elemento) {
        Nodo1 nuevo = new Nodo1(elemento, primero);
        primero = nuevo;
        numElem++;
    }

    public void insertarFinal(int elemento) {
        Nodo1 nuevo = new Nodo1(elemento, null);
        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo1 actual = primero;
            while (actual.getSig() != null) {
                actual = actual.getSig();

            }
            actual.setSig(nuevo);
            numElem++;
        }
    }

    public void borrar(int elem) {
        if (primero == null) {
            System.out.println("lista vacía");
        } else if (primero.getElemento() == elem) {
            primero = primero.getSig();
            numElem--;
        } else {
            Nodo1 actual = primero;
            while (actual.getSig() != null && actual.getSig().getElemento() != elem) {
                actual = actual.getSig();
            }
            if (actual.getSig() == null) {
                System.out.println("elemento " + elem + " no esta en la lista");
            } else {
                actual.setSig(actual.getSig().getSig());
                numElem--;
            }
        }
    }

    public void listar() {
        Nodo1 actual = primero;
        while (actual.getSig() != null) {
            System.out.println(actual.getElemento());
            actual = actual.getSig();
        }
        System.out.println(actual.getElemento());
    }
}
