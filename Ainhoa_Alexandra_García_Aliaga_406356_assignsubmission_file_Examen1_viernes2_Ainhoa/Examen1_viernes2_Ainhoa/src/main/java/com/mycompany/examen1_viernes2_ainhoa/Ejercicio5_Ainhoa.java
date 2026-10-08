/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen1_viernes2_ainhoa;

import java.util.Scanner;

/**
 *
 * @author ainhoa
 */
public class Ejercicio5_Ainhoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        String gasto = scanner.nextLine();
        
        boolean superaLimite = gasto>600;
        boolean contratoFirmado = true;
        boolean sinMultas = true;
        
        System.out.println("El cliente debe realizar nuevas reservas(supera límite y contrato firmado y sin multas:true/false)"+contratoFirmado);
        
    }
    
}
