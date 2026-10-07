/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen.r1;
import java.util.Locale;

/**
 *
 * @author jarqu
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double alquilerEnEuros = 200.00;
        double cambioALibras = 0.86;
        double tarifaDescuento = 8.00;
        
        double alquilerEnLibras = (alquilerEnEuros * cambioALibras) - tarifaDescuento;
        System.out.printf(Locale.US, "El alquiler final en libras es: %.2f\n", alquilerEnLibras);
    }
    
}
