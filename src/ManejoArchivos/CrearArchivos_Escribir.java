/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoArchivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
public class CrearArchivos_Escribir {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nombreDocen, numcedula, materia;
        int tamanio;
        int[] datos;
        File folder = new File("C:\\Users\\SHIAO_LITECH\\Documents\\NetBeansProjects\\esfot_algoritmos\\src\\ManejoArchivos\\Carperta");
        File file = new File("C:\\Users\\SHIAO_LITECH\\Documents\\NetBeansProjects\\esfot_algoritmos\src\proyecto_final_RJ\ArchivosProyecto\\Calificaciones.txt");
        try {
            boolean folderCreated = folder.mkdir();
            boolean fileCreated = file.createNewFile();
            FileWriter escrbir = new FileWriter(file);

            System.out.println("\t\t\tDATOS DEL DOCENTE");
            System.out.print("Nombre del docente: ");
            nombreDocen = sc.nextLine();
            System.out.print("Su numero de cedula: ");
            numcedula = sc.nextLine();
            System.out.print("Materia que imparte: ");
            materia = sc.nextLine();

            //estudiante
            System.out.print("\nCuantos estudiantes va a ingresar: \n");
            tamanio = sc.nextInt();
            datos = new int[tamanio];

            String[] nombreEst = new String[tamanio];
            String[] apellidoEst = new String[tamanio];
            String[] correoEst = new String[tamanio];
            int[] num1 = new int[tamanio];
            int[] num2 = new int[tamanio];
            int[] total = new int[tamanio];
            System.out.println("\t\t\tDATOS DEL ESTUDIANTE\n");
            System.out.println("===============================================================================================");
            for (int i = 0; i < datos.length; i++) {
                System.out.print("Ingrese el nombre del estudiante [" + i + "]: ");
                nombreEst[i] = sc.next();
                System.out.print("Ingrese el apellido del estudiante [" + i + "]: ");
                apellidoEst[i] = sc.next();
                System.out.print("Ingrese el Correo del estudiante [" + i + "]: ");
                correoEst[i] = sc.next();
                System.out.print("Ingrese la nota 1: ");
                num1[i] = sc.nextInt();
                System.out.print("Ingrese la nota 2: ");
                num2[i] = sc.nextInt();
                System.out.println("===============================================================================================");
                total[i] = num1[i] + num2[i];
            }
            //estudiante

            //formato para el .txt
            escrbir.write("\t\t\t\t\t<<--- I N S T I T U T O   Y E S H --->>\n");
            escrbir.write("\t\t\t\t\t     ----------------------------\n");
            escrbir.write("\t\t\t\t\t   << REPORTE DE CALIFICACIONES >>\n");
            escrbir.write("PERIODO: 2022-A\n");
            escrbir.write("MATERIA: " + materia + "\n");
            escrbir.write("---------------------------------------------------------------------------------------------------------------------------");
            escrbir.write("\n|" + "No." + "\t\t|" + "Nombre: " + "\t|" + "Apellido" + "\t\t|" + " Correo" + "\t\t|" + "Nota 1" + "\t\t|" + "Nota 2" + "\t\t|" + "TOTAL\n");
            escrbir.write("---------------------------------------------------------------------------------------------------------------------------");
            for (int i = 0; i < datos.length; i++) {
                escrbir.write("\n|" + i + "\t\t" + nombreEst[i] + "\t\t" + apellidoEst[i] + "\t\t" + correoEst[i] + "\t\t" + num1[i] + "\t\t" + num2[i] + "\t\t" + total[i]);
            }
            escrbir.write("RESUMEN");
            escrbir.write("---------------------------------------------------------------------------------------------------------------------------");
            escrbir.write("Promedio\ndel curso:");
            escrbir.close();
            if (folderCreated && fileCreated) {
                System.out.println("El archivo se creo correctamente");
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("Excepcion al crear el archivo" + e);
        }

    }
}
