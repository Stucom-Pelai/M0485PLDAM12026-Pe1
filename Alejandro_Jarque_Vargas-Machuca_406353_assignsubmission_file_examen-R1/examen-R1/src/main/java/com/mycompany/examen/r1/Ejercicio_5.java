/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen.r1;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author jarqu
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        
        double alquiler1 = scan.nextDouble();
        double alquiler2 = scan.nextDouble();
        double alquiler3 = scan.nextDouble();
        
        int numAlquileres = 3;
        
        double mediaAlquiler = (alquiler1 + alquiler2 + alquiler3) / numAlquileres;
        
        boolean superaLimite = mediaAlquiler > 600;
        boolean contratoFirmado = true;
        boolean sinMultas = true;
        
        boolean todoCorrecto = superaLimite && contratoFirmado && sinMultas;
        
        System.out.println("El cliente puede realizar nuevas reservas (supera límite y contrato firmado y sin multas): " + todoCorrecto);
    }
    
}
