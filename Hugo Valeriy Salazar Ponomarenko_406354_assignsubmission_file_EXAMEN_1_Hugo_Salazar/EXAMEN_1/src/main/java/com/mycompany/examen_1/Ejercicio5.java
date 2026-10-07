/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_1;

import java.util.Scanner;

/**
 *
 * @author hubit
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        int alquiler1 = scanner.nextInt();
        int alquiler2 = scanner.nextInt();
        int alquiler3 = scanner.nextInt();
        
        int sumaTotal = alquiler1 + alquiler2 + alquiler3;
        
        boolean superaLimite = sumaTotal > 600;
        
        boolean contratoFirmado = true;
        
        boolean sinMulta = true; 
        
        boolean reserva = superaLimite && contratoFirmado && sinMulta;
        
        System.out.println("El cliente puede realizar nuevas reservas (supera limite y contrato firmado y sin multas): " + reserva);
    }
    
}
