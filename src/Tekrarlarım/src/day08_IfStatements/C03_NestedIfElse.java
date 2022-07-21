package day08_IfStatements;

import java.util.Scanner;

public class C03_NestedIfElse {
     /*
        emeklilik kontrolu yapan bir program yazınız
        cinsiyet olarak Erkek veya Kadın degiskenlerini kabul etsin.

        Farkli bir harf veya sembol girilirse hata mesajı versin.
        kadinlarda yas siniri 60, erkekler de 65 olsun

        negatif yas veya 80'den buyuk yas girilirse hata mesaji versin.
         */
     public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
         System.out.println("Lütfen cinsiyetinizi giriniz");
         String cinsiyet= scan.next().toUpperCase();
         System.out.println("Lütfen yasinizi giriniz");
         double yas= scan.nextDouble();

         if(cinsiyet=="Erkek"){
             if(yas<0 || yas>80){
                 System.out.println("Geçerli bir yaş giriniz");
             } else if (yas<65) {
                 System.out.println("Emekli olamazsınız");
             }else {
                 System.out.println("Emekli olabilirsiniz");
             }


         } else if (cinsiyet=="Kadın") {
             if(yas<0 || yas>80){
                 System.out.println("Geçerli bir yaş giriniz");
             } else if (yas<60) {
                 System.out.println("Emekli olamazsınız");
             }else {
                 System.out.println("Emekli olabilirsiniz");
             }
         } else{
             System.out.println("Lütfen geçerli bir tercih giriniz");
         }


     }
}
