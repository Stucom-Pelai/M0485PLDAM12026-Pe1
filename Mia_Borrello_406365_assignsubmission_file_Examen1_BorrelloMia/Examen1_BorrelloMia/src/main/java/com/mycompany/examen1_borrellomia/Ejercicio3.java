/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen1_borrellomia;

import java.util.Random;

/**
 *
 * @author miabo
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Random random = new Random();
    
    int dias = random.nextInt(15) + 5;
    double precioDia=42.75;
    double precioGest=35;
    
    double precioFinal= (dias*precioDia)+precioGest;
    
    System.out.println("Dias: "+dias);
    System.out.println("El precio final del alquiler es de: "+precioFinal);
    
       
       
    }
    
}
