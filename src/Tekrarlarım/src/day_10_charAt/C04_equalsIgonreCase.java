package day_10_charAt;

public class C04_equalsIgonreCase {
    public static void main(String[] args) {

        String str1= "Reyyan Hafsa";
        String str2= "Reyyan HAFSA";
        String str3= "reyyan hafsa";
        String str4= "REYYAN Hafsa";
        String str5= "Reyyan Hafsa";

        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str1.equalsIgnoreCase(str3)); // true
        System.out.println(str1.equalsIgnoreCase(str4)); // true
        System.out.println(str1.equalsIgnoreCase(str5)); // true

    }
}


