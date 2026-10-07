/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen1_borrellomia;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author miabo
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);
        
    double alquiler1=scanner.nextDouble();
    double alquiler2=scanner.nextDouble();
    double alquiler3=scanner.nextDouble();
    
    double gastoTotal=alquiler1+alquiler2+alquiler3;
    double media= gastoTotal /3;
    boolean superaLimite = gastoTotal>600;
    boolean contratoFirmado=scanner.nextBoolean();
    boolean sinMulta=scanner.nextBoolean();
    boolean valido= superaLimite && contratoFirmado && sinMulta;
    
    System.out.printf(String.format(Locale.US, "La media del precio es: %.2f%n", +media));
    System.out.println("El cliente puede realizar nuevas reservas (supera límite y contrato firmado y sin multas): "+valido);
        
    }
    
}
