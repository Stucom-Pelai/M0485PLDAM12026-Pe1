/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenra1;

import java.util.Scanner;

/**
 *
 * @author jiali
 */
public class ej4 {

    /**
     * @param args the command line arguments
     */
    // se me olvido como escribir lo de insert scanner
    
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner scanner = new Scanner(System.in);
        System.out.println("Elige categoria de vehiculo: \n"
                + "Economico \n"
                + "Ejecutivo \n"
                + "Independencia ");
        String opt= scanner.nextLine();
        System.out.println("Tu contrato esta firmado?");
        boolean contrato=scanner.nextBoolean();
        boolean  accept= contrato==true;
       
        
        System.out.println("Escojistes el vehiculo: "+opt+". Es valido tu contrato?: "+ accept);
        
       
        
        
        
        
    }
    
}
