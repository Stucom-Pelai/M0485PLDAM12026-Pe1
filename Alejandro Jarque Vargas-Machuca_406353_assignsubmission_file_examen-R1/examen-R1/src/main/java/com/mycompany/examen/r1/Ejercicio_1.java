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
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double alquilerBase = 95.00;
        double iva = 21 / 100.00;
        
        double precioFinal = alquilerBase + (alquilerBase * iva);
        
        System.out.printf(Locale.US, "El precio final es: %.2f€\n", precioFinal);
    }
    
}
