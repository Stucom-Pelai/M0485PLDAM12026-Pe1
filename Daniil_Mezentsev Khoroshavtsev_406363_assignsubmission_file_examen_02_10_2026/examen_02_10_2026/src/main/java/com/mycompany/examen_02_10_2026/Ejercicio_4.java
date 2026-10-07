/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_02_10_2026;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("eligue el vehiculo:");
        System.out.print("(1) Economico\n(2) Ejecutivo\n(3) Independencia\nEligue:");
        int categoriaVehiculo = scanner.nextInt();
        System.out.print("Contrato firmado? (true o false):");
        boolean contratoFirmado = scanner.nextBoolean();
        System.out.print("la disponiblidad de este vehiculo: " + (1 <= categoriaVehiculo && 3 >= categoriaVehiculo && contratoFirmado));
        
        // TODO code application logic here
    }
    
}
