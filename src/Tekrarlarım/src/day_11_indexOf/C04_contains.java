package day_11_indexOf;

public class C04_contains {
    public static void main(String[] args) {

        //Soru 2) Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa
        // tum cumleyi buyuk harf olarak, “kucuk” kelimesi iceriyorsa tum cumleyi
        // kucuk harf olarak yazdirin, iki kelimeyi de icermiyorsa “Cumle kucuk yada
        // buyuk kelimesi icermiyor” yazdirin.

        String cumle= "Java boyuk,dunya kuccuk";
        cumle=cumle.toLowerCase();
        // requirements'te kucuk veya buyuk harf hassasiyeti hakkında bişey soylenmemiş
        // ikinci olarakta her iki kelimeyi içerme durumu acıklanmamış
        // bu durumda görevi bize kim verdiyse ona sormak lazım

        // ek requirements : ikisini de iceriyorsa "Karar ver buyuk mu yazdırayım, kucuk mu?
        // case sensitive olmasın

        if(cumle.contains("buyuk") && cumle.contains("kucuk")){
            System.out.println("Karar ver buyuk mu yazdırayım, kucuk mu?");
        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        }else if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        }else{
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
        }

    }
}
