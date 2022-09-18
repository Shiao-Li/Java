/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoArchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author SHIAO_LITECH
 */
public class LeerArchivos {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\SHIAO_LITECH\\Documents\\NetBeansProjects\\esfot_algoritmos\\src\\ManejoArchivos\\Carperta\\miPrimerArchivo.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {                
                String datos = sc.nextLine();
                System.out.println(datos);     
            }
        } catch (FileNotFoundException e) {
            System.out.println("Excepion al abrir el archivo " + e);
        }
        
    }
}
