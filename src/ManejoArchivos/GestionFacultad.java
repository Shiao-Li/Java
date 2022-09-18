/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoArchivos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
/*public final class GestionFacultad {
    static Scanner teclado = new Scanner(System.in);
	static final String CABECERA = String.format("%-12s | %-20s | %-30s | %-4s | %-4s | %-30s | %-15s | %-11s | %-12s",
			 "Clave Alumno", "Nombre", "Apellidos", "Edad", "Sexo", "Licenciatura Inscrita", "Calif. Promedio", "Clave Tutor",
			"Hora Tutoria");
 
	public static void main(String[] args) {
 
		int opcion = 0;
		do {
			opcion = menu();
			switch(opcion)
			{
			case 0:
				System.out.println("\n\n\t\tFIN DEL PROGRAMA");
				break;
			case 1:
				registrarAlumno();
				break;
			case 2:
				mostrarReporte();
				break;
			case 3:
				calcularPromedio();
				break;
			default:
				System.out.println("\nOpcion invalida");
			}
		}while(opcion != 0);
 
	}
 
	static int menu() {
		System.out.println("\n\n\t\tGESTION FACULTAD");
		System.out.println("\t\t------- --------\n");
		System.out.println("[1] -- Registrar ALUMNO");
		System.out.println("[2] -- Mostrar listado ALUMNOS");
		System.out.println("[3] -- Calcular promedio calificaciones ALUMNO");
		System.out.println("[4] -- Registrar ASIGNATURA");
		System.out.println("[0] -- Terminar programa\n");
		int opcion;
		do {
			System.out.print("Elija opcion: ");
			opcion = Integer.parseInt(teclado.nextLine());
		}while(opcion < 0 && opcion > 4);
		return opcion;
	}
 
	static void registrarAlumno() {
		System.out.println("\n\tNUEVO ALUMNO:\n");
		System.out.print("Clave: ");
		int clave = Integer.parseInt(teclado.nextLine());
		System.out.print("Nombre: ");
		String nombre = teclado.nextLine();
		System.out.print("Apellidos: ");
		String apellidos = teclado.nextLine();
		System.out.print("Edad: ");
		int edad = Integer.parseInt(teclado.nextLine());
		System.out.print("Sexo(F/M): ");
		char sexo = teclado.nextLine().toUpperCase().charAt(0);
		System.out.print("Licenciatura en la que inscribe: ");
		String licenciatura = teclado.nextLine();
		System.out.print("Calificacion Promedio: ");
		double promedio = Double.parseDouble(teclado.nextLine());
		if (licenciatura.toLowerCase().equals("gestion de la informacion en redes sociales") &&
				promedio < 8.0)
		{
			System.out.println("La calificacion promedio es insuficiente para registrarse en "
					+ "la licenciatura indicada.");
			System.out.println("No es posible continuar con el registro.");
			return; //Interrumpimos metodo
		}
		System.out.print("Hora de tutoria: ");
		String tutoria = teclado.nextLine();
		Tutor tutor = asignarTutor(); //Llamamos al metodo que pide datos para crear un tutor
		//Tenemos los datos necesarios para crear Alumno
		Alumno alumno = new Alumno(clave, nombre, apellidos, edad, sexo, licenciatura, promedio, tutor, tutoria);
		System.out.println("\n\tDatos Alumno registrado: ");
		System.out.println(CABECERA + "\n");
		System.out.println(alumno.toString());
		System.out.println("\nLongitud del nombre completo: " + alumno.getLongitudNombreCompleto());
		//Intentamos guardar en archivo texto
		if (guardarEnArchivo(alumno.toString()))
			System.out.println("\nEl alumno ha sido guardado en archivo alumnos.txt");
		else
			System.out.println("\nNo fue posible guardar los datos en alumnos.txt");
	}
 
	static Tutor asignarTutor() {
		System.out.println("\nA continuacion indique datos del tutor...");
		System.out.print("Clave: ");
		int clave = Integer.parseInt(teclado.nextLine());
		System.out.print("Nombre: ");
		String nombre = teclado.nextLine();
		System.out.print("Apellidos: ");
		String apellidos = teclado.nextLine();
		System.out.print("Edad: ");
		int edad = Integer.parseInt(teclado.nextLine());
		System.out.print("Sexo(F/M): ");
		char sexo = teclado.nextLine().toUpperCase().charAt(0);
		System.out.print("Area Especialidad: ");
		String area = teclado.nextLine();
		System.out.print("Categoria Profesor(A/B/C): ");
		char categoria = teclado.nextLine().toUpperCase().charAt(0);
		System.out.print("Numero clases impartidas: ");
		int numClases = Integer.parseInt(teclado.nextLine());
		return new Tutor(clave, nombre, apellidos, edad, sexo, area, categoria, numClases);
	}
 
	static boolean guardarEnArchivo(String linea) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("alumnos.txt", true));
			bw.newLine();
			bw.write(linea);
			bw.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
 
	static void mostrarReporte() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("alumnos.txt"));
			String linea = br.readLine();
			System.out.println(CABECERA);
			while (linea != null)
			{
				System.out.println(linea);
				linea = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("\nNo se encuentra archivo: alumnos.txt");
		} catch (IOException e) {
			System.out.println("Error de acceso al archivo: alumnos.txt");
		}
	}
 
	static void calcularPromedio() {
		System.out.print("Indique clave alumno: ");
		String clave = teclado.nextLine();
		System.out.print("¿Cuantas calificaciones introducira?: ");
		double numCalif = Integer.parseInt(teclado.nextLine());
		double sumaNotas = 0d;
		for (int i = 0; i < numCalif; i++)
		{
			System.out.printf("\nIndique calificacion %d#: ", (i+1));
			sumaNotas += Double.parseDouble(teclado.nextLine());
		}
		System.out.printf("\nEl promedio del alumno con clave %s es %.2f", clave, (sumaNotas/numCalif));
	}
}
