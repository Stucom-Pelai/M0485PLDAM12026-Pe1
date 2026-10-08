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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        
        System.out.println("Cuanto es el coste de alquiler?:");
        int coste = scanner.nextInt();
        
        double cambio = (coste * 0.86);
        double descuento = (cambio - 8);
        System.out.printf(Locale.US, "El total es:%.2f%n" , descuento);

        
        
        
    }
    
}
