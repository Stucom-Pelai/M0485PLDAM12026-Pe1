/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenoficial;

import java.util.Scanner;

/**
 *
 * @author hugov
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Seleciona la categoria del vehiculo: ");
        int categoriaVehiculo= scanner.nextInt();
       
        boolean valido= (categoriaVehiculo==1)||(categoriaVehiculo==2)||(categoriaVehiculo==3);
        boolean contrato= true;
        boolean validacionFinal= valido & contrato;
        System.out.println("El contrato es: "+contrato);
        System.out.println("El proceso de selecion de vehiculos es (Valido=true/noValido=false): "+validacionFinal);
    }
    
}
