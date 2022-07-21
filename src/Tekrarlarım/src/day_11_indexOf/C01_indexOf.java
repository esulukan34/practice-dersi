package day_11_indexOf;

public class C01_indexOf {
    public static void main(String[] args) {
        String str = "Java ogrenmek cok guzel";

        System.out.println(str.indexOf("g"));
        System.out.println(str.indexOf("j"));
        System.out.println(str.indexOf("n"));
        System.out.println(str.indexOf("zel"));
        System.out.println(str.indexOf("e", 8));
        System.out.println(str.indexOf("e", (8 + 1)));

        //yukaridaki str'da 2.ve 3. e nin indekslerini bulun
        //2.e'yi bulabilmek icin 1.e'nin indeksine ihtiyacım var

        int ilke = str.indexOf("e");
        int ikincie = str.indexOf("e", ilke + 1);

        //yukaridaki str'da 2.ve 3. e nin indekslerini bulun
        //2.e'yi bulabilmek icin 1.e'nin indeksine ihtiyacım var

        if (ikincie == -1) {
            System.out.println("Verilen cumlede ikincie yoktur");
        } else {
            int ucuncue = str.indexOf("e", ikincie + 1);
            if (ucuncue == -1) {
                System.out.println("Verilen cumlede ucuncue yoktur");
            } else {
                System.out.println("Verilen cumlede 3.e'nin index'i:" + ucuncue);
            }


        }
    }
}

