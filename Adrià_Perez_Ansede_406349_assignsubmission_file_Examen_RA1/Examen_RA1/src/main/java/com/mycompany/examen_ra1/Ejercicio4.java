/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_ra1;

import java.util.Scanner;

/**
 *
 * @author perez
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
      int economico = 1;
      int ejecutivo = 2;
      int independencia = 3;
      
      int categoriaVehiculo = scanner.nextInt();
        
      boolean contrato = true;
      boolean esvalida = contrato &&(categoriaVehiculo == economico || categoriaVehiculo == ejecutivo || categoriaVehiculo == independencia );
        
      System.out.println("La seleccion es valida? " + esvalida );
        
    }
    
}
