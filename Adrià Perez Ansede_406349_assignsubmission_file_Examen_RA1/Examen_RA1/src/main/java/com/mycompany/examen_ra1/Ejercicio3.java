/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_ra1;

import java.util.Random;

/**
 *
 * @author perez
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();

        double preciodiario = 42.75;
        
        int duracionalquiler = random.nextInt(11) + 5;
        
        double tarifa = 35.0;
        
        double precioalquiler = preciodiario * duracionalquiler;
        
        double preciototal = precioalquiler + tarifa;
        
        
        System.out.println("El precio del alquiler es de: " + preciototal + "€");
    }

}
