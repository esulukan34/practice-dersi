package day3_practice;

import java.util.Scanner;

public class Q01_StringManipulaton {

    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("cumle olusturmak icin birinci kelimeyi giriniz : ");
        String str1=sc.nextLine().toLowerCase();
        System.out.print("cumle olusturmak icin ikinci kelimeyi giriniz : ");
        String str2=sc.nextLine().toLowerCase();
        System.out.print("cumle olusturmak icin ucuncu kelimeyi giriniz : ");
        String str3=sc.nextLine().toLowerCase();
        System.out.print("cumle olusturmak icin dorducu kelimeyi giriniz : ");
        String str4=sc.nextLine().toLowerCase();

        System.out.println(str1.substring(0,1).toUpperCase() +str1.substring(1)+" "+ str2 +" "+ str3 +" "+ str4 + ".");
    }
}
