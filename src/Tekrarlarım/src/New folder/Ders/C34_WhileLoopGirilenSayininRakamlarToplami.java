package Ders;

import java.util.Scanner;

public class C34_WhileLoopGirilenSayininRakamlarToplami {
    public static void main(String[] args) {
         /*
        Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println(Integer.MAX_VALUE);
        System.out.print("Lutfen bir sayi giriniz : ");
        int input= scan.nextInt();


        int rakamlarToplami=0;
        int birlerBasamagi=0;
        int temp=input;




        while(temp>0){
            birlerBasamagi=temp%10;
            rakamlarToplami+=birlerBasamagi;
            temp/=10;

        }
        System.out.println(input+" sayisinin rakamlar toplami : "+rakamlarToplami);






    }
}
