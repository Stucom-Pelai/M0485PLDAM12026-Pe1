/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_1;

import java.util.Scanner;

/**
 *
 * @author hubit
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        int economico = 1;
        int ejecutivo = 2;
        int independencia = 3;
        
        int categoria = scanner.nextInt();
        boolean contrato = true;
        
        System.out.println("Escoge: economico(1) o ejecutivo(2) o independencia(3)");
        
        boolean vheiculo = (categoria == economico || categoria == ejecutivo || categoria == independencia) && contrato;
        
        System.out.println("La categoria seleccionada es: " + vheiculo);
    }
    
}
