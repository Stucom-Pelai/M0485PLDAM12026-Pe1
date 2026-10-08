/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen1;

import java.util.Scanner;

/**
 *
 * @author xavic
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        Scanner scanner = new Scanner(System.in);
        double alquiler1 = scanner.nextDouble(); 
        double alquiler2 = scanner.nextDouble(); 
        double alquiler3 = scanner.nextDouble(); 
        double media = (alquiler1+alquiler2+alquiler3)/3; 
        double total = alquiler1+alquiler2+alquiler3; 
        System.out.println("la media es: " + media);
        boolean superaLimite = total>600; 
        boolean contratoFirmado = true; 
        boolean sinMultas = true; 
        boolean resultado; 
        resultado = superaLimite && (contratoFirmado && sinMultas);   
        System.out.println("El cliente puede realizar nuevas reservas(supera límite y contrato firmado y sin multas): " + resultado);
        
        
        
        
        
    }
    
}
