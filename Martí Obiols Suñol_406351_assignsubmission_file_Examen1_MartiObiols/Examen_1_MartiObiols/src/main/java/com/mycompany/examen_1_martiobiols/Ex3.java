/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_1_martiobiols;

import java.util.Random;

/**
 *
 * @author mobio
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        double num1 = 42.75;
        int tarifa = random.nextInt(10)+5;
        System.out.println(tarifa);
        System.out.println((num1*tarifa)+35);
        
    }
    
}
