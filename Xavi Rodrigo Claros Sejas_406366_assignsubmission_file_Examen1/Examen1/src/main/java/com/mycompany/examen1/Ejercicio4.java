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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner scanner = new Scanner(System.in);
        int categoriaVehiculo = scanner.nextInt(); 
        boolean resultado; 
        boolean contrato = true;
        resultado = (categoriaVehiculo == 1 || categoriaVehiculo == 2 || categoriaVehiculo == 3 ) && contrato; 
        System.out.println("La selección es valida: " + resultado);
        
        
        
        
    }
    
}
