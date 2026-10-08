/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_viernes;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author joser
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);
    
    System.out.println("Dime la categoria de vehiculo: ");
    
    int Economico = 1;
    int Ejecutivo = 2;
    int Independencia = 3;
    
    int categoriaVehiculo = scanner.nextInt();
    boolean contratoFirmado = true;
    
    boolean esvalida = (categoriaVehiculo == Economico || categoriaVehiculo == Ejecutivo || categoriaVehiculo == Independencia) && contratoFirmado;
    System.out.println("La eleccion es valida?: " + esvalida);
    
        // TODO code application logic here
    }
    
}
