/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vlpab
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        
        System.out.println("Primer alquiler:");
        double primer = scanner.nextDouble();
        System.out.println("Segundo alquiler:");
        double segundo = scanner.nextDouble();
        System.out.println("Tercer alquiler:");
        double tercer = scanner.nextDouble();
        double suma = primer + segundo + tercer;
        
        double media = suma/3;
        System.out.printf(Locale.US, "La media es: %.2f\n", media);
        boolean superaLimite = (suma > 600);
        boolean contratoFirmado = true;
        boolean sinMultas = true;
        boolean esValida = superaLimite && contratoFirmado && sinMultas;
        System.out.println("El cliente puede realizar nuevas reservas (supera limite y contrato y sin multas): " + esValida);
        
        
    }
    
}
