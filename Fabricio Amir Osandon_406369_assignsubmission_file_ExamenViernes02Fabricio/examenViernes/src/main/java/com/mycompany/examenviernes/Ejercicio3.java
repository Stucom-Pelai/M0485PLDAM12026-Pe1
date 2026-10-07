/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenviernes;

import java.util.Scanner;
import java.util.Locale;
import java.util.Random;
/**
 *
 * @author Viviana
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Random random = new Random();

        System.out.println("Cual es el precio de alquiler por dia?:");
        double alquiler = scanner.nextDouble();
        
        int dias = random.nextInt(11) + 5;
        System.out.println("Estos son los dias de alquier:" + dias);

        double gasto = alquiler * dias;
        
        double resultado = gasto + 35;
        System.out.printf(Locale.US, "El total es:%.2f%n " , resultado);
        
        
        
        
        
    }
    
}
