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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int categoria1 = 1;
        int categoria2 = 2;
        int categoria3 = 3;
        int categoriaVehiculo = scanner.nextInt();
        boolean esValida = categoriaVehiculo >= 1 && categoriaVehiculo <= 3;
        boolean firmado = true;
        boolean todovalido = esValida && firmado;
        System.out.println("La eleccion es valida: " + todovalido);
    }
    
}
