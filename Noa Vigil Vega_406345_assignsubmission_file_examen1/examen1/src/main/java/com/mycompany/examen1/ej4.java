/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen1;
import java.util.Locale;
import java. util.Scanner;
/**
 *
 * @author noavi
 */
public class ej4 {

    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        
        
        System.out.println("Escoja una categoria de vehiculo: \n(1) Economico \n(2) Ejecutivo \n(3) Independencia");
        int categoriaVehiculo = scanner.nextInt();
        boolean contratofirmado = true;
        boolean valido = categoriaVehiculo > 0 && categoriaVehiculo < 4 && contratofirmado;
        System.out.println(valido);




    }
}
