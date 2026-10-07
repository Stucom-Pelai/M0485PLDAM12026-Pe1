/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenviernes;

import java.util.Scanner;
/**
 *
 * @author Viviana
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        int acumulado = 0;
        
        System.out.println("Indica el coste del alquiler:");
        int alquiler1 = scanner.nextInt();
        acumulado += alquiler1;
        
        System.out.println("Indica el coste del alquiler:");
        int alquiler2 = scanner.nextInt();
        acumulado += alquiler2;
        
        
        System.out.println("Indica el coste del alquiler:");
        int alquiler3 = scanner.nextInt();
        acumulado += alquiler3;
        
        int media = acumulado / 3;
        System.out.println("La media es:" + media);
        
        boolean superaLimit = acumulado > 600;
        boolean contratoFirmado = true;
        boolean sinMultas = true;
        boolean resultado = superaLimit == contratoFirmado && superaLimit == sinMultas;
        System.out.println("El cliente puede realizar nuevas reservas(supera limite y contrato firmado y sin multas):" + resultado);
        
    }
    
}
