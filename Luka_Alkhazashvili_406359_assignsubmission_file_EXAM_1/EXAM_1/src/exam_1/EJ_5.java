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
public class EJ_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double alquiler_1 = scanner.nextDouble();
        double alquiler_2 = scanner.nextDouble();
        double alquiler_3 = scanner.nextDouble();
        double suma = alquiler_1 + alquiler_2 + alquiler_3;
        boolean superalimite = suma >600 ;
        boolean contratofirmado = true;
        boolean sinmultas = true;
        System.out.println("la media " + suma/3);
        System.out.println("El cliente puede realizar nuevbas reservas(supera limite y contrato firamdo y sin multas: ");
        System.out.println(contratofirmado && sinmultas && superalimite);
        
        
        
        
        
        
        
    }
    
}
