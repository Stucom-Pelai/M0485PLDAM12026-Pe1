/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenoficial;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author hugov
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         Random random = new Random();
        // TODO code application logic here
        int dias= random.nextInt(10)+5;
        double precioD= 42.75;
        int tarifa= 35;
        double fin= dias*42.75+35;
        System.out.println(" El total de días es: "+dias);
        System.out.println("El precio del aliquiler es: "+fin);
        
    }
    
}
