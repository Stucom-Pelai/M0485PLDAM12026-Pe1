/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen1;

import java.util.Scanner;

/**
 *
 * @author gianp
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Introduce el primer valor:");
        int alq1 = scanner.nextInt();
        System.out.println("Introduce el segundo valor:");
        int alq2 = scanner.nextInt();
        System.out.println("Introduce el tercer valor:");
        int alq3 = scanner.nextInt();
        
        int suma = alq1+alq2+alq3;
        int media = (alq1+alq2+alq3)/3;
            System.out.println(media);
            
            
        boolean superalimite = (suma>600); 
            System.out.println("supera el limite? " + superalimite);
        boolean contratofirmado = (true);
            System.out.println("Esta el contrato firmado? " + contratofirmado);
        boolean sinmultas = (true);
            System.out.println("Sin multas? " + sinmultas);
        boolean valido = (superalimite==false) && (contratofirmado==true) && (sinmultas==true);
            System.out.println("El cliente puede realizar nuevas reservas: " + valido);
        
        
    }
    
}
