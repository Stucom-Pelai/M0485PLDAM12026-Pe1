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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Introduzca precios de los alquileres:");
        double alq1=scanner.nextDouble();
        double alq2=scanner.nextDouble();//pongo los precios introducibles como double porque quiero ponerlo en situacion real, donde el precio de un alquiler puede tener decimales
        double alq3=scanner.nextDouble();
        double mediaAlqs= (alq1+alq2+alq3)/3;
        System.out.println("Media de los alquileres: "+mediaAlqs);
        double gastoTotal=alq1+alq2+alq3;
        boolean superaLimite=gastoTotal>600;
        boolean contratoFirmado=true;
        boolean sinMultas=true;
        boolean cumpleCondiciones= (superaLimite) && contratoFirmado && sinMultas;
        System.out.println("El cliente puede realizar nuevas reservas (supera limite y contrato firmado y sin multas): "+cumpleCondiciones); 
    }
    
}
