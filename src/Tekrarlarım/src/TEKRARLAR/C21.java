package TEKRARLAR;

import java.util.Scanner;

public class C21 {
     /*
        Email kontrolu yapan bir program yaziniz.Kullanicinin girdigi sifre
        -@ isareti icermiyorsa gecersiz email yazdirin
        -@gmail.com isareti icermiyorsa "Lutfen gmail adresinizi girin" yazdirin
        -@gmail.com ile bitmiyorsa ""Yazimda bir sorun var, maili kontrol ediniz" yazdirin.

         */
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("email giriniz : ");


         String email=scan.nextLine();

         if(!email.contains("@")){
             System.out.println("Gecersiz email");
         }else if(!email.contains("@gmail.com")){
             System.out.println("Lutfen gmail adresinizi girin");
         }else if (!email.endsWith("@gmail.com")){
             System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
         }else
             System.out.println("Dogru mail adresi girdiniz");
     }
}
