package Ders;

import java.util.Scanner;

public class C21StringManipulationileMailKontrol {
    public static void main(String[] args) {

        /*
        Email kontrolu yapan bir program yaziniz.Kullanicinin girdigi sifre
        -@ isareti icermiyorsa gecersiz email yazdirin
        -@gmail.com isareti icermiyorsa "Lutfen gmail adresinizi girin" yazdirin
        -@gmail.com ile bitmiyorsa ""Yazimda bir sorun var, maili kontrol ediniz" yazdirin.

         */


        String email = emailKontrol();
    }

    public static String emailKontrol() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir mail giriniz : ");
        String email = scan.nextLine();

        if (email.indexOf('@')==-1) {
            System.out.println("Gecersiz email");
        }

        if (!(email.contains("@gmail.com"))) {
            System.out.println("Lutfen gmail adresinizi girin");
        }

        if (!(email.endsWith("@gmail.com"))) {
            System.out.println("Yazimda bir sorun var, maili kontrol ediniz");

        }
        else {
            System.out.println("Email adresiniz kaydedildi");

        }
        return email;
    }

    }

