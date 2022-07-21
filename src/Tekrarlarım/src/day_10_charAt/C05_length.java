package day_10_charAt;

public class C05_length {
    public static void main(String[] args) {
        String str= "Asel inci çok güzel";

        System.out.println(str.length());
        System.out.println(str.toUpperCase().charAt(7));// baştan 7.karakteri büyük yazdırır
        System.out.println(str.charAt(str.length()-1));// son karakterini yazdırır
        System.out.println(str.charAt(str.length()-3));// sondan 3. karakterini yazdırır
        System.out.println(str.toUpperCase().charAt(str.length()-3));// sondan 3. karakterini büyük yazdırır

    }
}
