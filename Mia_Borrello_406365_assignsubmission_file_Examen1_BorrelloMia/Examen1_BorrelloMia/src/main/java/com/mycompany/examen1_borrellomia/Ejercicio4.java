/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen1_borrellomia;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author miabo
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);
    
    int categoriaVehiculo=scanner.nextInt();
    boolean contrato=scanner.nextBoolean();
    
    boolean valido = (categoriaVehiculo<=3 && categoriaVehiculo>1) && contrato;
    System.out.println(valido);
        
    }
    
}
