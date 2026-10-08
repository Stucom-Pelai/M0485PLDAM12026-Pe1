/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenr1;

import java.util.Scanner;

/**
 *
 * @author mmora
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        double alqu1 = scanner.nextDouble();
        double alqu2 = scanner.nextDouble();
        double alqu3 = scanner.nextDouble();
        double total = (alqu1 + alqu2 + alqu3);
        System.out.println("Media: " + total/3);
        boolean supLim = (total>600);
        boolean contratoFirmado = true;
        boolean sinMultas = true;
        boolean can =(supLim && contratoFirmado && sinMultas);
        System.out.println("El cliente puede realizar nuevas reservas(supera limite y contrato firmado y sin multas): " + can );
               
    }
    
}
