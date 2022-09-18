/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_unidad3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author AYED
 */
public class Listas2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> ListasNombres = new ArrayList<>();
        String nombre;
        
        System.out.println("Para dalir del programa ingrese n");
        System.out.print("Ingrese el nombre: ");
        nombre = sc.next();
        
        //INGRESO DATOS A LA LISTA, SI DIGITA N DEJARA DE INGRESAR
        while (!nombre.equals("n")) {            
            ListasNombres.add(nombre);
            nombre = sc.next();
        }
        
        //IMPRIMIR DATOS DE LA LISTA
        if (ListasNombres.size() > 0) {
            System.out.println("Elementos");
            System.out.println(ListasNombres);
        }
        
        //IMPRIMIR DATOS DE LA LISTA PARA LA MANIPULACION
        //1. tipo de dato de la lista 
        //2. elemento que almacena temporalmente el dato de la lista
        //3. lista que va a recorrer
        for (String item : ListasNombres) { // foreach // for mejorado
            System.out.println("Dato --> " + item);
            
        }   
    }
}
