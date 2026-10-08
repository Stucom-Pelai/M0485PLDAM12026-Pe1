/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_pr01;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        int alquiler1 = scanner.nextInt();
        int alquiler2 = scanner.nextInt();
        int alquiler3 = scanner.nextInt();
        int suma = alquiler1 + alquiler2 + alquiler3;
        int media= suma / 3;
        System.out.println("La media es: " + media);
        
        boolean superaLimit = suma > 600;
        boolean contratoFirmado = true;
        boolean sinMultas = true;
        boolean correcto = superaLimit && contratoFirmado && sinMultas;
        System.out.println("El cliente puede realizar nuevas reservas (supera limite y contrato firmado y sin multas): " + correcto);
        
                
                
        
    }
    
}
