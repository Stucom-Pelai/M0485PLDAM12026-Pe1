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
public class ej5 {

    
     //sin insert scanner porque se me olvida cosas, copia y pega de otra actividad.
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tus 3 alquilers");
        int alq1= scanner.nextInt();
        int alq2= scanner.nextInt();
        int alq3= scanner.nextInt();
        int total=alq1+alq2+alq3;
        
        int media= total /3;
        
        boolean superalimite= total>600;
        System.out.println("Tu contrato esta firmado?");
        boolean contratofirmado= scanner.nextBoolean();
        System.out.println("Estas sin multas?");
        boolean sinmultas=scanner.nextBoolean();
        
        boolean nuevas= superalimite&& contratofirmado &&sinmultas ==true;
         System.out.println("La media de alquiler es: "+media);
        System.out.println("El cliente puede realizar nuevas reservas: "+nuevas);
        
        
    }
    
}
