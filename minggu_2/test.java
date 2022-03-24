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
public class test {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = new  String("DEF");
        String s3 = "AB" + "C";
        
        
        System.out.println("ABC compareTo DEF   :"+ s1.compareTo(s2));
        System.out.println("DEF equals ABC      :"+ s2.equals(s3));
        System.out.println("ABC == ABC          :"+ (s3 == s1));
        System.out.println("DEF compareTo ABC   :"+ s2.compareTo(s3));
        System.out.println("ABC equals ABC      :"+ s3.equals(s1));
        
        
    }
}
