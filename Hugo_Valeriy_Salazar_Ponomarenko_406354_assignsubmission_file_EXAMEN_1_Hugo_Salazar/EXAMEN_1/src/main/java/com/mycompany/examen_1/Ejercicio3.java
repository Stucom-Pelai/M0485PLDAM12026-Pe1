/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_1;

import java.util.Random;

/**
 *
 * @author hubit
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        // TODO code application logic here
        double precioDia = 42.75;
        double dia = random.nextInt(16) + 5;
        double tarifaFija = 35;
        
        double precioFianl = precioDia * dia + tarifaFija;
        
        System.out.printf("Precio diario es de: %.2f%n", precioFianl);
        
    }
    
}
