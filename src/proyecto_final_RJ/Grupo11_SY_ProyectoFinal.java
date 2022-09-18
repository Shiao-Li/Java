/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_RJ;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
public class Grupo11_SY_ProyectoFinal {

    static final Scanner SCANNER = new Scanner(System.in);

    static int APROBADOS;
    static int SUSPENSOS;
    static int REPROBADOS;

    static String NUMERO_DE_CEDULA;
    static String NOMBRE_PROFESOR;

    static String APELLIDO_PROFESOR;
    static String NOMBRE_MATERIA;

    static String CANTIDAD_DE_ALUMNOS;

    static String[] NOMBRES_ALUMNOS;

    static String[] APELLIDOS_ALUMNOS;

    static String[] CORREOS_ALUMNOS;
    static String CANTIDAD_DE_NOTAS;
    static double[] NOTAS;

    static double[] NOTAS_TOTALES;

    //private static double PROMEDIO;
    public static void main(String[] args) {

        int opcion;
        do {
            String menu = "\t\tInstituto\n\n1. Ingresar Datos\n2. Almacenar Datos\n3. OrdenarDatos\n4. Buscar "
                    + "Datos\n5. Salir\n\nIngrese una opción: \n>";
            System.out.println(menu);
            opcion = SCANNER.nextInt();
            switch (opcion) {
                case 1:
                    ingresarDatos();
                    break;
                case 2:
                    almacenarDatos();
                    break;
                case 3:
                    ordenarDatos();
                    break;
                case 4:
                    buscarDatos();
                    break;
            }

        } while (opcion != 5);
        Object[] PROMEDIO = {};
        String.format("El promedio de notas es: %.2f", PROMEDIO);
    }

    static void buscarDatos() {
        if (NOTAS_TOTALES.length == 0) {
            System.out.println("No hay datos para ordenar");
            return;
        }

        System.out.println("Ingrese la nota a buscar: ");
        System.out.print("> ");

        String nota;
        do {
            nota = SCANNER.next();
            if (!nota.matches("[0-9]+")) {
                System.out.println("Ingrese una nota válida");
                System.out.print("> ");
            }
        } while (!esDecimal(nota));

        System.out.println();
        String menu = "Buscar Datos\n1. Búsqueda Lineal\n2. Busqueda Binaria\n3. Búsqueda Por "
                + "Interpolación\n\nIngrese una opción: \n>";
        System.out.println(menu);

        int opcion = SCANNER.nextInt();
        switch (opcion) {
            case 1:
                busquedaLineal(Double.parseDouble(nota), NOTAS_TOTALES, NOMBRES_ALUMNOS, APELLIDOS_ALUMNOS, CORREOS_ALUMNOS);
                break;
            case 2:
                busquedaBinaria(Double.parseDouble(nota), NOTAS_TOTALES, NOMBRES_ALUMNOS, APELLIDOS_ALUMNOS, CORREOS_ALUMNOS);
                break;
            case 3:
                busquedaPorInterpolacion(Double.parseDouble(nota), NOTAS_TOTALES, NOMBRES_ALUMNOS, APELLIDOS_ALUMNOS, CORREOS_ALUMNOS);
                break;
        }
    }

    static void busquedaPorInterpolacion(double nota, double[] notas, String[] nombres,
            String[] apellidos, String[] correos) {
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

    static void busquedaBinaria(double nota, double[] notas, String[] nombres, String[] apellidos,
            String[] correos) {
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

    static void ordenarDatos() {
        if (NOTAS_TOTALES.length == 0) {
            System.out.println("No hay datos para ordenar");
            return;
        }

        String menu
                = "Ordenar Datos\n1. Ordenamiento Burbuja\n2. Ordenamiento por Selección\n3. Ordenamiento "
                + "por Inserción\n4.Ordenamiento por MergeSort\n5. Ordenamiento por QuickSort\n\nIngrese una opción: \n>";
        System.out.println(menu);
        int opcion = SCANNER.nextInt();
        switch (opcion) {
            case 1:
                ordenamientoBurbuja(NOTAS_TOTALES);
                break;
            case 2:
                ordenamientoPorSeleccion(NOTAS_TOTALES);
                break;
            case 3:
                ordenamientoPorInsercion(NOTAS_TOTALES);
                break;
            case 4:
                ordenamientoPorMergeSort(NOTAS_TOTALES);
                break;
            case 5:
                ordenamientoPorQuickSort(NOTAS_TOTALES);
                break;
            default:

        }

    }

    static void ordenamientoPorQuickSort(double[] notas) {
        double pivote = notas[0];
        int i = 0;
        int j = notas.length - 1;
        double aux;

        while (i < j) {
            while (notas[i] <= pivote && i < j) {
                i++;
            }
            while (notas[j] > pivote) {
                j--;
            }
            if (i < j) {
                aux = notas[i];
                notas[i] = notas[j];
                notas[j] = aux;
            }
        }

        notas[0] = notas[j];
        notas[j] = pivote;

        //Recursividad
        if (j - 1 > 0) {
            ordenamientoPorQuickSort(notas);
        }
        if (j + 1 < notas.length) {
            ordenamientoPorQuickSort(notas);
        }

        generarArchivoOrdenamiento("QuickSort", notas);

    }

    static void ordenamientoPorMergeSort(double[] notas) {
        int izquierda = 0;
        int derecha = NOTAS_TOTALES.length - 1;
        if (izquierda < derecha) {
            int mitad = (izquierda + derecha) / 2;
            //Recursividad
            ordenamientoPorMergeSort(notas);
            ordenamientoPorMergeSort(notas);
            mezcla(notas, izquierda, mitad, derecha);
        }

        generarArchivoOrdenamiento("MergeSort", notas);
    }

    static void mezcla(double[] notas, int izquierda, int mitad, int derecha) {
        int i, j, k;
        double[] aux = new double[NOTAS_TOTALES.length];
        for (i = mitad + 1; i > izquierda; i--) {
            aux[i - 1] = notas[i - 1];
        }

        i = izquierda;
        j = mitad + 1;
        k = izquierda;

        while (i <= mitad && j <= derecha) {
            if (aux[i] <= aux[j]) {
                notas[k++] = aux[i++];
            } else {
                notas[k++] = notas[j++];
            }
        }
        while (i <= mitad) {
            notas[k++] = aux[i++];
        }

    }

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

    static void generarArchivoBusqueda(String algoritmo, String nombre, String apellido, String correo,
            double nota) {

        File file = new File("busqueda.txt");
        if (file.exists()) {
            System.out.println("El archivo ya existe");
            return;
        }
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write("\t\t\t\t\t\t\tInstituto\n\t\t\t\t\tReporte de calificaciones por búsqueda\n\n");
            fileWriter.write("Búsqueda de calificaciones: Lineal/Binaria/Interpolación\n");
            fileWriter.write("Algoritmo seleccionado: " + algoritmo + "\n");

            fileWriter.write("La calificación a buscar fue: " + nota + "\n");

            fileWriter.write("El nombre del alumno/a o alumnos/as es: \n");

            fileWriter.write(nombre + " " + apellido + "\n" + correo + "\n");

            fileWriter.write("\n\n");
            fileWriter.write("------------------------------\n");
            fileWriter.write("Docente ");
            fileWriter.write(NOMBRE_PROFESOR + " " + APELLIDO_PROFESOR + "\n" + NUMERO_DE_CEDULA);

            fileWriter.close();

            System.out.println("Archivo generado");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void generarArchivoOrdenamiento(String algoritmo, double[] arreglo) {

        File file = new File("ordenamiento.txt");
        if (file.exists()) {
            System.out.println("El archivo ya existe");
            return;
        }
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write("\t\t\t\t\t\t\tInstituto\n\t\t\t\t\tReporte de calificaciones Ordenamiento\n\n");
            fileWriter.write("Algoritmo de Ordenamiento: Burbuja/Selección/Inserción/MergeSort/QuickSort\n");
            fileWriter.write("Algoritmo seleccionado: " + algoritmo + "\n");

            fileWriter.write("Promedios Ordenados: ");

            for (int i = 0; i < arreglo.length; i++) {
                fileWriter.write(arreglo[i] + "\t");
            }

            fileWriter.write("\n\n");
            fileWriter.write("------------------------------\n");
            fileWriter.write("Docente ");
            fileWriter.write(NOMBRE_PROFESOR + " " + APELLIDO_PROFESOR + "\n" + NUMERO_DE_CEDULA);

            fileWriter.close();

            System.out.println("Archivo generado");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void almacenarDatos() {
        if (NUMERO_DE_CEDULA == null) {
            System.out.println("No se han ingresado datos");
            return;
        }
        File file = new File("calificaciones.txt");
        if (file.exists()) {
            System.out.println("El archivo ya existe");
            return;
        }
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write("\t\t\t\t\t\t\tInstituto\n\t\t\t\t\tReporte de calificaciones\n\n");
            fileWriter.write("Periodo: 2021-1\n");
            fileWriter.write("Materia: " + NOMBRE_MATERIA + "\n");
            fileWriter.write( "N°" + "\tNombre" + "\tApellido" + "\tCorreo" + "\tNota 1" + "\tNota 2" + "\tTotal" + "\n");
            for (int i = 0; i < NOMBRES_ALUMNOS.length; i++) {
                fileWriter.write((i + 1) + "\t" + NOMBRES_ALUMNOS[i] + "\t" + APELLIDOS_ALUMNOS[i] + "\t " + CORREOS_ALUMNOS[i] + "\t" + " " + "\t" + " " + "\t\t\t\t" + NOTAS[i] + "\n");
            }
            fileWriter.write("Resumen:\n");
            double prom = mostrarPromedio(NOTAS);
            fileWriter.write("Promedio del curso: " + prom + "\n");
            fileWriter.write("Aprobados(14-20): " + APROBADOS + "\n");
            fileWriter.write("Suspensos(0-13): " + SUSPENSOS + "\n");
            fileWriter.write("Reprobados(0-8): " + REPROBADOS + "\n");
            fileWriter.write("\n\n");
            fileWriter.write("------------------------------\n");
            fileWriter.write("Docente ");
            fileWriter.write(NOMBRE_PROFESOR + " " + APELLIDO_PROFESOR + "\n" + NUMERO_DE_CEDULA);

            fileWriter.close();
            System.out.println("Archivo generado");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo");
        }

    }

    static double mostrarPromedio(double[] notas) {
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    static boolean esNumero(String numero) {
        try {
            Integer.parseInt(numero);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static boolean esDecimal(String numero) {
        try {
            Double.parseDouble(numero);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static void ingresarDatos() {

        do {
            System.out.println("Ingrese el numero de cedula del profesor: ");
            System.out.print("> ");

            NUMERO_DE_CEDULA = SCANNER.next();
            if (!esNumero(NUMERO_DE_CEDULA)) {
                System.out.println("El numero de cédula debe ser un numero");
            }
        } while (!esNumero(NUMERO_DE_CEDULA));

        System.out.println("Ingrese el nombre del profesor: ");
        System.out.print("> ");
        NOMBRE_PROFESOR = SCANNER.next();

        System.out.println("Ingrese el apellido del profesor: ");
        System.out.print("> ");
        APELLIDO_PROFESOR = SCANNER.next();

        System.out.println("Ingrese el nombre de la materia: ");
        System.out.print("> ");
        NOMBRE_MATERIA = SCANNER.next();

        do {
            System.out.println("Ingrese la cantidad de alumnos: ");
            System.out.print("> ");
            CANTIDAD_DE_ALUMNOS = SCANNER.next();
            if (!esNumero(CANTIDAD_DE_ALUMNOS)) {
                System.out.println("La cantidad de alumnos debe ser un numero");
            }
        } while (!esNumero(CANTIDAD_DE_ALUMNOS));

        NOTAS_TOTALES = new double[Integer.parseInt(CANTIDAD_DE_ALUMNOS)];
        NOMBRES_ALUMNOS = new String[Integer.parseInt(CANTIDAD_DE_ALUMNOS)];
        APELLIDOS_ALUMNOS = new String[Integer.parseInt(CANTIDAD_DE_ALUMNOS)];
        CORREOS_ALUMNOS = new String[Integer.parseInt(CANTIDAD_DE_ALUMNOS)];

        for (int i = 0; i < Integer.parseInt(CANTIDAD_DE_ALUMNOS); i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1) + ": ");
            System.out.print("> ");
            NOMBRES_ALUMNOS[i] = SCANNER.next();
            System.out.println("Ingrese el apellido del alumno " + (i + 1) + ": ");
            System.out.print("> ");
            APELLIDOS_ALUMNOS[i] = SCANNER.next();
            System.out.println("Ingrese el correo del alumno " + (i + 1) + ": ");
            System.out.print("> ");
            CORREOS_ALUMNOS[i] = SCANNER.next();
        }

        do {

            System.out.println("Ingrese le cantidad de notas: ");
            System.out.print("> ");
            CANTIDAD_DE_NOTAS = SCANNER.next();
            if (!esNumero(CANTIDAD_DE_NOTAS)) {
                System.out.println("La cantidad de notas debe ser un numero");
            }
        } while (!esNumero(CANTIDAD_DE_NOTAS));

        NOTAS = new double[Integer.parseInt(CANTIDAD_DE_NOTAS)];

        for (int i = 0; i < Integer.parseInt(CANTIDAD_DE_ALUMNOS); i++) {
            System.out.println("Ingrese la nota del alumno " + (i + 1) + ": ");
            for (int j = 0; j < Integer.parseInt(CANTIDAD_DE_NOTAS); j++) {
                System.out.print("> ");
                do {
                    NOTAS[j] = SCANNER.nextInt();
                    if (NOTAS[j] < 0 || NOTAS[j] > 20) {
                        System.out.println("La nota debe estar entre 0 y 20");
                    }
                } while (NOTAS[j] < 0 || NOTAS[j] > 20);

            }
            System.out.println(
                    "El promedio del alumno " + NOMBRES_ALUMNOS[i] + " es: " + mostrarPromedio(NOTAS));
            NOTAS_TOTALES[i] = (int) mostrarPromedio(NOTAS);
            if (mostrarPromedio(NOTAS) >= 14 && mostrarPromedio(NOTAS) <= 20) {
                APROBADOS++;
            }
            if (mostrarPromedio(NOTAS) >= 9 && mostrarPromedio(NOTAS) <= 13) {
                SUSPENSOS++;
            }
            if (mostrarPromedio(NOTAS) >= 0 && mostrarPromedio(NOTAS) <= 8) {
                REPROBADOS++;
            }
        }

        System.out.println("El promedio de la materia es: " + mostrarPromedio(NOTAS_TOTALES));
        double PROMEDIO = mostrarPromedio(NOTAS_TOTALES);
    }
}
