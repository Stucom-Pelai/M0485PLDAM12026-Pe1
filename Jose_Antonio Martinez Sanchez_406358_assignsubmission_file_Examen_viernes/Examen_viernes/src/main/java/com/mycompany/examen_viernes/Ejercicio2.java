/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_viernes;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author joser
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);
    
    double euro = 0.86;
    int costeAlquiler = 200;
    int descuento = 8;
    
    double totalLibras = costeAlquiler * euro;
    double totalcondescuento = totalLibras - descuento;
    
    System.out.printf("El precio de alquilar el coche en libras es: %.2f", totalcondescuento);
    
    
            
            
     
        // TODO code application logic here
    }
    
}
