/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_1;

import java.util.Scanner;

/**
 *
 * @author pauhe
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
           System.out.println("----------------------------");
           System.out.print("Escribe que opcion quieres elegir: 1.Economico    2. Ejecutivo   3.Independencia :");
        int opc = scanner.nextInt();
        
       boolean categoriaVehiculo = opc == 1 || opc ==2 || opc ==3;
        
        System.out.println("Tu opcion es valida:" + categoriaVehiculo);
        
        
        
        
        
    }
    
}
