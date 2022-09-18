/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2bim_parte1;

import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
public class Shiao_Roberto {
    // scanner golobal para todo el programas 
    static Scanner sc = new Scanner(System.in);
    // varibles globales para ejercicio 9
    static int f, c;
    //variables globales para ejercicio 10
    static int numeros2[][] = new int[4][4];
    static int contador = 0;
    static int file[] = new int[16];
    static int colum[] = new int[16];
    static int busqueda;

    public static void main(String[] args) {
        String op;
        int casos;
        try {
            do {
                casos = mostrarMenuPrincipal();
                switch (casos) {
                    case 1:
                        
                        System.out.println("\n\t\t\tOPCION 1");
                        String nombres[];
                        nombres = new String[3];
                        System.out.println("\nImpresion sin bucle \n");
                        nombres[0] = "Sebastian";
                        nombres[2] = "Carla";

                        System.out.println("\tPosicion 0: " + nombres[0]);
                        System.out.println("\tPosicion 1: " + nombres[1]);
                        System.out.println("\tPosicion 2: " + nombres[2]);

                        System.out.println("\nImpresion con bucle \n");
                        double numeros[] = new double[6];
                        numeros[0] = 8.5;
                        numeros[1] = 12.5;
                        numeros[2] = 94.3;
                        numeros[3] = 8.5;
                        numeros[4] = 65.5;
                        numeros[5] = 5.65;

                        for (int i = 0; i < numeros.length; i++) {
                            System.out.println("\tPosicion " + i + "--> " + numeros[i]);
                        }

                        System.out.println("\n===========================================================================");
                        System.out.println("\n\tEJERCICIO NOTAS DE N NUMEROS\n");
                        int n = 6;
                        double nota = 0,
                         suma = 0;

                        double notas[] = new double[n];
                        for (int i = 0; i < n; i++) {
                            System.out.print("Ingrese la calificacion " + (i + 1) + " : ");
                            nota = sc.nextDouble();
                            //suma = suma + nota;
                            notas[i] = nota;
                        }
                        System.out.println(" ");
                        for (int i = 0; i < notas.length; i++) {
                            System.out.println("\tNota" + (i + 1) + "--> " + notas[i]);
                            suma = suma + notas[i];
                        }
                        System.out.println("\nSuma : " + suma);
                        break;
                    case 2:
                        System.out.println("\n\t\t\t\tOPCION 2");
                        String opcion;
                        int aleatoreos[] = new int[20];

                        do {
                            String menu = mostrarMenuEjer2().toUpperCase();
                            switch (menu) {
                                case "A":
                                    System.out.println("Ingreso automatico de datos aleatorios\n");
                                    for (int i = 0; i < aleatoreos.length; i++) {
                                        aleatoreos[i] = (int) (Math.random() * 20 + 1);
                                    }
                                    System.out.println("Ingresando...");
                                    System.out.println("\n\t\t¡¡¡INGRESO DE 20 DATOS EXITOSO!!!");
                                    break;
                                case "B":
                                    System.out.println("Impresion del arreglo\n");
                                    System.out.println("\nImpresion de datos del array ");
                                    for (int i = 0; i < aleatoreos.length; i++) {
                                        System.out.println("indice " + i + "-->" + aleatoreos[i]);
                                    }
                                    break;
                                case "C":
                                    int mayor = 0;
                                    for (int i = 0; i < aleatoreos.length; i++) {
                                        if (aleatoreos[i] > mayor) {
                                            mayor = aleatoreos[i];
                                        }
                                    }
                                    System.out.println("\n El tiempo mayor corresponde a: " + mayor);
                                    break;
                                case "D":
                                    double sumaa = 0;
                                    for (int i = 0; i < aleatoreos.length; i++) {
                                        sumaa = sumaa + aleatoreos[i];
                                    }
                                    System.out.println("\n La suma de los valores del array es: " + sumaa);
                                    break;
                            }
                            System.out.print("\nDeseas continuar en el EJERCICIO 2? (s/n):");
                            opcion = sc.next().toLowerCase();
                        } while (opcion.equals("s"));
                        break;
                    case 3:
                        System.out.println("\n\t\t\t     OPCION 3");
                        int menu,
                         opcionn;
                        int numeros1[] = new int[5];
                        do {

                            mostrarMenuEjer3();
                            System.out.print("\nSeleccione una de las opciones del menu: ");
                            menu = sc.nextInt();

                            switch (menu) {
                                case 1:
                                    System.out.println("\n\t1. ingreso de datos en el arreglo");
                                    for (int i = 0; i < numeros1.length; i++) {
                                        System.out.print("Ingrese el elemento de la posicion " + i + " : ");
                                        numeros1[i] = sc.nextInt();
                                    }
                                    break;
                                case 2:
                                    System.out.println("\n\t2. Ipresion del arreglo");
                                    imprimir(numeros1);
                                    break;
                                case 3:
                                    System.out.println("\n\t3. Array invertido");
                                    int[] retorno = invertirAray(numeros1);
                                    imprimir(retorno);
                                    break;
                                default:
                                    System.out.println("Opcion no disponible!!!!!");
                                    break;
                            }
                            System.out.println("\nDesea continuar en el EJERCICIO 3? 1.SI");
                            opcionn = sc.nextInt();
                        } while (opcionn == 1);
                        break;
                    case 4:
                        //revisar este ejecicio en la clase virtual de arreglos

                        System.out.println("\n\t\t\t     OPCION 4");
                        int opci,
                         menuu,
                         tamanio;
                        int[] datos;
                        do {//repeticion del programa 
                            mostrarMenuEjer4();
                            System.out.print("\nSeleccione una de las opciones del menu: ");
                            menuu = sc.nextInt();
                            switch (menuu) {
                                case 1:
                                    System.out.println("\nSelecionaste literal 1");
                                    System.out.print("Ingrese el tamaño del arreglo: ");
                                    tamanio = sc.nextInt();
                                    datos = new int[tamanio];
                                    System.out.println("\nIngreso de datos del arreglo");
                                    for (int i = 0; i < datos.length; i++) {
                                        System.out.print("Posicion o index " + i + " elemento: ");
                                        datos[i] = sc.nextInt();
                                    }

                                    System.out.println("Mostrar datos del arreglo");
                                    for (int i = 0; i < datos.length; i++) {
                                        System.out.println("Indice " + i + "-->" + datos[i]);
                                    }
                                    break;
                                case 2:
                                    System.out.println("\nSelecionaste literal 2");
                                    datos = new int[21];
                                    int suma1 = 0,
                                     numero = 1;
                                    double media;
                                    System.out.println("\nAsignando de datos del arreglo");
                                    for (int i = 0; i < datos.length; i++) {
                                        datos[i] = numero;
                                        numero += 2;
                                    }
                                    for (int i = 0; i < datos.length; i++) {
                                        System.out.println("Posicion o index " + i + " --> " + datos[i]);
                                        suma1 = suma1 + datos[i];
                                    }
                                    System.out.println("La suma es: " + suma1);
                                    System.out.println("La media es: " + (suma1 / datos.length));
                                    break;
                                case 3:
                                    System.out.println("\nSelecionaste literal 3");
                                    System.out.print("Ingrese el tamaño del arreglo: ");
                                    tamanio = sc.nextInt();
                                    datos = new int[tamanio];

                                    System.out.println("\nIngreso de datos del arreglo");
                                    for (int i = 0; i < datos.length; i++) {
                                        System.out.print("Posicion o index " + i + " elemento: ");
                                        datos[i] = sc.nextInt();
                                    }

                                    System.out.println("Mostrar los elementos del array");
                                    for (int i = 0; i < datos.length; i++) {
                                        if (i >= 5 && i <= 8) {
                                            continue;
                                        }
                                        System.out.println("Posicion o index " + i + "-->" + datos[i]);
                                        if (i == 10) {
                                            break;
                                        }
                                        if (datos[i] == 10) {
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    System.out.println("\nOpcion no valida!!!");
                                    break;
                            }

                            System.out.print("\nDesea continuar en el EJERCICIO 4? 1.SI: ");
                            opci = sc.nextInt();
                        } while (opci == 1);
                        break;
                    case 5:
                        System.out.println("\n\t\t\t\t OPCION 5");
                        //REVISAR EL EJERCICIO 2 Y 3 ESTAN INCOMPLETOS
                        int[] datos1 = null;
                        int opcion2 = 0,
                         menu1,
                         tamanio1;
                        int pares = 0,
                         impares = 0;
                        do {
                            mostrarMenuEjer5();
                            System.out.print("Seleccione una de las opciones: ");
                            menu1 = sc.nextInt();

                            switch (menu1) {
                                case 1:
                                    System.out.println("\nSelecionaste ejercicio 1 arreglo par e impar");
                                    System.out.print("Ingrese el tamaño del arreglo: ");
                                    tamanio1 = sc.nextInt();
                                    datos1 = new int[tamanio1];

                                    System.out.println("Ingreso de datos del arreglo: ");
                                    for (int i = 0; i < datos1.length; i++) {
                                        System.out.print("Index " + i + " elemento: ");
                                        datos1[i] = sc.nextInt();

                                        if (datos1[i] % 2 == 0) {
                                            pares++;
                                        } else {
                                            impares++;
                                        }
                                    }

                                    int par[] = new int[pares];
                                    int impar[] = new int[impares];

                                    pares = 0;
                                    impares = 0;
                                    for (int i = 0; i < datos1.length; i++) {
                                        if (datos1[i] % 2 == 0) {
                                            par[pares] = datos1[i];
                                            pares++;
                                        } else {
                                            impar[impares] = datos1[i];
                                            impares++;
                                        }
                                    }
                                    System.out.println("\nArreglo pares: ");
                                    for (int i = 0; i < pares; i++) {
                                        System.out.println(par[i]);
                                    }
                                    System.out.println("\nArreglo impares: ");
                                    for (int i = 0; i < impares; i++) {
                                        System.out.println(impar[i]);
                                    }
                                    break;

                                case 2:

                                    System.out.println("\nSeleccionaste ejercicio 2 arreglo aleatorio");
                                    int inicio,fin, tamanioo, menor;
                                    
                                    System.out.println("\n\tAsignacion de datos a la matriz");
                                    System.out.print("Ingrese el tamño de la matriz: ");
                                    tamanioo = sc.nextInt();
                                    int numeros2[] = new int[tamanioo];
                                    System.out.print("Ingrese el inicio del randomico:  ");
                                    inicio = sc.nextInt();
                                    System.out.print("Ingrese el limite del randomico:  ");
                                    fin = sc.nextInt();
                                    
                                    for (int i = 0; i < tamanioo; i++) {
                                       numeros2 [i] = (int) (Math.random() * (fin - inicio + 1) + inicio);
                                       System.out.println("Index [" + i + "] -->" + numeros2[i]);
                                    }
                                    menor = numeros2 [0];
                                    for (int i = 0; i < tamanioo ; i++) {
                                        if (numeros2[i] < menor) {
                                            menor = numeros2[i];
                                        }
                                    }
                                    System.out.println("El numero menor es: " + menor);
                                    break;

                                case 3:
                                    
                                    System.out.println("\nSeleccionaste ejercicio 3 posicion invertida ");
                                    
                                    System.out.print("Ingrese el tamño de la matriz: ");
                                    tamanioo = sc.nextInt();
                                    int valores [] = new int[tamanioo];
                                    for (int i = 0; i < tamanioo; i++) {
                                        System.out.print("Ingrese los valores de la posicion ["+ i +"] :");
                                        valores [i] = sc.nextInt();
                                    }
                                    for (int i = 0; i < tamanioo; i++) {
                                        System.out.println("Index ["+ i +"] -->" + valores[i]);
                                    }
                                    System.out.println(" ");
                                    System.out.println("Matriz invertida");
                                    int resultado[] = new int[valores.length];
                                    int j = 0; 

                                    for (int i = valores.length - 1; i >= 0; i--) {
                                        resultado[j] = valores[i];
                                        System.out.println("Index ["+ i +"] -->" + resultado[j]);
                                        j++;   
                                    }
                                    break;

                                default:
                                    System.out.println("Opcion no disponible!!!!!");
                            }

                            System.out.println("Desea continuar en el EJERCICIO 5? 1.SI");
                            opcion2 = sc.nextInt();

                        } while (opcion2 == 1);
                        break;
                    case 6:
                        System.out.println("\n\t\t\t     OPCION 6");
                        int fila, columna, inicio, fin;
                        int numeros3[][];
                        
                        System.out.print("\nIngrese el # de filas: ");
                        fila = sc.nextInt();
                        System.out.print("Ingrese el # de columnas: ");
                        columna = sc.nextInt();

                        numeros3 = new int[fila][columna];

                        System.out.println("\n\tAsignacion de datos a la matriz");
                        System.out.print("Ingrese el inicio del randomico:  ");
                        inicio = sc.nextInt();
                        System.out.print("Ingrese el limite del randomico:  ");
                        fin = sc.nextInt();
                        //recorre la matriz
                        for (int k = 0; k < numeros3.length; k++) {//FILAS
                            for (int j = 0; j < numeros3[k].length; j++) {//COLUMNAS
                                numeros3[k][j] = (int) (Math.random() * (fin - inicio + 1) + inicio);
                                System.out.println("Index [" + k + "][" + j + "] -->" + numeros3[k][j]);
                            }
                        }
                        //imprime la matriz
                        for (int filas = 0; filas < numeros3.length; filas++) {
                            for (int columnas = 0; columnas < numeros3[filas].length; columnas++) {
                                System.out.print(numeros3[filas][columnas] + " | ");
                            }
                            System.out.println("");
                        }
                        break;
                    case 7:
                        System.out.println("\n\t\t\t     OPCION 7");
                        int numeros4[][], numeros5[][], resultados[][];
                        int fila2, columna2;
                        System.out.print("Ingrese el # de filas: ");
                        fila2 = sc.nextInt();
                        System.out.print("Ingrese el # de columnas: ");
                        columna2 = sc.nextInt();

                        numeros4 = new int[fila2][columna2];
                        numeros5 = new int[fila2][columna2];
                        resultados = new int[fila2][columna2];

                        System.out.println(" **** Ingreso de elementos de la Matriz 1 ****");
                        for (int i = 0; i < numeros4.length; i++) {
                            for (int j = 0; j < numeros4[i].length; j++) {
                                System.out.print("Index [" + i + "][" + j + "] -->");
                                numeros4[i][j] = sc.nextInt();
                            }
                        }
                        System.out.println("\n **** Ingreso de elementos de la Matriz 2 ****");
                        for (int i = 0; i < numeros5.length; i++) {
                            for (int j = 0; j < numeros5[i].length; j++) {
                                System.out.print("Index [" + i + "][" + j + "] -->");
                                numeros5[i][j] = sc.nextInt();
                            }
                        }
                        //IMORESION DE LOS ELEMENTOS DE LA MATRIZ
                        System.out.println("\nMatriz 1");
                        for (int i = 0; i < numeros4.length; i++) {
                            for (int j = 0; j < numeros4[i].length; j++) {
                                System.out.print(numeros4[i][j] + " | ");
                            }
                            System.out.println("");
                        }
                        System.out.println("\nMatriz 2");
                        for (int i = 0; i < numeros5.length; i++) {
                            for (int j = 0; j < numeros5[i].length; j++) {
                                System.out.print(numeros5[i][j] + " | ");
                            }
                            System.out.println("");
                        }

                        //CREACION DE NUEVA MATRIZ CON LA SUMA DE LA MATRIZ 1 Y 2
                        for (int f = 0; f < resultados.length; f++) {
                            for (int c = 0; c < resultados[f].length; c++) {
                                resultados[f][c] = numeros4[f][c] + numeros5[f][c];
                            }
                        }
                        System.out.println("\nSuma resultante");
                        for (int i = 0; i < resultados.length; i++) {
                            for (int j = 0; j < resultados[i].length; j++) {
                                System.out.print(resultados[i][j] + " | ");
                            }
                            System.out.println("");
                        }
                        break;
                    case 8:
                        System.out.println("\n\t\t\t     OPCION 8");
                        int matriz1[][] = new int[4][4];
                        for (int i = 0; i < matriz1.length; i++) {
                            for (int j = 0; j < matriz1[i].length; j++) {
                                if (i == j) {
                                    matriz1[i][j] = 1;
                                }
                            }
                        }
                        for (int i = 0; i < matriz1.length; i++) {
                            for (int j = 0; j < matriz1[i].length; j++) {
                                System.out.print(matriz1[i][j] + " | ");
                            }
                            System.out.println("");
                        }
                        break;
                    case 9:
                        System.out.println("\n\t\t\t     OPCION 9");
                        int opciones[][] = {};
                        int menu2, fila3, columna3, suma2 = 0, op2;
                        double promedio;
                        do {
                            mostrarMenueEjer9();
                            System.out.print("Seleccione una de las opciones del menu: ");
                            menu2 = sc.nextInt();

                            switch (menu2) {

                                case 1:
                                    System.out.println("\n1. Rellenar matriz");

                                    System.out.print("Ingrese el # de filas: ");
                                    f = sc.nextInt();
                                    System.out.print("Ingrese el # de columnas: ");
                                    c = sc.nextInt();
                                    opciones = new int[f][c];

                                    for (int i = 0; i < opciones.length; i++) {
                                        for (int j = 0; j < opciones[i].length; j++) {
                                            System.out.print("Index [" + i + "][" + j + "] -->");
                                            opciones[i][j] = sc.nextInt();
                                        }
                                    }
                                    break;
                                case 2:
                                    //COMPLETAR USANDO FUNCIONES
                                    System.out.println("\n2. Suma de filas");
                                    suma2 = 0;
                                    mostrarMatrizEjer9(opciones);
                                    System.out.println("Ingrese el # de fila a sumar [0-" + (f-1) + "]: ");
                                    fila3 = sc.nextInt();
                                    while (fila3 < 0 || fila3 > f) {
                                        System.out.println("Indice invalido, solo se permiten indices entre 0-" + (f-1));
                                        System.out.println("Ingrese el # de fila a sumar [0-" + (f-1) + "]: ");
                                        fila3 = sc.nextInt();
                                    }

                                    for (int i = 0; i < opciones.length; i++) {
                                        for (int j = 0; j < opciones[i].length; j++) {
                                            if (fila3 == i) {
                                                suma2 = suma2 + opciones[i][j];
                                            }
                                        }
                                    }
                                    System.out.println("\nLa sumatoria de la fila (" + fila3 + ") es: " + suma2);
                                    break;

                                case 3:
                                    System.out.println("\n3. Sumar de columnas");
                                    //COMPLETAR CON UNA FUNCION
                                    suma2 = 0;
                                    mostrarMatrizEjer9(opciones);
                                    System.out.println("Ingrese el # de la columna a sumar [0-" + (c-1) + "]: ");
                                    columna3 = sc.nextInt();
                                    while (columna3 < 0 || columna3 > c) {
                                        System.out.println("Indice invalido, se permiten indices entre 0-" + (c-1));
                                        System.out.println("Ingrese el # de la columna a sumar [0-" + (c-1) + "]: ");
                                        columna3 = sc.nextInt();
                                    }
                                    for (int i = 0; i < opciones.length; i++) {
                                        for (int j = 0; j < opciones[i].length; j++) {
                                            if (columna3 == j) {
                                                suma2 = suma2 + opciones[i][j];
                                            }
                                        }
                                    }
                                    System.out.println("\nLa sumatoria de la columna (" + columna3 + ") es " + suma2);

                                    break;
                                case 4:
                                    System.out.println("\n4. Promedio de la matrices");
                                    //COMPLETAR CON UNA FUNCION
                                    suma2 = 0;
                                    mostrarMatrizEjer9(opciones);
                                    for (int i = 0; i < opciones.length; i++) {
                                        for (int j = 0; j < opciones[i].length; j++) {
                                            suma2 = suma2 + opciones[i][j];
                                        }
                                    }
                                    promedio = suma2 / (opciones.length * opciones.length);
                                    System.out.println("\nEl promedio de los elementos de la atriz es " + promedio);

                                    break;
                                default:
                                    System.out.println("Opcion no disponible!!!!!");
                                    break;
                            }
                            System.out.println("Desea continuar en el EJERCICIO 9? 1.SI");
                            op2 = sc.nextInt();
                        } while (op2 == 1);                       
                        
                        break;
                    case 10:
                        System.out.println("\n\t\t\t     OPCION 10");
                        int op3;
                        int casos2;
                        do {
                            mostrarMenueEjer10();
                            System.out.print("\n Selecciona una de las opciones disponibles (1-3): ");
                            casos2 = sc.nextInt();
                            switch (casos2) {
                                case 1:
                                    System.out.println("\n\t\t1 - Matriz nxm");
                                    int fila4, columna4, inicio2, fin2;
                                    int numerosEje1[][];
                                    System.out.print("Ingrese el # de filas: ");
                                    fila4 = sc.nextInt();
                                    System.out.print("Ingrese el # de columnas: ");
                                    columna4 = sc.nextInt();

                                    numerosEje1 = new int[fila4][columna4];

                                    System.out.println("\n\tAsignacion del rango de los randomicos");
                                    System.out.print("Ingrese el inicio del randomico:  ");
                                    inicio2 = sc.nextInt();
                                    System.out.print("Ingrese el limite del randomico:  ");
                                    fin2 = sc.nextInt();
                                    for (int k = 0; k < numerosEje1.length; k++) {
                                        for (int j = 0; j < numerosEje1[k].length; j++) {
                                            numerosEje1[k][j] = (int) (Math.random() * (fin2 - inicio2 + 1) + inicio2);
                                            System.out.println("Index [" + k + "][" + j + "] -->" + numerosEje1[k][j]);
                                        }
                                    }
                                    mostrarMatrizEje1(numerosEje1);

                                    break;
                                case 2:
                                    System.out.println("\n\t2 - Matriz 3x3 con numeros del 1 al 9\n");
                                    mostrarEjer2();
                                    break;
                                case 3:
                                    System.out.println("\n\t\t3 - Matriz de dimension 4");
                                    mostrarMatrizRand_Eje3();
                                    buscarNumero();
                                    encontrarNumero();

                                    break;
                                default:
                                    System.out.println("°° EL NUMERO INGRESADO NO ESTA EN EL RANGO DE OPCIONES °°");

                            }
                            System.out.println("Desea continuar en el EJERCICIO 10? 1.SI");
                            op3 = sc.nextInt();
                        } while (op3 == 1); 
                        
                        break;
                    case 11:
                        System.out.println("\n\t\t\t     OPCION 11");
                        int opcion4, menu4, numero5 = 0;
                        do {
                            mostrarMenuEjer11();
                            do {
                                System.out.print("\nSelecciona una opcion: ");
                                menu4 = sc.nextInt();
                            } while (menu4 > 10);

                            switch (menu4) {
                                case 1:
                                    System.out.println("\nEJERCICIO SIN RECURSIVIDAD");
                                    do {
                                        System.out.print("Ingresa el valor a calcular del factorial : ");
                                        numero5 = sc.nextInt();
                                    } while (numero5 < 0);
                                    int resultado = mostrarFactorial_Bucles(numero5);
                                    System.out.println("Factorial con Bucle: " + resultado);
                                    break;
                                case 2:
                                    System.out.println("\nEJERCICIO CON RECURSIVIDAD");
                                    do {
                                        System.out.print("Ingresa el valor a calcular del factorial : ");
                                        numero5 = sc.nextInt();
                                    } while (numero5 < 0);
                                    System.out.println("Recursividad " + mostrtrarFactorial_Recursivo(numero5));
                                    break;
                                case 3:
                                    System.out.println("\nImpresion array con bucles");
                                    int numeros2[] = {7, 8, 3, 2, 5, 1};
                                    mostrar_array_bucles(numeros2);

                                    break;
                                case 4:
                                    System.out.println("\nImpresion array recursivo");
                                    double numerosDobles[] = {7.2, 8.4, 3.5, 2.6, 5.4, 1.3};
                                    mostrar_array_recursivo(numerosDobles, 0);
                                    
                                    break;
                                case 5:
                                    System.out.println("\nImpresion matriz con bucles");
                                    int numerosMatriz[][] = {{5, 8, 6}, {4, 3, 1}, {8, 7, 9}};
                                    recorrer_matriz_bucles(numerosMatriz, 0, 0);

                                    break;
                                case 6:
                                    System.out.println("\nImpresion matriz recursivo");
                                    int numerosRecursivos[][] = {{5, 8, 6, 8}, {4, 3, 1, 5}, {8, 7, 9, 5}}; 
                                    recorrer_matriz_recursivo(numerosRecursivos, 0, 0);
                                    break;
                                case 7:
                                    do {
                                        System.out.print("Introduce numero mayor que 1: ");
                                        numero5 = sc.nextInt();
                                    } while (numero5 < 0);
                                    System.out.println("\nFibonacci bucles");
                                    System.out.println("\nLos " + numero5 + " términos de la serie de Fibonacci son:");
                                    mostrar_fibonacci_bucles(numero5);
                                    break;
                                case 8:
                                    System.out.println("\nFibonacci recursivo");
                                    int num;
                                    System.out.print("Posicion del # de fibonacci a conocer: ");
                                    num = sc.nextInt();
                                    System.out.println("\nLa " + num + " posicion tiene el #: " + mostrar_fibonacci_recursivo(num));
                                    break;
                                case 9:
                                    System.out.println("\nAkerman recursivo");
                                    int n1, m;
                                    System.out.print("Ingrese el valor de n: ");
                                    n1 = sc.nextInt();
                                    System.out.print("Ingrese el valor de m: ");
                                    m = sc.nextInt();
                                    System.out.println(mostrar_ackerman(n1, m));
                                    break;
                                case 10:
                                    System.out.println("\nPar o Impar (cruzada)");
                                    int array[] = {5, 6, 4, 5, 6, 8, 3};
                                    System.out.println("\nEL ARRAY A VERIFICAR ES");
                                    for (int i = 0; i < array.length; i++) {
                                        System.out.print(array[i] + " | ");

                                    }
                                    System.out.println("\nVERIFICACION DE PARES");
                                    for (int i = 0; i < array.length; i++) {
                                        System.out.println("[" + array[i] + "] --> " + par(array[i]));
                                    }
                                    System.out.println("\nVERIFICACION DE IMPARES");
                                    for (int i = 0; i < array.length; i++) {
                                        System.out.println("[" + array[i] + "] --> " + impar(array[i]));
                                    }
                                    break;
                                default:
                                    System.out.println("Opcion no valida !!!");
                            }
                            System.out.println("\nDesea continuar en el EJERCICIO 11? 1.SI");
                            opcion4 = sc.nextInt();
                        } while (opcion4 == 1);
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
            System.out.println(ex.toString());
        } finally {
            System.out.println("\n\t\tEL PROGRAMA A FINALIZADO");
        }
    }

    static int mostrarMenuPrincipal() {
        int opcion;
        System.out.println("\n|==================== [MENU - BIMESTRE - II] ====================|");
        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.println("| 1 - Impresión arreglo con y sin bucle / Ingreso de n notas     |");
        System.out.println("| 2 - Submenu asignar rand / datos / #mayor / suma               |");
        System.out.println("| 3 - Submenu ingreso datos array / datos / invertir             |");
        System.out.println("| 4 - Submenu array valores n / array incrementos / interrucion  |");
        System.out.println("| 5 - Submenu array par impar / array rand / array invertida     |");
        System.out.println("| 6 - Matrice nxm con inicio y limite de randomicos              |");
        System.out.println("| 7 - Dos matrices nxm y la suma de sus valores                  |");
        System.out.println("| 8 - Matriz unidad con dimension 4                              |");
        System.out.println("| 9 - Submenu matrices rellenar / suma F. / suma C. / promedio   |");
        System.out.println("| 10- Submenu matriz nxm rand / matriz 1-9 / busqueda en matriz  |");
        System.out.println("| 11- Submenu recursividad varias series                         |");
        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.print("\n Selecciona una de las opciones disponibles (1 - 11): ");
        opcion = sc.nextInt();
        return opcion;
    }

    //FUNCIONES 2DO EJERCICIO
    static String mostrarMenuEjer2() {;
        String menu;
        System.out.println("\n\t\t\t|==== SUBMENU EJER 2 ====|");
        System.out.println("\t\t\t| A.- asignar randomicos |");
        System.out.println("\t\t\t| B.- mostrar datos      |");
        System.out.println("\t\t\t| C.- # mayor            |");
        System.out.println("\t\t\t| D.- suma               |");
        System.out.println("\t\t\t|________________________|");
        System.out.print("\nSeleccione una opcion: ");
        menu = sc.next().toUpperCase();
        return menu;
    }

    //FUNCIONES 3ER EJERCICIO
    static void mostrarMenuEjer3() {
        System.out.println("\n\t\t|========= SUBMENU EJER 3 =======|");
        System.out.println("\t\t| 1. Ingreso de datos arreglos   |");
        System.out.println("\t\t| 2. Mostrar datos arreglos      |");
        System.out.println("\t\t| 3. Invertir del datos arreglos |");
        System.out.println("\t\t|________________________________|");
    }

    //eta funcion imprime el arreglo
    static void imprimir(int[] datos) { //aqui estoy poniendo un tipo de dato arreglo
        System.out.println("\nImpresion de elementos del array");
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Posicion del arreglo " + i + "-->" + datos[i]);
        }
    }

    //esta funcion invirte el arreglo
    static int[] invertirAray(int[] datos) { //los corchetes despues del tipo me dice que coy a retornar un arreglo 
        int resultado[] = new int[datos.length];
        int j = 0; //representa la posicion del arreglo actual

        for (int i = datos.length - 1; i >= 0; i--) { //el tamaño es menos 1 porque inicia desde cero
            resultado[j] = datos[i];
            j++;
        }
        return resultado;
    }

    //FUNCIONES 4TO EJERCICIO
    static void mostrarMenuEjer4() {
        System.out.println("\n\t\t|======== SUBMENU EJER 4 =======|");
        System.out.println("\t\t| 1. Arreglo con valores n      |");
        System.out.println("\t\t| 2. Arreglo con incrementos    |");
        System.out.println("\t\t| 3. Uso de continue y break    |");
        System.out.println("\t\t|_______________________________|");
    }

    //FUNCIONES 5TO EJERCICIO
    static void mostrarMenuEjer5() {
        System.out.println("\n\t\t|============= SUBMENU EJER 5 ===========|");
        System.out.println("\t\t| 1. Arreglo par e impar                 |");
        System.out.println("\t\t| 2. Arreglo con numeros aleatorios      |");
        System.out.println("\t\t| 3. Arreglo con 5 posiciones invertidas |");
        System.out.println("\t\t|________________________________________|");
    }
    
    //FUNCIONES 9NO EJERCICIO
    static void mostrarMenueEjer9() {
        System.out.println("\n\t\t|====== SUBMENU EJER 9 ======|");
        System.out.println("\t\t| 1. Rellenar matriz         |");
        System.out.println("\t\t| 2. Suma de filas           |");
        System.out.println("\t\t| 3. Suma de columna         |");
        System.out.println("\t\t| 4. Promedio de la matrices |");
        System.out.println("\t\t|____________________________|");
    }

    static void mostrarMatrizEjer9(int opciones[][]) {

        for (int i = 0; i < opciones.length; i++) {
            for (int j = 0; j < opciones[i].length; j++) {
                System.out.print(opciones[i][j] + " | ");
            }
            System.out.println("");
        }
    }
    
    //FUNCIONES EJERCICIO 10
    static void mostrarMenueEjer10() {
        System.out.println("\n\t\t|=========== SUBMENU EJER 10 ===========|");
        System.out.println("\t\t| 1 - Matriz nxm                        |");
        System.out.println("\t\t| 2 - Matriz 3x3 con numeros del 1 al 9 |");
        System.out.println("\t\t| 3 - Matriz de dimension 4             |");
        System.out.println("\t\t| ______________________________________|");
    }
    
    static void mostrarMatrizEje1(int numeros[][]) {
        for (int filas = 0; filas < numeros.length; filas++) {
            for (int columnas = 0; columnas < numeros[filas].length; columnas++) {
                System.out.print(numeros[filas][columnas] + " | ");
            }
            System.out.println("");
        }
    }

    static void mostrarEjer2() {
        int numeros[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //imprime la mtriz
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " | ");
            }
            System.out.println("");
        }
    }

    static void mostrarMatrizRand_Eje3(){
        int inicio = 20, fin = 30;
        System.out.println("\nMatriz con randomicos del 20 al 30\n");
        for (int i = 0; i < numeros2.length; i++) {
            for (int j = 0; j < numeros2.length; j++) {
                numeros2[i][j] = (int) (Math.random() * (fin - inicio + 1) + inicio);
                System.out.print(numeros2[i][j] + " | ");
            }
            System.out.println("");
        }
    }
    
    static void buscarNumero() {
        System.out.print("Numero a buscar: ");
        busqueda = sc.nextInt();
        
        for (int fila = 0; fila < numeros2.length; fila++) {
            for (int columna = 0; columna < numeros2[fila].length; columna++) {
                if (numeros2[fila][columna] == busqueda) {
                    file[contador] = fila + 1;
                    colum[contador] = columna + 1;
                    contador++;
                }
            }
        }
    }

    static void encontrarNumero() {
        if (contador > 0) {
            System.out.println("\tEl elemento fue encontrado en\n");
            for (int i = 0; i < contador; i++) {
                System.out.println("fila / columna");
                System.out.println("[" + (file[i] - 1) + "] [" + (colum[i] - 1) + "]");
            }
        } else {
            System.out.println( "El # "+ busqueda + " NO SE ENCONTRO." );
        }
    }
    
    //FUNCIONES EJERCICIO 11
    static void mostrarMenuEjer11() {
        System.out.println("\n\t\t|======== SUBMENU EJER 11 =======|");
        System.out.println("\t\t| 1. Factorial con bucles        |");
        System.out.println("\t\t| 2. Factorial con recursividad  |");
        System.out.println("\t\t| 3. Impresion array con bucles  |");
        System.out.println("\t\t| 4. Impresion array recursivo   |");
        System.out.println("\t\t| 5. Impresion matriz con bucles |");
        System.out.println("\t\t| 6. Impresion matriz recursivo  |");
        System.out.println("\t\t| 7. Fibonacci bucles            |"); 
        System.out.println("\t\t| 8. Fibonacci recursivo         |");
        System.out.println("\t\t| 9. Akerman recursivo           |");
        System.out.println("\t\t| 10. Par o Impar (cruzada)      |");
        System.out.println("\t\t|________________________________|");

    }

    static int mostrarFactorial_Bucles(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    static int mostrtrarFactorial_Recursivo(int n) {
        int resultado;
        //caso trivial
        if (n == 1) { // n== 0 return 0
            return 1;
        } else {
            resultado = n * mostrtrarFactorial_Recursivo(n - 1);
        }
        return resultado;
    }

    static void mostrar_array_bucles(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + "-->" + array[i]);
        }
    }

    static void mostrar_array_recursivo(double array[], int indice) {//indice debe ser pequeño
        if (indice == (array.length - 1)) {// caso trivial cunando no hay datos que recorrer
            System.out.println(array[indice]);
        } else {
            System.out.println(array[indice]);
            mostrar_array_recursivo(array, indice + 1);
        }
    }

    static void recorrer_matriz_bucles(int matriz[][], int i, int j) {
        //completar
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("");
        }
    }

    static void recorrer_matriz_recursivo(int matriz[][], int i, int j) { //datos pequeños
        System.out.print(matriz[i][j] + " | ");
        if (i != matriz.length - 1 || j != matriz[i].length - 1) {
            if (j == matriz[i].length - 1) {
                i++;
                j = 0;
                System.out.println(" ");
            } else {
                j++;
            }
            recorrer_matriz_recursivo(matriz, i, j);
        }
    }

    static void mostrar_fibonacci_bucles(int n) {
        int fibo1 = 0, fibo2 = 1, i;

        System.out.print(fibo1 + " ");
        for (i = 2; i <= n; i++) {
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
            
        }
        System.out.println();
    }

    static int mostrar_fibonacci_recursivo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return mostrar_fibonacci_recursivo(n - 1) + mostrar_fibonacci_recursivo(n - 2);
        }
    }

    static int mostrar_ackerman(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        if (n == 0) {
            return mostrar_ackerman(m - 1, 1);
        } else {
            return mostrar_ackerman(m - 1, mostrar_ackerman(m, n - 1));
        }

    }

    static boolean par(int n) {
        if (n == 0) {
            return true;
        } else {
            return impar(n - 1);
        }
    }

    static boolean impar(int n) {
        if (n == 0) {
            return false;
        } else {
            return par(n - 1);
        }
    }
}