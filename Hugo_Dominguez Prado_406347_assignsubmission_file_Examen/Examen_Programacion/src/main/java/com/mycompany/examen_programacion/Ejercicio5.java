    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_programacion;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int alquiler1 = scanner.nextInt();
        int alquiler2 = scanner.nextInt();
        int alquiler3 = scanner.nextInt();
        double media = (alquiler1 + alquiler2 + alquiler3) / 3;
        double superaLimite = alquiler1 + alquiler2 + alquiler3;
        boolean contratoFirmado = scanner.nextBoolean();
        boolean sinMultas = scanner.nextBoolean();
        boolean resultado = (superaLimite > 600) && (contratoFirmado )&& (sinMultas);
        System.out.println("Esta es la media de los gastos: "+media);
        System.out.println("El cliente puede realizar nuevas reservas: "+resultado);
    }
    
}
