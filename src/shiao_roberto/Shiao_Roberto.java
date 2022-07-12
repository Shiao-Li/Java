/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiao_roberto;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
public class Shiao_Roberto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        String fyh = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        int opcion_principal = 0;
        
        while (opcion_principal != 12) {
            System.out.println("\n\n==================== [ MENU MULTIPLE ] =================== ");
            System.out.println();
            System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
            System.out.println("| 1 - Facturacion agencia de viajes                       |");
            System.out.println("| 2 - Calculadora laboral                                 |");
            System.out.println("| 3 - Calculadora del apotema del triangulo equilatero    |");
            System.out.println("| 4 - Caculadora notas de la materia de ED                |");
            System.out.println("| 5 - Mes del año segun el numero ingresado               |");
            System.out.println("| 6 - Calculadora promedio (aprueba / reprueba)           |");
            System.out.println("| 7 - Dia de la semana (laborable / fin de semana)        |");
            System.out.println("| 8 - Submenu - sentencias switch                         |");
            System.out.println("| 9 - calculadora area y perimetro del circulo            |");
            System.out.println("| 10 - Calculadora del apotema piramide recta             |");
            System.out.println("| 11 - Nota de venda con el costo final                   |");
            System.out.println("| 12 -     ************* SALIR ***********                |");
            System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");

            System.out.print("\n Selecciona una de las opciones disponibles (1- 11): ");
            opcion_principal = sc.nextInt();

            switch (opcion_principal) {
                case 1:
                    double valorBoleto, descuento, totalPagar;
                    int numBoleto;
                    String destino, transporte, cliente, responsables;
                    
                    System.out.println("\n\tOPCION 1: Facturacion agencia de viajes");
                    System.out.print("INGRESE EL NOMBRE DEL CLIENTE: ");
                    cliente = sc.next();
                    System.out.print("INGRESE EL NUMERO DE BOLETOS QUE PRESENTA: ");
                    numBoleto = sc.nextInt();
                    System.out.print("INGRESE EL COSTO DEL BOLETO: ");
                    valorBoleto = sc.nextDouble();

                    System.out.print("INGRESE EL PORCENTAJE DE DESCUENTO: ");
                    descuento = sc.nextDouble();

                    double valor1 = valorBoleto * numBoleto;
                    double valorDesc = valor1 * descuento / 100;
                    totalPagar = valor1 - valorDesc;
                    System.out.println("\n\t+++++++++Datos del viaje+++++++++ ");
                    System.err.print("INGRESE EL LUGAR DE DESTINO: ");
                    destino = sc.next();
                    System.out.print("INGRESE EL TIPO DE TRANSPORTE: ");
                    transporte = sc.next();
                    System.out.print("INGRESE EL NOMBRE DEL RESPONSABLE: ");
                    responsables = sc.next();

                    //SALIDA
                    System.out.println("\n procesando......\t\nprocesando......\t\n............");
                    System.out.println("\nINFORMACION DEL VIAJE");
                    System.out.println("==================================================");
                    System.out.println("Destino : " + destino + "\tTransporte :" + transporte);
                    System.out.println("# de boletos : " + numBoleto + "\tValor del boleto : " + valorBoleto);
                    System.out.println("# descuento  :" + descuento + "\tValor descuento : " + valorBoleto);

                    System.out.println("\nValor sin descuento  :" + valor1 + "Dólares\n" + "Valor a pagar  : "
                            + df.format(totalPagar) + " Dolares");

                    System.out.println("==================================================");
                    System.out.println("Cliente: " + cliente + "\nResponsable: " + responsables);

                    break;
                case 2:
                    System.out.println("\n\tOPCION 2: Calculadora laboral");
                    int hora,dia;
                    final int VALOR = 10;
                    final int DIA_S = 5;

                    System.out.print("INGRESE LAS HORAS TRABAJADAS: ");
                    hora = sc.nextInt();
                    System.out.print("INGRESE EL NUMERO DE DIAS TRABAJADOS: ");
                    dia = sc.nextInt();
                    double result = hora * VALOR;
                    System.out.println("EL VALOR A PAGAR ES: " + result);
                    System.out.println("SEMANA TRABAJADAS APROX: " + dia / DIA_S);
                    System.out.println("VALOR QUE RECIBE POR SEMANA: " + result / DIA_S);

                    break;
                case 3:
                    System.out.println("\n\tOPCION 3: Calculadora del apotema del triangulo equilatero");
                    double lado, apotema,perimetro;
                    System.out.print("INGRESE EL NUMERO DE L: ");
                    lado = sc.nextDouble();

                    apotema = ((Math.sqrt(3) * lado) / 6);
                    perimetro = apotema * 6 * Math.sqrt(3);
                    System.out.println("EL APOTEMA ES: " + df.format(apotema));
                    System.out.println("EL PERTIMETRO ES: " + df.format(perimetro));
                    
                    break;
                case 4:
                    System.out.println("\n\tOPCION 4: Caculadora notas de la materia de ED");
                    double nota1, nota2, nota3, nota4, nota5;
                    final double PORC_1 = 0.30, PORC_2 = 0.20, PORC_3 = 0.15,PORC_4 = 0.10,PORC_5 = 0.25;

                    System.out.println("\n  *** CALCULADORA DE PROMEDIO EN LA MATERIA DE EDD ***");
                    System.out.println("\n\t\t¡¡ ATENCION !!");
                    System.out.println("Las notas tendran la sigueinte ponderacion");
                    System.out.println("Nota 1 --> 30%\nNota 2 --> 20%\nNota 3 --> 15\nNota 2 --> 10%\nNota 2 --> 25%");
                    System.out.println("===================================================");
                    System.out.println("\t**NOTAS PRIMER PARCIAL**");
                    System.out.print("Ingrese su primera nota del parcial: ");
                    nota1 = sc.nextDouble();
                    System.out.print("Ingrese su segunda nota del parcial: ");
                    nota2 = sc.nextDouble();
                    System.out.println("\n\tNotas ponderadas 1er parcial");

                    double pon1 = nota1 * PORC_1;
                    System.out.println("Ponderacion nota 1: " + df.format(pon1));
                    double pon2 = nota2 * PORC_2;
                    System.out.println("Ponderacion nota 2: " + df.format(pon2));

                    System.out.println("\n\t**NOTAS SEGUNDO PARCIAL**");
                    System.out.print("Ingrese su primera nota del parcial: ");
                    nota3 = sc.nextDouble();
                    System.out.print("Ingrese su segunda nota del parcial: ");
                    nota4 = sc.nextDouble();
                    System.out.print("Ingrese su tercera nota del parcial: ");
                    nota5 = sc.nextDouble();
                    System.out.println("\n\tNotas ponderadas 1er parcial");

                    double pon3 = nota3 * PORC_3;
                    System.out.println("Ponderacion nota 1: " + df.format(pon3));
                    double pon4 = nota4 * PORC_4;
                    System.out.println("Ponderacion nota 2: " + df.format(pon4));
                    double pon5 = nota5 * PORC_5;
                    System.out.println("Ponderacion nota 2: " + df.format(pon5));
                    System.out.println("===================================================");

                    double promedio1 = (nota1 + nota2)/2;
                    double promedio2 = (nota3 + nota4 + nota5)/3;
                    System.out.println("Su nota en 1er parcial en ESTRUCRURA DE DATOS es: " +df.format(promedio1));
                    System.out.println("Su nota en 2do parcial en ESTRUCRURA DE DATOS es: " +df.format(promedio2));
                    double promedio = pon1 + pon2 + pon3 + pon4 + pon5;
                    System.out.println("Su nota en la materia de ESTRUCRURA DE DATOS es: " +df.format(promedio));
                    break;
                case 5:
                    System.out.println("\n\tOPCION 5: Mes del año segun el numero ingresado");
                    int mes;
                    System.out.print("Ingrese el mes del año (rango 1 - 12): ");
                    mes = sc.nextInt();

                    if (mes >= 1 && mes <= 12) {
                        if (mes == 1) {
                            System.out.println("El numero ingresado(" + mes + ") corresponde a ENERO");
                        } else if (mes == 2) {
                            System.out.println("El numero ingresado(" + mes + ") corresponde a FEBRERO");
                        }
                        if (mes == 3) {
                            System.out.println("El numero ingresado(" + mes + ") corresponde a MARZO");
                        } else if (mes == 4) {
                            System.out.println("El numero ingresado(" + mes + ") corresponde a ABRIL");
                        }
                        if (mes == 5) {
                            System.out.println("El numero ingresado(" + mes + ") corresponde a MAYO");
                        } else if (mes == 6) {
                            System.out.println("El numero ingresado(" + mes + ") corresponde a JUNIO");
                        }
                        if (mes == 7) {
                            System.out.println("El numero ingresado(" + mes + ") corresponde a JULIO");
                        } else if (mes == 8) {
                            System.out.println("El numero ingresado(" + mes + ") corresponde a AGOSTO");
                        }
                        if (mes == 9) {
                            System.out.println("El numero ingresado(" + mes + ") corresponde a SEPTIEMBRE");
                        } else if (mes == 10) {
                            System.out.println("El numero ingresado(" + mes + ") corresponde a OCTUBRE");
                        }
                        if (mes == 11) {
                            System.out.println("El numero ingresado(" + mes + ") corresponde a NOVIEMBRE");
                        } else if (mes == 12) {
                            System.out.println("El numero ingresado(" + mes + ") corresponde a DICIEMBRE");
                        }
                    } else {
                        System.out.println("ADVERTENCIA: EL NUMERO NO SE ECUENTRA EN EL RANGO");
                    }// termina else del switch, case 5
                    break;
                case 6:
                    System.out.println("\n\tOPCION 6: Calculadora promedio (aprueba / reprueba)");
                    String estudiante, categoria = " ";
                    double not1,not2,not3,prom;

                    System.out.print("Ingrese el nombre del estudiante: ");
                    estudiante = sc.next();
                    //aqui validar
                    if (estudiante.equals("roberto")) {
                        System.out.print("Ingrese la 1ra calificación: ");
                        not1 = sc.nextDouble();

                        if (not1 >= 1 && not1 <= 20) {
                            System.out.print("Ingrese la 2da calificación: ");
                            not2 = sc.nextDouble();
                            if (not2 >= 1 && not2 <= 20) {
                                System.out.print("Ingrese la 3era calificación: ");
                                not3 = sc.nextDouble();
                                if (not3 >= 1 && not3 <= 20) {
                                    prom = (not1 + not2 + not3) / 3;
                                    if (prom < 14) {
                                        System.out.println("Promedio insuficiente. REPROBADO");
                                    } else {
                                        if (prom >= 14 && prom <= 16.99) {
                                            categoria = "Promedio equivalente a BUENO.";
                                        } else if (prom >= 17 && prom <= 18.99) {
                                            categoria = "Promedio equivalente a MUY BUENO.";
                                        } else if (prom >= 19 && prom <= 20) {
                                            categoria = "Promedio equivalente a SOBRESALIENTE.";
                                        }

                                        System.out.println("Estudiante :" + estudiante);
                                        System.out.println("Nota 1: " + not1 + "\nNota 2: " + not2 + "\nNota 3: " + not3);
                                        System.out.println("Promedio :" + df.format(prom));
                                        System.out.println("Categoria :" + categoria);

                                    }
                                } else {
                                    System.out.println("La 3ra calificación (" + not3 + ") es incorrecta, ingrese un valor entre 1 y 20.");
                                }
                            } else {
                                System.out.println("La 2da calificación (" + not2 + ") es incorrecta, ingrese un valor entre 1 y 20.");
                            }
                        } else {
                            System.out.println("La 1ra calificación (" + not1 + ") es incorrecta, ingrese un valor entre 1 y 20.");
                        }
                    } else {
                        System.out.println("\nADVERTENCIA: INGRESE EL NOMBRE VALIDO");
                    }
                    System.out.println("Fecha y hora de la revision: " + fyh);
                    break;
                case 7:
                    System.out.println("\n\tOPCION 7: Dia de la semana (laborable / fin de semana)");
                    int diaa = (int) (Math.random() * 7) + 1; // esta haciendo un cast, para que solo le de enteros
                    String nombreDia = " ",
                     tipoDia = "";
                    System.out.println("El numero elegido es: " + diaa);
                    switch (diaa) {
                        case 1:
                            nombreDia = "Lunes";
                            break;
                        case 2:
                            nombreDia = "Martes";
                            break;
                        case 3:
                            nombreDia = "Miercoles";
                            break;
                        case 4:
                            nombreDia = "Jueves";
                            break;
                        case 5:
                            nombreDia = "Viernes";
                            break;
                        case 6:
                            nombreDia = "Jueves";
                            break;
                        case 7:
                            nombreDia = "Domingo";
                            break;
                    }
                    switch (diaa) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            tipoDia = "Dia laborable";
                            break;
                        case 6:
                        case 7:
                            tipoDia = "Fin de semana";
                            break;
                    }
                    System.out.println("El dia de la semana es: " + nombreDia + "\nEl dia es: " + tipoDia);
                    break;
                case 8:
                    System.out.println("\n\tOPCION 8: Submenu - sentencias switch");
                    int opcion = 0, dato;
                    double ladoo, a, b, h, perimetroo, apotemaa;

                    while (opcion != 4) {
                        System.out.println("\n    *** MENU ESTRUCTURADO CON SENTENCIAS SWITCH *** ");
                        System.out.println();
                        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
                        System.out.println("| 1 - Numeros (pares / impares)                          |");
                        System.out.println("| 2 - Estacion del año                                   |");
                        System.out.println("| 3 - Submenu (calculadora areas de figuras geometricas) |");
                        System.out.println("| 4 -               SALIR                                |");
                        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
                        System.out.print("\n Selecciona una de las opciones disponibles (1-3): ");
                        opcion = sc.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("\n\tOPCION 1: Numeros (pares / impares)");
                                System.out.print("\nIngrese un valor para la comparacion: ");
                                dato = sc.nextInt();
                                if (dato >= 0) {
                                    if (dato % 2 == 0) {
                                        System.out.println("El valor ingresado(" + dato + ") es PAR");
                                    } else {
                                        System.out.println("El valor ingresado(" + dato + ") es IMPAR");
                                    }
                                } else {
                                    System.out.println("\nVALOR INGRESADO ES INCORRECTO");
                                }
                                break;
                            case 2:
                                System.out.println("\n\t\tOPCION 2: Estacion del año");
                                System.out.print("\nIngrese el numero del mes del año: ");
                                dato = sc.nextInt();
                                switch (dato) {
                                    case 1:
                                    case 2:
                                    case 3:
                                        System.out.println("INVIERNO");
                                        break;
                                    case 4:
                                    case 5:
                                    case 6:
                                        System.out.println("VERANO");
                                        break;
                                    case 7:
                                    case 8:
                                    case 9:
                                        System.out.println("OTOÑO");
                                        break;
                                    case 10:
                                    case 11:
                                    case 12:
                                        System.out.println("PRIMAVERA");
                                        break;
                                    default:
                                        System.out.println("DATO INCORECTO!!!!!, PORFAVOR INGRESE UN VALOR DEL 1 -12");
                                        break;
                                }
                                break;
                            case 3:
                                opcion = 0;
                                while (opcion != 4) {
                                    System.out.println("\n\t\t\tSUBMENU\n\t(Calculadora areas de figuras geometricas)");
                                    System.out.println();
                                    System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
                                    System.out.println("| 1 - Area del cuadrado    |");
                                    System.out.println("| 2 - Area del triangulo   |");
                                    System.out.println("| 3 - Area del poligono    |");
                                    System.out.println("| 4 -     SALIR            |");
                                    System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
                                    System.out.print("\n Selecciona una de las opciones disponibles (1-3): ");
                                    opcion = sc.nextInt();
                                    if (opcion > 5) {
                                        System.out.println("¡¡¡ADVERTENCIA: EL VALOR INGRESADO NO ESTA EN EL RANGO!!!");
                                    }
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("\n\t\tCalcular el area del cuadrado");
                                            System.out.print("\nIngrese el valor del lado: ");
                                            ladoo = sc.nextDouble();
                                            System.out.println("\nEL valor del area es de: " + Math.pow(ladoo, 2));
                                            break;
                                        case 2:
                                            System.out.println("\n\t\tCalcular el area del trapecio");
                                            System.out.print("\nIngrese el valor de a: ");
                                            a = sc.nextDouble();
                                            System.out.print("\nIngrese el valor de b: ");
                                            b = sc.nextDouble();
                                            System.out.print("\nIngrese el valor de h: ");
                                            h = sc.nextDouble();
                                            double areaTrapecio = (((a + b) / 2) * h);
                                            System.out.println("\nEL valor del area es de: " + areaTrapecio);
                                            break;
                                        case 3:
                                            System.out.println("\n\t\tCalcular el area del poligono");
                                            System.out.print("\nIngrese el valor del perimetro: ");
                                            perimetroo = sc.nextDouble();
                                            System.out.print("\nIngrese el valor del apotema: ");
                                            apotemaa = sc.nextDouble();
                                            double areaPoligono = ((perimetroo * apotemaa) / 2);
                                            System.out.println("\nEl valor del area es de: " + areaPoligono);
                                            break;
                                        default:
                                            System.out.println("\nREGRESANDO......");
                                            break;
                                    } // cierra switch calculadora de areas
                                }// cierra while submenu de areas
                                opcion = 0;
                                break;
                            default:
                                System.out.println("\n¡¡¡ ADVERTENCIA: INGRESE UN NUMERO QUE ESTE EN EL RANGO !!!");
                                break;
                        } // cierra switch menu de sentencia con switch
                    }//cierra while del menu de sentncia con switch 
                    break;
                case 9:
                    System.out.println("\n\tOPCION 9: calculadora area y perimetro del circulo ");
                    DecimalFormat ff = new DecimalFormat("#.000");
                    double radio;
                    final double PI = 3.1416;

                    System.out.println("\n*** CALCULADORA DEl AREA Y PERIMETRO DEL CIRCULO ***");
                    System.out.print("\nIngrese el valor del radio: ");
                    radio = sc.nextDouble();

                    double area = (Math.PI * Math.pow(radio, 2));
                    System.out.println("\n*** El area del circulo es: " + ff.format(area));
                    double circunferiancia = (2 * PI * radio);
                    System.out.println("***** El perimetro del circulo es: " + ff.format(circunferiancia));

                    System.out.println("\n************************************************************");
                    System.out.println("\t\t ¡¡VUELVE PRONTO!!");
                    
                    break;
                case 10:
                    System.out.println("\n\tOPCION 10: Calculadora del apotema piramide recta");
                    DecimalFormat dff = new DecimalFormat("#.000");
                    double altura,lado1;

                    System.out.println("\n*** CALCULADORA APOTEMA DE UNA PIRAMIDE RECTA ***");

                    System.out.print("\nIngrese la altura(h): ");
                    altura = sc.nextDouble();
                    System.out.print("Ingrese uno de los lados(l): ");
                    lado1 = sc.nextDouble();

                    double apotema1 = (Math.pow(altura, 2)) + (Math.pow((lado1 / 2), 2));
                    System.out.println("\n***** El apotema es  " + dff.format(apotema1));

                    System.out.println("\n************************************************************");
                    System.out.println("\t\t ¡¡VUELVE PRONTO!!");
           
                    break;
                case 11:
                    System.out.println("\n\tOPCION 11: Nota de venda con el costo final ");
                    DecimalFormat fd = new DecimalFormat("#.000");
                    double valor_prod, valor_des;
                    String producto;
                    final Double IVA = 0.12;
                    System.out.println("\n*** BIENVENIDO AL SUPERMERCADO RS ***");

                    System.out.print("\nIngrese el nombre del producto: ");
                    producto = sc.next();
                    System.out.print("Ingrese el valor de producto: ");
                    valor_prod = sc.nextDouble();
                    System.out.print("Ingrese el porcentaje de descuento del producto: ");
                    valor_des = sc.nextDouble();
                    System.out.println("\n================ PROCESANDO SU FACTURA ================");
                    System.out.println("\n** Nombre del producto: " + producto);
                    System.out.println("*** Valor del producto: " + valor_prod);

                    double valor_iva = valor_prod * IVA;
                    System.out.println("**** IVA a pagar: " + fd.format(valor_iva));
                    double subtotal = valor_iva + valor_prod;
                    System.out.println("***** Subtotal: " + subtotal);
                    double descuento1 = (subtotal * valor_des) / 100;
                    System.out.println("****** Su descuento es de: " + fd.format(descuento1));
                    double total = subtotal - descuento1;
                    System.out.println("******* El total a pagas es: " + fd.format(total));
                    System.out.println("\n==================================================");
                    System.out.println("\t\t ¡¡VUELVE PRONTO!!");
                    
                    break;
            }//fin switch pricipal principal
            
            System.out.println("\nSALIENDO.....");
        }//fin del while principal
    }

}
