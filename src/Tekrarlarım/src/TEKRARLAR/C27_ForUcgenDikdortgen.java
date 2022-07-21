package TEKRARLAR;

public class C27_ForUcgenDikdortgen {
    public static void main(String[] args) {
        /*

         *
         * *
         * * *
         * * * *
         * * * * *

         */

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("*******************************************************");

        /*
        verilen yukseklik ve boy degerine gore *'lardan olusan bir dikdortgen
        olusturalim
        yukseklik:3 ve boy :4 ise;
        * * * *
        * * * *
        * * * *
         */
        int yukseklik = 3;
        int boy = 4;
        for (int i = 1; i <= yukseklik; i++) {
            for (int j = 1; j <= boy; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("*******************************************************");

        /*
        veril;en inputa gore *'lardan olusan asagidaki sekli olusturun

        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *

         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 4; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("*******************************************************");
        /*
            A
            A N
            A N K
            A N K A
            A N K A R
            A N K A R A

         */
        String input = "ANKARA";
        for (int i = 1; i <= input.length(); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(input.substring(j - 1, j));

            }
            System.out.println("");
        }
        System.out.println("*******************************************************");
/*
              A
              AN
              ANK
              ANKA
              ANKAR
              ANKARA
              ANKAR
              ANKA
              ANK
              AN
              A
             */
       String input2= "ANKARA";
        for (int i = 1; i <= input2.length(); i++) {
            System.out.println(input2.substring(0,i));
        }
        for (int i = 1; i <= input2.length(); i++) {
            System.out.println(input2.substring(0,input2.length()-i));
        }

        }
    }

