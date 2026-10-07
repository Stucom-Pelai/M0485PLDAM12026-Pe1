/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_1;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Life&Beauty
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public final static int MIN_NUM= 1;
    public final static int MAX_NUM= 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
       int categoriaVehiculo=scanner.nextInt();
       System.out.print("La elección es: "+(categoriaVehiculo>=MIN_NUM&&categoriaVehiculo<=MAX_NUM));
    
        
        
        
    }
    
}
