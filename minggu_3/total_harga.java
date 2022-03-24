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
import java.util.Scanner;
public class total_harga {
    public static void main(String[] args) {
        String nama;
        int[] hargaBarang = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("        Karisma Agung Plasa <KAP>");
        System.out.println("         Promo Belanja Berhadiah");
        System.out.println("     Khusus Pembeli 5 Barang Pertama");
        System.out.println("    Dengan Harga Minimum Rp. 10000,00");
        System.out.println("===========================================");
        System.out.print("Masukkan nama pembeli : ");
        nama = in.nextLine();
        int num=1;
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan harga barang ke-"+num+++"   :");
            hargaBarang[i] = in.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < hargaBarang.length; i++) {
            sum = sum+hargaBarang[i];
        }
        System.out.println("Total harag pembelian atas nama "+nama+" adalah Rp "+sum);
        System.out.println("Selamat.....");
        System.out.println("Anda mendapat sebuah hadian 1 mug cantik");
        System.out.println("===========================================");
        System.out.println("                Terima kasih");
        System.out.println(" Anda sudah belanja di Kharisma Agung Plaza");
        
    }
}
