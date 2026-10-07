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
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public final static int SUPERA_LIMITE= 600;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        double media=(a+b+c)/3;
       double total=a+b+c;
       
       System.out.printf(Locale.US,"La media es: %.2f euros\n",media);
       System.out.println("El cliente puede realizar nuevas reservas (supera límite y contrato firmado y sin multas): true/false");
       System.out.println("Supera el límite? ");
       System.out.println(total<=SUPERA_LIMITE);
       System.out.println("Contrato firmado?");
       boolean contratoFirmado=scanner.nextBoolean();
       System.out.println("Sin multas?");
       boolean multas=scanner.nextBoolean();
       System.out.println(multas&&contratoFirmado&&total<=SUPERA_LIMITE);
       
       
       
    }
    
}
