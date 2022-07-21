package TEKRARLAR;

public class C23 {
    /*
        input olarak verilen string'i terse cevirip yazdiran bir method olusturun
         */
    public static void main(String[] args) {

        String input="merhaba";

        terstenYazdir(input);


    }

    public static void terstenYazdir(String input) {

     String output = input.substring(input.length()-1);
        for (int i = input.length()-2; i >= 0; i--) {
            output += input.substring(i,i+1);

        }
        System.out.println("output = " + output);
    }
}
