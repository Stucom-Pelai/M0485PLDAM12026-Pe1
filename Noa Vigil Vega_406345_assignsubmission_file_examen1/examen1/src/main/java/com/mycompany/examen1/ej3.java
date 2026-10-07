/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen1;
import java.util.Locale;
import java.util.Random;
import java. util.Scanner;
/**
 *
 * @author noavi
 */
public class ej3 {

    public static void main(String[] args) {
        
                Random random = new Random();

        double preciodiario = 42.75;
        int duracion = random.nextInt (10) + 6;
        System.out.print("El cliente tendra que pagar: " + ((preciodiario*duracion)+35) + " euros");




    }
}
