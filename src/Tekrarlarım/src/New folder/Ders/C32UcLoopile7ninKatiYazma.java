package Ders;

public class C32UcLoopile7ninKatiYazma {
    public static void main(String[] args) {

            /*
            9'dan 190'a kadar 7^nin kati olan tum tam sayilari ekrana yazdiriniz
            */

        int bas=9;;
        int bitis=190;

        int temp=bas;

        // while loop ile*****
        while(temp<bitis){
            if(temp%7==0){
                System.out.print(temp+" ");
            }

            temp++;

        }

        // do while ile ********
        System.out.println("");
        temp=bas;
        do{
            if(temp%7==0){
                System.out.print(temp+" ");
            }

            temp++;


        }while(temp<bitis);

        System.out.println("");
        // for ile ************

        for(int i=9;i<=190;i++){
            if(i%7==0){
                System.out.print(i+" ");
            }
        }



    }
}
