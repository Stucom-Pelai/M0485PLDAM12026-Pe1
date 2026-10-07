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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        // TODO code application logic here
    double precio = 200;
    double tarifa = 8;
    double cambio = precio*0.86;
    double resultado = cambio - tarifa;
        System.out.println("El precio en libras es: " + resultado);
        
        
    }
    
}
