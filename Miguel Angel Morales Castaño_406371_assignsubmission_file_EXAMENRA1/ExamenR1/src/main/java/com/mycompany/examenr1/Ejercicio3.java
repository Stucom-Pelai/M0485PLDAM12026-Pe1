/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenr1;
import java.util.Random;
/**
 *
 * @author mmora
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int dias = random.nextInt(11)+ 5;        
        double precioDia = (42.75);
        double gesFija=(35.00);
    System.out.print(precioDia * dias + gesFija);
    }
    
}
