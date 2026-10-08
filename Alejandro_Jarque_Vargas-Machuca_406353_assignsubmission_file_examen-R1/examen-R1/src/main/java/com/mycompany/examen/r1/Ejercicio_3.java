/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen.r1;
import java.util.Locale;

/**
 *
 * @author jarqu
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double alquilerPorDia = 42.75;
        int duracionAlquiler = (int) (Math.random()* 15 - 5 + 1) + 5;
        double tarifaFija = 35.00;
        
        double costeFinalAlquiler = (duracionAlquiler * alquilerPorDia) + tarifaFija;
        
        System.out.printf(Locale.US, "El coste final del alquiler es es: %.2f€\n", costeFinalAlquiler);
    }
    
}
