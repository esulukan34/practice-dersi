package day08_IfStatements;

import java.util.Scanner;

public class C05_NestedIfElseStatements {
    /*
        Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        Kullanicidan bir sifre girmesini isteyin
        Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin.
        Ilk harf A ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.
        Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin.
        Ilk harf z ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.
         */

    //ilk harf buyuk mu kucuk mu
    //ilk harf A veya z mi ?

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir şifre giriniz");
        String sifre = scan.nextLine();
        char ilkHarf= sifre.charAt(0);

        if(ilkHarf >= 'A' && ilkHarf <= 'Z'){

            if(ilkHarf == 'A'){
                System.out.println("Geçerli şifre");
            }else{
                System.out.println("Geçersiz şifre");
            }

        }else if (ilkHarf>= 'a' && ilkHarf <='z'){
            if(ilkHarf == 'a'){
                System.out.println("Geçerli şifre");
            }else{
                System.out.println("Geçersiz şifre");
            }


        }
    }
}
