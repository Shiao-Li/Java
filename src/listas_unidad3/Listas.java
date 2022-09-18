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
public class Listas {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<String> listasNombres = new ArrayList<>();
        
        listasNombres.add("Angela");
        listasNombres.add("Miguel Angel");
        listasNombres.add("Carmelina");
        
        System.out.println("\nLista inicial");
        System.out.println(listasNombres);
        System.out.println("Esta vacia: "+listasNombres.isEmpty());
        System.out.println("Cantidad de elementos: "+listasNombres.size());
        
        System.out.println("\nLista actual");
        //listasNombres.remove(2);
        //System.out.println(listasNombres);
        listasNombres.add(0,"Isabel");
        System.out.println(listasNombres);
        System.out.println("\nBUSCAR EL ELEMENTO DE LA POSICION\n");
        System.out.print("Ingrese una posicion del 0 al 3: ");
        int pos =sc.nextInt();
        System.out.println("GET: "+listasNombres.get(pos));
        System.out.println("\nBUSCAR LA POSICION DEL ELEMENTO\n");
        System.out.print("Ingrese una posicion del 0 al 2: ");
        String pos1 =sc.next();
        System.out.println("INDEXOF: "+listasNombres.indexOf(pos1));
        listasNombres.clear();
        System.out.println(listasNombres);

    }
}
