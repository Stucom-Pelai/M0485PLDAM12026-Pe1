/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_1;

import java.util.Scanner;

/**
 *
 * @author hubit
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double priceCar = 95.00;
        
        double iva = priceCar * 21 / 100;
        
        double fianlPrice = priceCar + iva;
        
        System.out.println("El precio final del alquiler es de : " + fianlPrice + "€");
    }
    
}
