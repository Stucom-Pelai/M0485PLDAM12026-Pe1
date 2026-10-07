/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam_1;

import java.util.Random;

/**
 *
 * @author lukaa
 */
public class EJ_3 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Random random = new Random();
        double precio_diario = 42.75;
        int duracion = random.nextInt(10) + 6;
        double tarifa = 35.00;
        System.out.println(tarifa + (precio_diario * duracion));

    }

}
