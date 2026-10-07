/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenviernes;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Viviana
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        
        System.out.println("Cuanto es la base de alquiler?:");
        
        double base = scanner.nextDouble();
        double iva = (base * 1.21);
        System.out.printf(Locale.US, "La base del alquiler añadiendo impuestos es:%.2f%n" , iva);
        
        
    }
    
}
