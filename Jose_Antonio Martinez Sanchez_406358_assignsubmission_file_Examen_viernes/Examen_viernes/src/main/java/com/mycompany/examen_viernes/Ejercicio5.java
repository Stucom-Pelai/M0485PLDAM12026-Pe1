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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);
    
    System.out.println("Dime el coste del alquiler 1: ");
    int alquiler1 = scanner.nextInt();
    System.out.println("Dime el coste del alquiler 2: ");
    int alquiler2 = scanner.nextInt();
    System.out.println("Dime el coste del alquiler 3: ");
    int alquiler3 = scanner.nextInt();
    
    int sumaAlquileres = alquiler1 + alquiler2 + alquiler3;
    int mediaAlquileres = sumaAlquileres / 3;
    
    boolean superaLimite = sumaAlquileres > 600;
    boolean contratoFirmado = true;
    boolean sinMultas = true;
    
    boolean puedereservar = superaLimite && contratoFirmado && sinMultas;
    
    System.out.println("El cliente puede realizar nuevas reservas (supera limite y contrato firmado y sin multas): " + puedereservar);
    
        // TODO code application logic here
    }
    
}
