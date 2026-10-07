/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_pr01;
import java.util.Locale;
import java.util.Random;

/**
 *
 * @author Lenovo
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        
        double dia = 42.75;
        int duracion = 5 + random.nextInt(11);
        int tarifa = 35;
        double precio = dia * duracion;
        double preciototal = precio + tarifa;
        System.out.printf(Locale.US, "El precio del alquiler del coche es: %.2f%n", preciototal);
    }
    
}
