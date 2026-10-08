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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int euros = 200;
        double libras = 0.86;
        int descuento = 8;
        
        double total = (euros * libras) - descuento;
        System.out.printf(Locale.US, "%.2f\n", total);
        
        
    }
    
}
