/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenviernes;

import java.util.Locale;
import java.util.Random;

/**
 *
 * @author kibmo
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Random random = new Random();
        // TODO code application logic here
        
        double precioDia=42.75;
        double duracion= 5 + Math.random()*10;
        double totalPrice= (precioDia*duracion)+35;
        System.out.println("El precio total del alquiler sera de: "+totalPrice+" euros");
     
        
        
      
    }
    
}
