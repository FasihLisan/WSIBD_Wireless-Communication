/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu_3;

import com.sun.media.sound.SoftAbstractResampler;

/**
 *
 * @author FASIH
 */
public class array1Dimensi {
    public static void main(String[] args) {
        int[] angka = {5,10,17,20,1};
        String[] teks = {"Saya","sedang","belajar","oop","java"};
        
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }
        for (int j = 0; j < teks.length; j++) {
            System.out.println(teks[j]);
            System.out.println(" ");
        }
    }
}
