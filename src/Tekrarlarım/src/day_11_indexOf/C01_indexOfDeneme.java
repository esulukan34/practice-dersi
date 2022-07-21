package day_11_indexOf;

public class C01_indexOfDeneme {
    public static void main(String[] args) {

        String str= "Ah yalan dunya";
        System.out.println(str.indexOf("a"));
        //yukaridaki str'da 2.ve 3. a nin indekslerini bulun
        //2.a'yi bulabilmek icin 1.a'nin indeksine ihtiyacım var
        //yukaridaki str'da 2.ve 3. a nin indekslerini bulun
        //2.a'yi bulabilmek icin 1.a'nin indeksine ihtiyacım var

        int ilka = str.indexOf("a");
        int ikincia= str.indexOf("a",ilka+1);
        System.out.println(str.indexOf("a",ilka+1));

        if(ikincia == -1){
            System.out.println("Verilen cumlede ikincia yoktur");
        }else{
            int ucuncua= str.indexOf("a", ikincia+1);
            if(ucuncua== -1){
                System.out.println("Verilen cumlede ucuncua yoktur");
            }else{
                System.out.println("Verilen cumlede 3.a'nın index'i:" +ucuncua);
            }
        }

    }
}
