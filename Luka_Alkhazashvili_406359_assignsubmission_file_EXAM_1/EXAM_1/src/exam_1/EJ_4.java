/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam_1;

import java.util.Scanner;

/**
 *
 * @author lukaa
 */
public class EJ_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una opcion: ECONOMICO:1 EJECUTIVO:2 INDEPENDENCIA:3 ");
        int categoria = scanner.nextInt();
        boolean valida = categoria==1|| categoria==2 ||categoria==3;
        boolean contrato_firmado = true;
        System.out.println("la seleccion es: ");
        System.out.println(valida && contrato_firmado);
        
        
        
        
        
        
        
    }
    
}
