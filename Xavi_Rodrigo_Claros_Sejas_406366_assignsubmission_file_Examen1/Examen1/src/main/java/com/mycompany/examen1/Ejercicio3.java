/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen1;

import java.util.Random;

/**
 *
 * @author xavic
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Random random = new Random();
        int tarifa = 35;
        double preciodiario = 42.75; 
        int dias = random.nextInt(11)+5; 
        double operacion = (preciodiario*dias)+tarifa; 
        System.out.println(operacion);
        
        
        
    }
    
}
