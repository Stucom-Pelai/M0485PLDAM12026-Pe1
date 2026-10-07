/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_1;

import java.util.Locale;

/**
 *
 * @author vlpab
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        double base = 95.00;
        double IVA = 0.21;
        double apl = base * (1+IVA);
        
        System.out.printf(Locale.US, "Final price: %.2f\n", apl);
        
        
    }
    
}
