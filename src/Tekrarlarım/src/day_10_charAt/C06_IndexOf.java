package day_10_charAt;

public class C06_IndexOf {
    public static void main(String[] args) {

        String str1 = "Reyyan Hafsa çok güzel ve akıllı";
        String str2 = "Asel İnci de çok güzel ve akıllı";

        System.out.println(str1.indexOf("H"));//7
        System.out.println(str2.indexOf("i"));//8
        System.out.println(str2.indexOf("ı"));//28
        System.out.println(str2.indexOf("t"));//-1

        if(str2.indexOf("t") == -1){
            System.out.println("İstenen karakter bulunmamaktadır");
        }else{
            System.out.println("İstenen karakter bulunmuştur");
        }



    }
}
