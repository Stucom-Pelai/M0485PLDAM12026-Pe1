/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_1;

import java.util.Locale;
import java.util.Random;

/**
 *
 * @author vlpab
 */
public class Ejercicio3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        
        double alquiler = 42.75;
        int dias = random.nextInt(15 - 5 +1) + 5;
        int fijo = 35 ;
        
        double total = (alquiler * dias) + fijo;
        System.out.printf(Locale.US, "%.2f\n", total);
        
    }
    
}
