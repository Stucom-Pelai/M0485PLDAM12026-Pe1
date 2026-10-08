/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_viernes;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joser
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);
    Random random = new Random();
    
    double precioDiario = 42.75;
    double duracionAlquiler = random.nextDouble(11) + 5;
    double tarifaGestion = 35;
    
    double precioTotal = precioDiario * duracionAlquiler;
    double preciototalconTarifa = precioTotal + tarifaGestion;
    
    System.out.printf("El precio total del alquiler es: %.2f€", preciototalconTarifa);
    
    
        // TODO code application logic here
    }
    
}
