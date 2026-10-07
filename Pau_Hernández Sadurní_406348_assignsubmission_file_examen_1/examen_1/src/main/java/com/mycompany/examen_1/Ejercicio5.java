/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_1;

import java.util.Scanner;

/**
 *
 * @author pauhe
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Hola, Escribeme el precio de tu primer alquiler: ");
        double alquiler1 = scanner.nextDouble();
         System.out.print("Hola, Escribeme el precio de tu segundo alquiler: ");
        double alquiler2 = scanner.nextDouble();
         System.out.print("Hola, Escribeme el precio de tu tercer alquiler: ");
        double alquiler3 = scanner.nextDouble();

        double suma_alquiler = (alquiler1 + alquiler2 + alquiler3);
        double media = (alquiler1 + alquiler2 + alquiler3) / 3;
        boolean superaLimite = suma_alquiler >600 ;
        boolean contratoFirmado = true  ;
        boolean  sinMultas = true  ;
        
        System.out.println("La media de tu alquiler es de: " + suma_alquiler);

        System.out.println("El cliente puede realizar nuevas reservas " + superaLimite );

    }

}
