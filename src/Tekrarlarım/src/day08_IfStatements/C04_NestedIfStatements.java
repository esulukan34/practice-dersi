package day08_IfStatements;

import java.util.Scanner;

public class C04_NestedIfStatements {

        /*
    Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
    Girdiği sayi 5’e bölünüyorsa son rakamını kontrol edin.
    Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
    Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
    Girdiği sayi 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
     */

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı bir sayi giriniz");
        int sayi= scan.nextInt();

        // sayının 5e bolunup bplunmemesi
        // sayinin son basamaginin sifir olup olmamasi

        if(sayi<1000 || sayi>9999){
            System.out.println("Lütfen geçerli bir sayi giriniz");
        } else if (sayi%5==0) {
            if(sayi%10==0){
                System.out.println("5’e bölünen çift sayı");
            }else{
                System.out.println("5’e bölünen tek sayı");
            }

        }else{
            System.out.println("Tekrar deneyin");
        }


    }
}
