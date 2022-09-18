/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_RJ;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
public class Grupo11_ProyectoFinal {

    static Scanner bk = new Scanner(System.in);
    static int aprob, suspendidos, reprobados;
    static int num_alumnos, num_notas;
    static String cedula, nombre_profesor, apellido_profesor, materia;

    static String[] arrayNomAlumnos, arrayApellAlumnos, arrayCorreoAlum;
    static double[] calificaciones, calificaciones_totales;

    //private static double PROMEDIO;
    public static void main(String[] args) {
        String opcion;
        try {
            do {
                String menu = mostrarMenu().toUpperCase();
                switch (menu) {
                    case "A":
                        ingresarDatos();
                        break;
                    case "B":
                        almacenarDatos();
                        leerArchivos();
                        break;
                    case "C":
                        String op1;
                        int casos1;
                        if (calificaciones_totales.length == 0) {
                            System.out.println("No hay datos para ordenar");
                            return;
                        }
                        do {
                            casos1 = mostrarMenuOrd();
                            switch (casos1) {
                                case 1:
                                    ordenamientoBurbuja(calificaciones_totales);
                                    break;
                                case 2:
                                    ordenamientoPorSeleccion(calificaciones_totales);
                                    break;
                                case 3:
                                    ordenamientoPorInsercion(calificaciones_totales);
                                    break;
                                case 4:
                                    ordenamientoPorMergeSort(calificaciones_totales, 0, calificaciones_totales.length - 1);
                                    break;
                                case 5:
                                    ordQuicksort(calificaciones_totales, 0, calificaciones_totales.length - 1);
                                    break;
                                default:
                                    System.out.println("°° EL NUMERO INGRESADO NO ESTA EN EL RANGO DE OPCIONES °°");

                            }
                            System.out.print("\nDeseas continuar en el submenu de ORDENAMIENTO?? (s/n):");
                            op1 = bk.next().toLowerCase();
                        } while (op1.equals("s"));

                        break;
                    case "D":
                        String op2;
                        int casos2;
                        double calificacion;
                        if (calificaciones_totales.length == 0) {
                            System.out.println("No hay datos para ordenar");
                            return;
                        }
                        System.out.print("Ingrese la nota a buscar: ");
                        calificacion = bk.nextDouble();

                        System.out.println();
                        do {
                            casos2 = mostrarMenuBus();
                            switch (casos2) {
                                case 1://CORREGIDO
                                    busquedaLineal(calificacion, calificaciones_totales, arrayNomAlumnos, arrayApellAlumnos, arrayCorreoAlum);
                                    break;
                                case 2:
                                    busquedaBinaria(calificacion, calificaciones_totales, arrayNomAlumnos, arrayApellAlumnos, arrayCorreoAlum);
                                    break;
                                case 3:
                                    busquedaPorInterpolacion(calificacion, calificaciones_totales, arrayNomAlumnos, arrayApellAlumnos, arrayCorreoAlum);
                                    break;
                                default:
                                    System.out.println("°° EL NUMERO INGRESADO NO ESTA EN EL RANGO DE OPCIONES °°");

                            }
                            System.out.print("\nDeseas continuar en el submenu de BUSQUEDA?? (s/n):");
                            op2 = bk.next().toLowerCase();
                        } while (op2.equals("s"));

                        break;
                    default:
                        System.out.println("°° EL NUMERO INGRESADO NO ESTA EN EL RANGO DE OPCIONES °°");
                }
                System.out.print("\nDeseas continuar en el Programa PRINCIPAL? (s/n):");
                opcion = bk.next().toLowerCase();
            } while (opcion.equals("s"));

        } catch (Exception ex) {
            System.out.println("\n\t\t\tADVERTENCIA");
            System.out.println("\n\t\t¡¡¡¡ Datos incorrectos !!!!");
            System.out.println(ex.toString());
        } finally {
            System.out.println("\n\t\tEL PROGRAMA A FINALIZADO");
        }

    }

    // MENU PRINCIPAL
    static String mostrarMenu() {
        String menu;
        System.out.println(" ");
        System.out.println("\t\t<<--- I N S T I T U T O   Y E S H --->>");
        System.out.println("\t\t     ----------------------------");
        System.out.println("\t\t    << SISTEMA DE CALIFICACIONES >>");
        System.out.println("\n\t\t    ===============================");
        System.out.println("\t\t\t   A) INGRESAR DATOS");
        System.out.println("\t\t\t   B) MOSTRAR DATOS");
        System.out.println("\t\t\t   C) ORDENAR DATOS");
        System.out.println("\t\t\t   D) BUSCAR DATOS");
        System.out.println("\t\t    ===============================");
        System.out.print("\nSeleccione una opcion: ");
        menu = bk.next().toUpperCase();
        return menu;
    }

    //SUBMENU DE ORDENAMIENTO
    static int mostrarMenuOrd() {
        int opcion;
        System.out.println(" ");
        System.out.println("\t\t\t   <<< ORDENAMIENTO >>>");
        System.out.println("\t\t\t|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.println("\t\t\t| 1 - METODO BURBUJA      |");
        System.out.println("\t\t\t| 2 - METODO SELECCIÓN    |");
        System.out.println("\t\t\t| 3 - METODO INSERCIÓN    |");
        System.out.println("\t\t\t| 4 - METODO MARGE SORT   |");
        System.out.println("\t\t\t| 5 - METODO QUICK SORT   |");
        System.out.println("\t\t\t|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.print("\n Selecciona una opcion: ");
        opcion = bk.nextInt();
        return opcion;
    }

    //SUBMENU DE BUSQUEDA
    static int mostrarMenuBus() {
        int opcion;
        System.out.println(" ");
        System.out.println("\t\t\t       <<< BUSQUEDA >>>");
        System.out.println("\t\t\t|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.println("\t\t\t| 1 - METODO LINEAL         |");
        System.out.println("\t\t\t| 2 - METODO BINARIO        |");
        System.out.println("\t\t\t| 3 - METODO INTERPOLACION  |");
        System.out.println("\t\t\t|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.print("\n Selecciona una opcion: ");
        opcion = bk.nextInt();
        return opcion;
    }

    // CASE 1 DEL MENU PRINCIPAL INGRESO DE DATOS TAMBIEN ESTA FUNCION DE PROMEDIOS
    static void ingresarDatos() {

        System.out.println("\n\t\t\tDATOS DEL DOCENTE\n");
        System.out.println("====================================================================================================================================\n");
        System.out.print("\n ~ Ingrese el nombre completo de docente: ");
        bk.nextLine();
        nombre_profesor = bk.nextLine();

        System.out.print(" ~ Ingrese el numero de cedula del profesor: ");
        cedula = bk.next();

        System.out.print(" ~ Ingrese el nombre de la materia: ");
        bk.nextLine();
        materia = bk.nextLine();

        System.out.print("\n ~ Ingrese la cantidad de alumnos: ");
        num_alumnos = bk.nextInt();
        System.out.println("====================================================================================================================================\n");

        calificaciones_totales = new double[num_alumnos];
        arrayNomAlumnos = new String[num_alumnos];
        arrayApellAlumnos = new String[num_alumnos];
        arrayCorreoAlum = new String[num_alumnos];
        System.out.println("\n\t\t\tDATOS DEL ESTUDIANTE\n");
        System.out.println("====================================================================================================================================\n");
        for (int i = 0; i < num_alumnos; i++) {
            System.out.print(" ~ Ingrese el nombre del alumno " + (i + 1) + ": ");
            arrayNomAlumnos[i] = bk.next();
            System.out.print(" ~ Ingrese el apellido del alumno " + (i + 1) + ": ");
            arrayApellAlumnos[i] = bk.next();
            System.out.print(" ~ Ingrese el correo del alumno " + (i + 1) + ": ");
            arrayCorreoAlum[i] = bk.next();
            System.out.println("====================================================================================================================================\n");

        }

        System.out.print("\nIngrese le cantidad de notas: ");
        num_notas = bk.nextInt();

        calificaciones = new double[num_notas];
        System.out.println("\n\t\t\tNOTAS DEL ALUMNO\n");
        System.out.println("====================================================================================================================================\n");
        for (int i = 0; i < num_alumnos; i++) {
            System.out.println("\t\t\tNotas alumno " + (i + 1) + " :" + "\n");
            for (int j = 0; j < num_notas; j++) {
                do {

                    System.out.print(" ~ Ingrese la nota: " + (j + 1) + ": ");
                    calificaciones[j] = bk.nextDouble();
                    if (calificaciones[j] < 0 || calificaciones[j] > 20) {
                        System.out.println("La nota debe estar entre 0 y 20");
                    }
                } while (calificaciones[j] < 0 || calificaciones[j] > 20);

            }
            //CORREGIDO
            System.out.println("\n ~ El promedio del alumno " + arrayNomAlumnos[i] + " es: " + String.format("%.2f", mostrarPromedio(calificaciones)));
            calificaciones_totales[i] = mostrarPromedio(calificaciones);
            if (mostrarPromedio(calificaciones) >= 14 && mostrarPromedio(calificaciones) <= 20) {
                aprob++;
            }
            if (mostrarPromedio(calificaciones) >= 9 && mostrarPromedio(calificaciones) <= 13) {
                suspendidos++;
            }
            if (mostrarPromedio(calificaciones) >= 0 && mostrarPromedio(calificaciones) <= 8) {
                reprobados++;
            }

            System.out.println("====================================================================================================================================\n");
        }

        System.out.println("\n ~ El promedio de la materia es: " + String.format("%.2f", mostrarPromedio(calificaciones_totales)));
        double PROMEDIO = mostrarPromedio(calificaciones_totales);
    }

    //funcion de promedios
    static double mostrarPromedio(double[] notas) {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    // CASE 2 DEL MENU PRINCIPAL ALMACENAR Y MOSTRAR DATOS DEL .txt  
    static void leerArchivos() throws FileNotFoundException {
        File file = new File("C:\\Users\\SHIAO_LITECH\\Documents\\NetBeansProjects\\esfot_algoritmos\\src\\proyecto_final_RJ\\ArchivosProyecto\\Calificaciones.txt");

        Scanner bk = new Scanner(file);
        while (bk.hasNextLine()) {
            String datos = bk.nextLine();
            System.out.println(datos);
        }
    }

    static void almacenarDatos() {
        if (cedula == null) {
            System.out.println("No se han ingresado datos");
            return;
        }
        File file = new File("C:\\Users\\SHIAO_LITECH\\Documents\\NetBeansProjects\\esfot_algoritmos\\src\\proyecto_final_RJ\\ArchivosProyecto\\Calificaciones.txt");
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(file);
            boolean fileCreated = file.createNewFile();
            fileWriter.write("\t\t\t\t\t<<--- I N S T I T U T O   Y E S H --->>\n");
            fileWriter.write("\t\t\t\t\t     ----------------------------\n");
            fileWriter.write("\t\t\t\t\t   << REPORTE DE CALIFICACIONES >>\n");
            fileWriter.write("PERIODO: 2022-A\n");
            fileWriter.write("MATERIA: " + materia + "\n");
            fileWriter.write("---------------------------------------------------------------------------------------------------------------------------");
            fileWriter.write("\n|" + "No." + "\t\t|" + "Nombre: " + "\t|" + "Apellido" + "\t\t|" + " Correo" + "\t\t|" + "Nota 1" + "\t\t|" + "Nota 2" + "\t\t|" + "TOTAL\n");
            fileWriter.write("----------------------------------------------------------------------------------------------------------------------------\n");
            for (int i = 0; i < arrayNomAlumnos.length; i++) {
                fileWriter.write("\n|" + (i + 1) + "\t\t" + arrayNomAlumnos[i] + "\t\t" + arrayApellAlumnos[i] + "\t\t" + arrayCorreoAlum[i] + "\t\t" + calificaciones[i] + "\t\t" + calificaciones[i] + "\t\t" + calificaciones[i] + "\n");
            }
            fileWriter.write("---------------------------------------------------------------------------------------------------------------------------\n");
            fileWriter.write("RESUMEN\n");
            double prom = mostrarPromedio(calificaciones);
            fileWriter.write("Promedio del curso: " + prom + "\n");
            fileWriter.write("Total\n");
            fileWriter.write("\t\t\tAprobados(14-20): \t\t" + aprob + "\n");
            fileWriter.write("\t\t\tSuspensos(0-13): \t\t" + suspendidos + "\n");
            fileWriter.write("\t\t\tReprobados(0-8): \t\t" + reprobados + "\n");
            fileWriter.write("\n\n");
            fileWriter.write("\t\t\t------------------------------\n");
            fileWriter.write("\t\t\t\tDocente \n");
            fileWriter.write("\t\t\t\t" + nombre_profesor + "\n\t\t\t\t " + cedula);

            fileWriter.close();
            if (fileCreated) {
                System.out.println("El archivo se creo correctamente");
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("Excepcion al crear el archivo" + e);
        }
    }

    //METODOS DE ORDENAMIENTO
    //ORDENAMIENTO BURBUJA
    static void ordenamientoBurbuja(double[] arreglo) {
        double aux;
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        generarArchivoOrdenamiento("Burbuja", arreglo);
    }

    //ORDENAMIENTO POR SELECCION
    static void ordenamientoPorSeleccion(double[] notas) {
        double aux;
        for (int i = 0; i < notas.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < notas.length; j++) {
                if (notas[j] < notas[min]) {
                    min = j;
                }
            }
            aux = notas[i];
            notas[i] = notas[min];
            notas[min] = aux;
        }
        generarArchivoOrdenamiento("Selección", notas);
    }

    //ORDENAMIENTO POR INSERCCION
    static void ordenamientoPorInsercion(double[] notas) {
        int pos, j;
        double aux;
        for (pos = 1; pos < notas.length; pos++) {
            aux = notas[pos];
            j = pos - 1;
            while ((j >= 0) && (aux < notas[j])) {
                notas[j + 1] = notas[j];
                j--;
            }
            notas[j + 1] = aux;
        }
        generarArchivoOrdenamiento("Inserción", notas);
    }

    //ORDENAMIENTO POR MARGE - recursivo 1era parte
    static void ordenamientoPorMergeSort(double[] notas, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int mitad = (izquierda + derecha) / 2;
            //Recursividad
            ordenamientoPorMergeSort(notas, izquierda, mitad);
            ordenamientoPorMergeSort(notas, mitad + 1, derecha);
            mezcla(notas, izquierda, mitad, derecha);
        }

        generarArchivoOrdenamiento("MergeSort", notas);
    }

    static void mezcla(double[] notas, int izquierda, int mitad, int derecha) {
        int i, j, k;
        double[] aux = new double[calificaciones_totales.length];
        for (i = izquierda; i <= derecha; i++) {
            aux[i] = notas[i];
        }
        i = izquierda;
        j = mitad + 1;
        k = izquierda;
        while (i <= mitad && j <= derecha) {
            if (aux[i] <= aux[j]) {
                notas[k] = aux[i];
                i++;
            } else {
                notas[k] = aux[j];
                j++;
            }
            k++;
        }
        while (i <= mitad) {
            notas[k] = aux[i];
            k++;
            i++;
        }
    }

    //ORDENAMIENTO POR QUICK - recursivo
    static void ordQuicksort(double arreglo[], int primero, int ultimo) {
        int central, i, j;
        int pivote;
        central = (primero + ultimo) / 2;
        pivote = (int) arreglo[central];
        i = primero;
        j = ultimo;
        do {
            while (arreglo[i] < pivote) {
                i++;
            }
            while (arreglo[j] > pivote) {
                j--;
            }
            if (i <= j) {
                int temp;
                temp = (int) arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j) {
            ordQuicksort(arreglo, primero, j);
        }
        if (i < ultimo) {
            ordQuicksort(arreglo, primero, ultimo);
        }
        generarArchivoOrdenamiento("QuickSort", arreglo);
    }

    //GENERA ARCHIVO ORDENAMIENTO.TXT
    static void generarArchivoOrdenamiento(String algoritmo, double[] arreglo) {

        File file = new File("C:\\Users\\SHIAO_LITECH\\Documents\\NetBeansProjects\\esfot_algoritmos\\src\\proyecto_final_RJ\\ArchivosProyecto\\Ordenamiento.txt");
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(file);
            boolean fileCreated = file.createNewFile();
            fileWriter.write("\t\t\t\t\t<<--- I N S T I T U T O   Y E S H --->>\n");
            fileWriter.write("\t\t\t\t\t     ----------------------------\n");
            fileWriter.write("\t\t\t\t<< REPORTE DE CALIFICACIONES ORDENAMIENTO >>\n");
            fileWriter.write("\nCalificaciones Ordenadas\n");
            fileWriter.write("ALGORITMO: Burbuja/Selección/Inserción/MergeSort/QuickSort\n");
            fileWriter.write("Algoritmo seleccionado: " + algoritmo + "\n");

            fileWriter.write("\nPromedios Ordenados: ");

            for (int i = 0; i < arreglo.length; i++) {
                fileWriter.write(arreglo[i] + "\t");
            }

            fileWriter.write("\n\n");
            fileWriter.write("\t\t\t------------------------------\n");
            fileWriter.write("\t\t\t\tDocente \n");
            fileWriter.write("\t\t\t " + nombre_profesor + "\n\t\t\t\t " + cedula);

            fileWriter.close();
            if (fileCreated) {
                System.out.println("El archivo se creo correctamente");
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("Excepcion al crear el archivo" + e);
        }
    }

    //METODOS DE BUSQUEDA
    //BUSQUEDA LINEAL
    static void busquedaLineal(double nota, double[] notas, String[] nombres, String[] apellidos,
            String[] correos) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == nota) {
                generarArchivoBusqueda("Lineal", nombres[i], apellidos[i], correos[i], nota);
                return;
            }
        }
        generarArchivoBusqueda("Lineal", "No se encontró el dato", "", "", nota);
    }

    //BUSQUEDA BINARIA
    static void busquedaBinaria(double nota, double[] notas, String[] nombres, String[] apellidos, String[] correos) {
        int inicio = 0;
        int fin = notas.length - 1;

        while (inicio <= fin) {

            int mitad = (inicio + fin) / 2;
            if (notas[mitad] == nota) {
                generarArchivoBusqueda("Binaria", nombres[mitad], apellidos[mitad], correos[mitad], nota);
                return;
            } else if (notas[mitad] < nota) {
                inicio = mitad + 1;
            } else {
                fin = mitad - 1;
            }
        }
        generarArchivoBusqueda("Binaria", "No encontrado", "", "", nota);
    }

    //BUSQUEDA POR INTERPOLACION
    static void busquedaPorInterpolacion(double nota, double[] notas, String[] nombres, String[] apellidos, String[] correos) {
        int inicio = 0;
        int fin = notas.length - 1;

        while (inicio <= fin && nota >= notas[inicio] && nota <= notas[fin]) {
            int posicion
                    = inicio + (int) (((nota - notas[inicio]) * (fin - inicio)) / (notas[fin] - notas[inicio]));

            if (notas[posicion] == nota) {
                generarArchivoBusqueda("Interpolación", nombres[posicion], apellidos[posicion], correos[posicion],
                        nota);
                return;
            }

            if (notas[posicion] < nota) {
                inicio = posicion + 1;
            } else {
                fin = posicion - 1;
            }
        }
        generarArchivoBusqueda("Interpolación", "No se encontró el dato", "", "", nota);
    }

    //GENERA ARCHIVO BUSQUEDA.TXT
    static void generarArchivoBusqueda(String algoritmo, String nombre, String apellido, String correo, double nota) {

        File file = new File("C:\\Users\\SHIAO_LITECH\\Documents\\NetBeansProjects\\esfot_algoritmos\\src\\proyecto_final_RJ\\ArchivosProyecto\\Busqueda.txt");
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(file);
            boolean fileCreated = file.createNewFile();
            fileWriter.write("\t\t\t\t\t<<--- I N S T I T U T O   Y E S H --->>\n");
            fileWriter.write("\t\t\t\t\t     ----------------------------\n");
            fileWriter.write("\t\t\t\t<< REPORTE DE CALIFICACIONES ORDENAMIENTO >>\n");
            fileWriter.write("\nBúsqueda de Calificaciones\n");
            fileWriter.write("Búsqueda de calificaciones: Lineal/Binaria/Interpolación\n");
            fileWriter.write("Algoritmo seleccionado: " + algoritmo + "\n");

            fileWriter.write("La calificación a buscar fue de: " + nota + "\n");

            fileWriter.write("\nCorresponde al/los estudiante/s: ");

            fileWriter.write("\n" + nombre + " " + apellido + "\t" + correo + "\n");

            fileWriter.write("\n\n");
            fileWriter.write("\t\t\t------------------------------\n");
            fileWriter.write("\t\t\t\tDocente \n");
            fileWriter.write("\t\t\t " + nombre_profesor + "\n\t\t\t\t " + cedula);

            fileWriter.close();
            if (fileCreated) {
                System.out.println("El archivo se creo correctamente");
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("Excepcion al crear el archivo" + e);
        }
    }
}
