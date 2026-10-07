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
public class EJ_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double coste = 200.00;
        double conver = 0.86;
        double desc = 0.08;
        double conv_desc = conver - desc;
        System.out.println("el alquiler sale a " + coste * conv_desc);

    }

}
