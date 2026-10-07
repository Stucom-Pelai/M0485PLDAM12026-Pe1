/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_1;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Life&Beauty
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Random random = new Random();
        // TODO code application logic here
        double pdia=42.75;
        int dias=random.nextInt(10)+6;
        double precio=pdia*dias;
        int gestion=35;
        double pgestion=precio+gestion;
        System.out.println("Dias de alquiler: "+dias);
        System.out.printf(Locale.US, "Precio alquiler: %.2f euros\n",pgestion);
        
        
        
        
        
    }
    
}
