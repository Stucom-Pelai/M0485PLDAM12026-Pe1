/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenviernes;

import java.util.Scanner;

/**
 *
 * @author kibmo
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Introduzca categoria de vehiculo:");
        int categoriaVehiculo=scanner.nextInt();
        boolean firmado=true;
        boolean validez=(categoriaVehiculo>0)&&(categoriaVehiculo<=3)&&firmado;
        
        System.out.println("Esta confirmado el contrato del alquiler? "+validez);//en caso de false es pq el numero introducido no es 1,2 o 3
        
        
        
        
        
        
        scanner.close ();    
    }
    
}
