package day3_practice;

import java.util.Scanner;

public class Q07_StringManipulation {

    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("4 harfli bir kelime giriniz : ");
        String kelime=scan.next().toUpperCase();

        System.out.print(kelime.substring(4)
                        +kelime.substring(3,4)
                        +kelime.substring(2,3)
                        +kelime.substring(1,2)
                        +kelime.substring(0,1));



    }

}
