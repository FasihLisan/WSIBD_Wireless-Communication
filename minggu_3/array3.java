/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu_3;

/**
 *
 * @author FASIH
 */
public class array3 {
    public static void main(String[] args) {
        int[][] angka= {{5,6,1,7},{8,1,2,9},{5,4,7,1},{8,3,7,5}};
        for (int baris = 0; baris < angka.length; baris++) {
            for (int kolom = 0; kolom < angka[baris].length; kolom++) {
                System.out.print(angka[baris][kolom]);
            }
            System.out.println("  ");
       }
    }
}
