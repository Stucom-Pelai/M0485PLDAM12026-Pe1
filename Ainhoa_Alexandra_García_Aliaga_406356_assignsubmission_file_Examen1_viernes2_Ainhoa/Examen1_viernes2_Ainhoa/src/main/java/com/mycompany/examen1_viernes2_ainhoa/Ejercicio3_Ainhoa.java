/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen1_viernes2_ainhoa;

import java.util.Locale;
import java.util.Random;

/**
 *
 * @author ainhoa
 */
public class Ejercicio3_Ainhoa {

    /**
     * @param args the command line arguments
     */
    public static double precioDiario = 42.75;
    
    public static void main(String[] args) {
        Random random = new Random();
        
        int duracionAlquiler = random.nextInt (5)+11;
        
        double operacion = duracionAlquiler * 42.75;
        double tarifa = operacion + 35.00;
        
        System.out.printf(Locale.US, "Final price: $%.2f%n",tarifa);
        
        
        
        
    }
    
}
