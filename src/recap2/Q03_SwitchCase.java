package recap2;

import java.util.Scanner;

public class Q03_SwitchCase {
    //         ***INTERWIEV***


    // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Uc basamakli bir sayi giriniz : ");
        int sayi = sc.nextInt();

        int birlerBas = sayi % 10, onlarBas = (sayi / 10) % 10, yuzlerBas = sayi / 100;
        /*
        sayi/=10;
        int onlarBas= sayi%10;
        sayi/=10;
        int yuzlerBas= sayi;
        */

        if (sayi > 99 && sayi < 1000) {
            switch (yuzlerBas) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("yuz\t");
                    break;
                case 2:
                    System.out.print("ikiyuz\t");
                    break;
                case 3:
                    System.out.print("ucyuz\t");
                    break;
                case 4:
                    System.out.print("dortyuz\t");
                    break;
                case 5:
                    System.out.print("besyuz\t");
                    break;
                case 6:
                    System.out.print("altiyuz\t");
                    break;
                case 7:
                    System.out.print("yediyuz\t");
                    break;
                case 8:
                    System.out.print("sekizyuz\t");
                    break;
                case 9:
                    System.out.print("dokuzyuz\t");
                    break;

            }
            switch (onlarBas) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("on\t");
                    break;
                case 2:
                    System.out.print("yirmi\t");
                    break;
                case 3:
                    System.out.print("otuz\t");
                    break;
                case 4:
                    System.out.print("kirk\t");
                    break;
                case 5:
                    System.out.print("elli\t");
                    break;
                case 6:
                    System.out.print("altmis\t");
                    break;
                case 7:
                    System.out.print("yetmis\t");
                    break;
                case 8:
                    System.out.print("seksen\t");
                    break;
                case 9:
                    System.out.print("doksan\t");
                    break;

            }
            switch (birlerBas) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("bir\t");
                    break;
                case 2:
                    System.out.print("iki\t");
                    break;
                case 3:
                    System.out.print("uc\t");
                    break;
                case 4:
                    System.out.print("dort\t");
                    break;
                case 5:
                    System.out.print("bes\t");
                    break;
                case 6:
                    System.out.print("alti\t");
                    break;
                case 7:
                    System.out.print("yedi\t");
                    break;
                case 8:
                    System.out.print("sekiz\t");
                    break;
                case 9:
                    System.out.print("dokuz\t");
                    break;

            }
        }


    }
}
