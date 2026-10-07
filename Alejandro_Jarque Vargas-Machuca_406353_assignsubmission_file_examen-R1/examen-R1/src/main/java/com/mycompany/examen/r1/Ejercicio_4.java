/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen.r1;
import java.util.Scanner;
/**
 *
 * @author jarqu
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        int categoriaVehiculo = scan.nextInt();
        
        int económico = 1;
        int ejecutivo = 2;
        int independencia = 3;
        
        boolean categoriaVálida = (categoriaVehiculo == económico) || (categoriaVehiculo == ejecutivo) || (categoriaVehiculo == independencia);
        boolean contratoFirmado = true;
        
        boolean todoCorrecto = categoriaVálida && contratoFirmado;
        
        System.out.println("La categoria válida: " + categoriaVálida + "\n" + 
        "El contrato esta firmado: " + contratoFirmado + "\n" + 
        "Todo correcto: " + todoCorrecto);
    }
    
}
