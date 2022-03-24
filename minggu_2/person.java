/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu_2;

/**
 *
 * @author FASIH
 */
import java.util.Scanner;
public class person {
    String fName;
    String lName;
    int stuId;
    String stuStatus;
    
    public person(String fName,String lName, int stuId, String stuStatus){
        this.fName = fName;
        this.lName = lName;
        this.stuId = stuId;
        this.stuStatus = stuStatus;
    }
    public void getName(){
        System.out.println("Student Name: "+fName+" "+lName);
    }
    public void getStuID(){
        System.out.println("Student ID: "+stuId);
    }
    public void getStatus(){
        System.out.println("Student Status: "+stuStatus);
    }
    
    public static void main(String[] args) {
        String nmDepan;
        String nmBelakang;
        int IdMhs;
        String status;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan nama Depan: ");
        nmDepan = in.nextLine();
        System.out.print("Masukkan nama Belakang: ");
        nmBelakang = in.nextLine();
        System.out.print("Status Mahasiswa: ");
        status = in.nextLine();
        System.out.print("Masukkan ID Mahasiswa: ");
        IdMhs = in.nextInt();
       
        System.out.println("\n");
        
        System.out.println("==========IDENTITY============");
        person p = new person(nmDepan, nmBelakang, IdMhs, status);
        p.getName();
        p.getStuID();
        p.getStatus();
        System.out.println("===============================");
    }
}
