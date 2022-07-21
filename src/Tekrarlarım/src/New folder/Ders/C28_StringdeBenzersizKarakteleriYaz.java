package Ders;

public class C28_StringdeBenzersizKarakteleriYaz {
    public static void main(String[] args) {

        // verilen String'deki kullanilan harfleri
        // tekrarsiz olarak yazdirip
        // kelimede kullanilan farkli harf sayisini veren bir method yaziniz
        String input = "taka tuka";
        tekrarsizYap(input);
    }
    public static void tekrarsizYap(String input) {
        String benzersizInput="";
        String islenecekKelime=input.replaceAll("\\W",""); // takatuka
        System.out.print(islenecekKelime.substring(0,1)); // t
        benzersizInput+=islenecekKelime.substring(0,1);  // t

        for (int i = 1; i <islenecekKelime.length() ; i++) {

            if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
                System.out.print(", "+ islenecekKelime.substring(i,i+1));
                benzersizInput+=islenecekKelime.substring(i,i+1);
            }
        }
        System.out.println("");
        System.out.println("inpt: " + input);
        System.out.println("benzersiz input : " + benzersizInput);
        System.out.println("Kelimede verilen farkli harf sayisi: "+benzersizInput.length());

    }
}
