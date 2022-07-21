package day_11_indexOf;

public class C02_lastIndexOf {
    public static void main(String[] args) {
        /*
        verilen kelimenin asagıdaki sartlardan uygun olanı yazan bir program yazınız
            -verilen kelime cumlede birden fazla kullanilmis
            -verilen kelime cumlede sadece 1 kere kullanilmis
            -verilen kelime cumlede birden fazla kullanilmis
         */

        String cumle= "Asel cok akilli, Asel cok tatli";
        String kelime= "tatli";

        int kelimeIlkIndex = cumle.indexOf(kelime);
        int kelimeSonIndex = cumle.lastIndexOf(kelime);

        if(kelimeIlkIndex == -1){
            System.out.println("Verilen cumlede arana kelime kullanilmamistir");
        } else if (kelimeIlkIndex==kelimeSonIndex) {
            System.out.println("Verilen cumlede aranan kelime 1 defa kullanilmistir");

        }else{
            System.out.println("Verilen cumlede aranan kelime birden fazla kullanilmistir");
        }


    }
}
