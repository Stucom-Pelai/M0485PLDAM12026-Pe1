/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_1_martiobiols;

import java.util.Scanner;

/**
 *
 * @author mobio
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        //alquileres
        double num1 = scanner.nextInt();
        double num2 = scanner.nextInt();
        double num3 = scanner.nextInt();
        double media = (num1+num2+num3)/3;
        System.out.println(media);
        boolean superaLimite = (num1+num2+num3)>600;
        boolean contratoFirmado = true;
        boolean sinMultas = true;
        System.out.println("El cliente puede realizar nuevas reservas "+(superaLimite && contratoFirmado && sinMultas));


        
    }
    
}
