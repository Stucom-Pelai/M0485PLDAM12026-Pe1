/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen1;
import java.util.Locale;
import java. util.Scanner;
/**
 *
 * @author noavi
 */
public class ej5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
       System.out.println("Inserte el gasto de cada uno de sus 3 alquileres:");
       double alquiler1 = scanner.nextDouble();
       double alquiler2 = scanner.nextDouble();
       double alquiler3 = scanner.nextDouble();
       
       System.out.println("La media del alquiler es de: " + ((alquiler1+alquiler2+alquiler3)/3) + " euros.");
       
       boolean superaLimite = (alquiler1+alquiler2+alquiler3) > 600.0;
       boolean contratoFirmado = true;
       boolean sinMultas = true;
       
       System.out.println("El cliente puede realizar nuevas reservas (supera limite y contrato firmado y sin multas): " + (superaLimite && contratoFirmado && sinMultas));
       




    }
}
