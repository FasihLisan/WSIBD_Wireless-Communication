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
public class pilihMenu {
    public static void main(String[] args) {
        int pilih;
        String nama;
        String namaMakanan = null;
        Scanner in = new Scanner(System.in);
        System.out.println("     CAFE CERIA");
        System.out.println("    ANEKA MINUMAN");
        System.out.println("======================");
        System.out.println("    SPECIAL MENU :");
        System.out.println("1. Soft Drinks");
        System.out.println("2. Mix Juice");
        System.out.println("3. Nescafe");
        System.out.println("4. Soda milk");
        System.out.println("5. Tea");
        System.out.println("======================");
        System.out.print("Masukkan Nama Pembeli : ");
        nama = in.nextLine();
        System.out.print("\nSilahkan masukkan pilihan anda : ");
        pilih = in.nextInt();
        switch(pilih){
            case 1:
                namaMakanan = "Soft Drinks";
                break;
            case 2:
                namaMakanan = "Mix Juice";
                break;
            case 3:
                namaMakanan = "Nescafe";
                break;
            case 4:
                namaMakanan = "Soda milk";
                break;
            case 5:
                namaMakanan = "Tea";
            default:
                System.out.println("Seaharusnya input nomor!!");
        }
        System.out.println("Minuman yang anda pesan adalah "+namaMakanan);
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima KAsih "+nama+" Telah Berkunjung di Cafe Ceria");
    }
}
