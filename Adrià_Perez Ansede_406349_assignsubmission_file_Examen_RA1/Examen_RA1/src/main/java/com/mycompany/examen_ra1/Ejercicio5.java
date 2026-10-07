/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_ra1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author perez
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
//PONGO EL SYS OUT EN CADA ALQUILER PARA QUE QUEDE BONITO.

        System.out.println("Coste primer alquiler: ");
        double alq1 = scanner.nextDouble();

        System.out.println("Coste segundo alquiler: ");
        double alq2 = scanner.nextDouble();

        System.out.println("Coste tercer alquiler: ");
        double alq3 = scanner.nextDouble();

        double total = alq1 + alq2 + alq3;
        double mediatotal = total / 3.0;
        
        boolean superaLimite = total > 600 ;
        boolean contratoFirmado = true;
        boolean sinMultas = true;
        
        boolean resultado = (superaLimite && contratoFirmado && sinMultas);
        
        System.out.printf(Locale.US,"La media de los tres alquileres es de: %.2f%n ", mediatotal);
        
        System.out.println("El cliente puede realizar nuevas reservas (supera limite y contrato firmado y sin multas): " + resultado );
        

    }

}
