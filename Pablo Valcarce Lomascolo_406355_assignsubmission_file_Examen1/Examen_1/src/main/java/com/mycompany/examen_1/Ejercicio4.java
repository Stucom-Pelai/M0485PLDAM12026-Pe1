/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_1;

import java.util.Scanner;

/**
 *
 * @author vlpab
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seleccione una categoria:  Económico(1)  Ejecutivo(2)  Independencia(3)");
        int categoriaVehiculo = scanner.nextInt();
        boolean contrato  = true;
        boolean elección = (categoriaVehiculo >= 1 && categoriaVehiculo <= 3);
        boolean esValida = elección && contrato;
        System.out.println("La elección es valida? " + esValida);
        
        
    }
    
}
