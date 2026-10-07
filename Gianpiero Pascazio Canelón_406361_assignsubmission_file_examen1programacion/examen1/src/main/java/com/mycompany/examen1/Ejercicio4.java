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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                        Scanner scanner = new Scanner(System.in);

        // TODO code application logic here
        System.out.println("Elija una categoria: ");
        int categoriavehiculo = scanner.nextInt();
        boolean valido = (categoriavehiculo>=1) && (categoriavehiculo<=3);
        System.out.println("La categoria seleccionada es: " + valido);
                boolean contrato = (true);
        System.out.println("Contrato firmado? " + contrato);
        boolean confirmacion = (valido==true) && (contrato==true);
        System.out.println("Reserva confirmada? " + confirmacion);
    }
    
}
