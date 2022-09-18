/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2_funciones;

import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
public class OperacionesBasicas_RobertoShiao {
    // entre el public class y la funcion principal es en donde puedo crear mis variables globales 

    static Scanner sc = new Scanner(System.in); //se la pone aqui porque ahora scanner la podre usar en todo mi porgrama sera global y ya no como un objeto
    static int resultado = 0; //variable global

    public static void main(String[] args) {
        String menu, opcion;
        int num1, num2, num3;
        do {
            mostrarMenu();
            menu = sc.next().toUpperCase();// se usa tolower porque esta transforma de mayuscula a minuscula
            //completar con un tolowe, toupper
            switch (menu) {
                case "A":
                    System.out.println("Suma");
                    System.out.println("Ingrese el 1er valor: ");
                    num1 = sc.nextInt();
                    System.out.println("Ingrese el 2do valor: ");
                    num2 = sc.nextInt();
                    System.out.println("Ingrese el 3er valor: ");
                    num3 = sc.nextInt();
                    sumar(num1, num2, num3);
                    //1era opcion
                    System.out.println("Resultado de la suma: " + sumar(num1, num2, num3));
                    //2da opcion
                    resultado = sumar(num1, num2, num3);
                    System.out.println("Resultado de la suma: " + resultado);

                    break;
                case "B":
                    System.out.println("Resta");
                    System.out.println("Ingrese el 1er valor: ");
                    num1 = sc.nextInt();
                    System.out.println("Ingrese el 2do valor: ");
                    num2 = sc.nextInt();
                    restar(num1, num2);
                    break;
                case "C":
                    System.out.println("Multiplicacion");
                    //primera opcion 
                    System.out.println("El resultado de la multiplcacion es: " + multiplicar());
                    //segunda opcion
                    double resultado2 = multiplicar();
                    System.out.println("El resultado de la multiplcacion es: " + resultado2);

                    break;
                //VALIDAR ANTES DE INVOCAR LAS FUNCIONES
                case "D":
                    System.out.println("DIVISION");

                    //division: con retorno validar que 1er > 2do dato y que el 2do dato no cero
                    break;
                case "E":
                    System.out.println("POTENCIA");
                    //potencia: sin retorno validar que 1er y 2do dato sean >2
                    do {
                        System.out.println("Ingrese la base: ");
                        num1 = sc.nextInt();
                    } while (!(num1 > 2));// estoy usando la negacion para usar tal cual el enunciado
                    do {
                        System.out.println("Ingrese el exponente: ");
                        num2 = sc.nextInt();
                    } while (!(num2 > 2));
                    CalcularPotencia(num1, num2);

                    break;
                case "F":
                    System.out.println("PAR O IMPAR");
                    //division: con retorno validar que 1er > 2do dato y que el 2do dato no cero
                    break;
                default:
                    System.out.println("\nOpcion nos disponible. Escoje una opcion del menu");
            }
            System.out.println("Deseas continuar ejecutando el programa? (y/n)");
            opcion = sc.next().toLowerCase();//se debe controlar si es mayuscula o minusculas
        } while (opcion.equals("y"));

    }

    //metodo sin retorno, si parametros
    static void mostrarMenu() {// uso static para que no se reconozca como objeto
        System.out.println("===== MENU =====");
        System.out.println("A.- SUMA");
        System.out.println("B.- RESTA");
        System.out.println("C.- MULTIPLICACION");
        System.out.println("D.- DIVIDIR");
        System.out.println("E.- POTENCIA");
        System.out.println("F.- PAR O IMPAR");
        // AÑADIR UNA OPCION DE PAR E IMPAR
        System.out.println("Seleccione una opcion: ");

    }

    //metodo con retorno 3 parametros
    static int sumar(int a, int b, int c) {
        resultado = a + b + c;
        return resultado;
    }

    static void restar(double a, double b) {
        System.out.println("El resultado de la resta es " + Math.abs(a - b));
    }

    //metodo con retorno sin parametros
    static double multiplicar() {
        //pido dos datos
        System.out.println("Ingrese el 1er valor: ");
        double num1 = sc.nextInt();
        System.out.println("Ingrese el 2do valor: ");
        double num2 = sc.nextInt();

        return num1 * num2;
    }

    static void CalcularPotencia(int a, int b) {
        System.out.println("el resultado de la potencia es: " + Math.pow(a, b));
    }
}
