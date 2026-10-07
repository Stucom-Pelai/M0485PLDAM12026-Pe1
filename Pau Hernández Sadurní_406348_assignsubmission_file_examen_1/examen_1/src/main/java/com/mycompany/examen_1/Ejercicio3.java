/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_1;

import java.util.Random;

/**
 *
 * @author pauhe
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Random random = new Random();
          System.out.println("--------------------------");
     double precio_diario = 42.75;  
    int duracion_alquiler = random.nextInt(5,16) ;
    int tarifa = 35;
    double precio_final = (precio_diario * duracion_alquiler) + tarifa;
    
        System.out.println("El vehiculo te saldra por un precio de : " + precio_final);
    }
    
}
