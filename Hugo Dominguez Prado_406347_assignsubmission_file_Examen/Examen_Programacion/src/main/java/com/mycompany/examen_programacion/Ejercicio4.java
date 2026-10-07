/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_programacion;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
         boolean economico = scanner.nextBoolean();
         boolean ejecutivo = scanner.nextBoolean();
         boolean independencia = scanner.nextBoolean();
         boolean firmado = scanner.nextBoolean();
         boolean categoriaVehiculo = (economico || ejecutivo || independencia) && firmado == true;
         System.out.println("La seleccion es valida: " + categoriaVehiculo);
    }
    
}
