/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenoficial;

import java.util.Scanner;

/**
 *
 * @author hugov
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        // TODO code application logic here
        System.out.println("Escribe el coste del alquiler 1: ");
        int alquiler1= scanner.nextInt();
        System.out.println("Escribe el coste del alquiler 2: ");
        int alquiler2= scanner.nextInt();

        System.out.println("Escribe el coste del alquiler 3: ");
        int alquiler3= scanner.nextInt();
       
        boolean superaLim=(alquiler1+alquiler2+alquiler3)>600;
        boolean contratoFirmado=true;
       boolean sinMultas=true;
       boolean valida= superaLim & sinMultas & contratoFirmado;
       double media=(alquiler1+alquiler2+alquiler3)/3.00;
        System.out.println("La media de los alquileres es: "+media);
        System.out.println("El cliente puede realizar nuevas reservas (supera el limite y contrato firmado y sin multas): "+valida);
    }
    
}
