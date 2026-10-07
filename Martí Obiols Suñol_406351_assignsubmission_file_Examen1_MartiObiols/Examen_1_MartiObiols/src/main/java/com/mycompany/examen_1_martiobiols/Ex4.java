/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_1_martiobiols;

import java.util.Scanner;

/**
 *
 * @author mobio
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int categoriaVehiculo = scanner.nextInt();
        boolean contrato = true;
        System.out.println((categoriaVehiculo>0)&&(categoriaVehiculo<4)&&(contrato = true));
        
    }
    
}
