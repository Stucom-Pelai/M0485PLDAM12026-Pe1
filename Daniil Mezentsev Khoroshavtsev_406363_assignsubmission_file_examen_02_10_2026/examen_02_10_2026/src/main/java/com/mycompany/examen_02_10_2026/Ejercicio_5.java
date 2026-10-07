/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_02_10_2026;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        int gasto1 = scanner.nextInt();
        int gasto2 = scanner.nextInt();
        int gasto3 = scanner.nextInt();
        int superaLimite = 600;
        boolean contratoFirmado = true;
        boolean sinMultas = true;
        System.out.println("El cliente gasto en total"+ (gasto1+gasto2+gasto3));
        System.out.println("El cliente puede realizar nuevas reservas (supera limite y contrato firmado y sin multas):"+ (((gasto1+gasto2+gasto3)>superaLimite)&&contratoFirmado&&sinMultas));
        
    }
    
}
