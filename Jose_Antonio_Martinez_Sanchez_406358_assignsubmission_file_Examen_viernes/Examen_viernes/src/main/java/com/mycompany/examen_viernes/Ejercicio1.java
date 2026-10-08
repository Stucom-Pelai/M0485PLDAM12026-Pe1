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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);
    
    double alquilerbase = 95.00;
    double impuestoIva = 1.21;
    
    double totalconIva = alquilerbase * impuestoIva;
    
    System.out.printf("El precio del alquiler del vehiculo es: %.2f", totalconIva);
    
    
        // TODO code application logic here
    }
    
}
