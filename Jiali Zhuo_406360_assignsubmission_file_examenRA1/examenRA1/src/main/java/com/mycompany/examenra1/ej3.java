/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenra1;

import java.util.Locale;
import java.util.Random;

/**
 *
 * @author jiali
 */
public class ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        
        double alq=42.75;
        double tarifa=35;
        int max=15,min=5;
        int day=r.nextInt((max - min + 1) + min);
        //se me olvido como hacer el randomizer, voy a hacer copia y pega de un  ejercicio anterior.
        
        double total=alq*day+tarifa;
        System.out.printf(Locale.US,"Coste de alquiler: %.2f%n", total);
        
        
    }
    
}
