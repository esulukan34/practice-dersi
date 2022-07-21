package TEKRARLAR;

import java.util.Scanner;

public class C26_Palindrom {
    /*
        Soru 9 ) Interview Question
    Kullanicidan bir String isteyin. Kullanicinin girdigi String’in
    palindrome olup olmadigini kontrol eden bir program yazin.
         */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz : ");
        String kelime=scan.nextLine();
        String tersKelime= kelime.substring(kelime.length()-1);

        for (int i = kelime.length()-2; i >=0 ; i--) {
            tersKelime += kelime.substring(i,i+1);
        }

        System.out.println("tersKelime = " + tersKelime);

        if(kelime.equalsIgnoreCase(tersKelime)){
            System.out.println("Girilen kelime palindromdur.");
        }else
            System.out.println("Girilen kelime palindrom degildir.");




    }
}
