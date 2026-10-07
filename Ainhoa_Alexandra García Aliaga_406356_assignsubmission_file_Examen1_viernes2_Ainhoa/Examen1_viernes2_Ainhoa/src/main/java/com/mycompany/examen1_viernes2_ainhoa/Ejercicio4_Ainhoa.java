/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen1_viernes2_ainhoa;

import java.util.Scanner;

/**
 *
 * @author ainhoa
 */
public class Ejercicio4_Ainhoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Económico (1), Ejecutivo (2) e Independencia (3)");
        String categoriaVehiculo = scanner.nextLine();
        
        boolean resp = scanner.nextBoolean();
        System.out.println("Elección "+ resp);

        
        System.out.println("Contrato firmado? ");
        boolean contratoSi = true;
        System.out.println(contratoSi);




    }
    
}
