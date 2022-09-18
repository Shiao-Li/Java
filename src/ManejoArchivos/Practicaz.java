/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoArchivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 *
 * @author SHIAO_LITECH
 */
public class Practicaz {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int numeroEstudinates[];
        numeroEstudinates = new int[100];
        int n;
        System.out.print("Ingrese el numero de calificaciones: ");
        n = sc.nextInt();
        ingresar(numeroEstudinates, n);

    }

    static void ingresar(int a[], int n) throws IOException {
        FileWriter file = new FileWriter("C:\\Users\\SHIAO_LITECH\\Documents\\NetBeansProjects\\esfot_algoritmos\\src\\ManejoArchivos\\Carperta\\Calificaciones.txt");
        PrintWriter escrbir = new PrintWriter(file);
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la calificacion: ");
            a[i] = sc.nextInt();
            escrbir.println(a[i]);

        }
        promedio(a, n);
        escrbir.close();

    }

    static void imprimir(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("|" + a[i] + "|");

        }

    }

    static void promedio(int b[], int num) throws IOException {
        FileWriter file = new FileWriter("C:\\Users\\SHIAO_LITECH\\Documents\\NetBeansProjects\\esfot_algoritmos\\src\\ManejoArchivos\\Carperta\\Calificaciones.txt");
        PrintWriter escrbir = new PrintWriter(file);
        int sum = 0;
        double promedio;
        for (int i = 0; i < num; i++) {
            sum = sum + b[i];
        }
        promedio = sum / num;
        escrbir.println("\nEl promedio es: "+promedio);
        escrbir.close();
    }

    static void estudiantes(int c[], int n) {
        int i = 0, d = 0, e = 0, f = 0;

        for (i = 0; i < n; i++) {
            if (c[i] >= 14 & c[i] <= 20) {
                d++;
            } else if (c[i] >= 9 & c[i] <= 13) {
                e++;
            } else if (c[i] >= 1 & c[i] <= 8) {
                f++;
            }

        }
        System.out.println("Aprobado son: "+d);
        System.out.println("Suspenso son: "+e);
        System.out.println("Reprovados son: "+f);
        /*cout<<"APROBADOS SON: "<<d<<endl;
  cout<<"SUSPENSO SON: "<<e<<endl;
  cout<<"REPROBADO SON: "<<f<<endl;*/
    }
}
