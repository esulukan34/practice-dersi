package day_10_charAt;

public class C03_equals {
    public static void main(String[] args) {

        String str1= "Asel İnci";
        String str2= "Asel İnci";
        String str3= "asel inci";
        String str4= "ASEL İnci";
        String str5= "Asel İNCİ";

        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2));// true
        System.out.println(str1 == str3);//false
        System.out.println(str1.equals(str3));//false
        System.out.println(str2 == str5);//false
        System.out.println(str2.equals(str5));//false

    }
}
