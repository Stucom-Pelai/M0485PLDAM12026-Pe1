/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen1_viernes2_ainhoa;

import java.util.Locale;

/**
 *
 * @author ainhoa
 */
public class Ejercicio2_Ainhoa {

    /**
     * @param args the command line arguments
     */
    public static final double euro = 1.0;
    public static final double libras = 0.86;
    public static final double descuentoCorporativo = 0.08;

    public static void main(String[] args) {
    boolean equivale = euro==libras;
    
    double costeAlquiler = 200.0 / 0.86;
    double descuento = costeAlquiler * descuentoCorporativo;
    
    System.out.printf(Locale.US, "Total: %.2f libras\n",descuento);
    
    }
    
}
