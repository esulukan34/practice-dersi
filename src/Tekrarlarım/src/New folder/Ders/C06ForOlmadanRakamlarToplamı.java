package Ders;

import java.util.Scanner;

public class C06ForOlmadanRakamlarToplamı {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı pozitif bir tamsayı giriniz");
        int sayi = scan.nextInt();  //5267

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int ilkGirilenSayi=sayi;

        // şu anda sayi 5267 bb:0,rt:0

        birlerBasamagi = sayi % 10;  // 7
        rakamlarToplami += birlerBasamagi;
        sayi /= 10; // sayi=526

        // şu anda sayi:526 bb:7,rt:7
        birlerBasamagi = sayi % 10; // 6
        rakamlarToplami += birlerBasamagi; // rt:7+6=13
        sayi /= 10; //52

        // şu anda sayi:52,bb:6,rt:13;

        birlerBasamagi = sayi % 10; // 2
        rakamlarToplami += birlerBasamagi; //rt:7+6+2=15
        sayi /= 10; // 5
        // şu anda sayi:5,bb:2,rt:15

        birlerBasamagi=sayi%10; // 5
        rakamlarToplami+=birlerBasamagi; // rt:7+6+2+5:20
        sayi/=10; //0
        //şu anda sayi:0,bb:5,rt:20
        System.out.println(ilkGirilenSayi+" sayısının rakamlar toplamı: "+rakamlarToplami);





    }
}
