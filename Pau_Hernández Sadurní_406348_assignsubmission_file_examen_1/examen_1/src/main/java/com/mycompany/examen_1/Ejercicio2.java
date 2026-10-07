/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_1;

/**
 *
 * @author pauhe
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("--------------------------");
        int euros = 200;
        double libras = 0.86;
        int descuento = 8;
        double conversion = (euros * libras) - descuento;
        
        System.out.println("El coste del alquiler en libras esterlinas es de : " + conversion);
    }
    
}
