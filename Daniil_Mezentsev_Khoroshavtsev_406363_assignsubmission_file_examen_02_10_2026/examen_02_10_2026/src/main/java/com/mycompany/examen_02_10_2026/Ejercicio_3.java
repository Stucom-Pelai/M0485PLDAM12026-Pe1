/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_02_10_2026;
import java.util.Random;
/**
 *
 * @author Usuario
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        int dias = random.nextInt(10)+5;
        System.out.println("el vehiculo fue alquilado durante "+ dias+ " dias y ahora debes " + (dias*42.75) + "euros y con tarifa de 35 euros son "+(dias*42.75+35)+ "euros");
    }
    
}
