package Ders;

public class C02SwapTempKullanarak {
    public static void main(String[] args) {
        /* 1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
            Orn  : sayi1=10 ve sayi2=20;
                    kod calistiktan sonra
                    sayi1=20 ve sayi2=10 */

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;

        System.out.println("swap'tan önce  " + "sayi1: " + sayi1 + "  " + "sayi2: " + sayi2);
        //10 20  0
        sayi3 = sayi2; //10  20  20
        sayi2 = sayi1; //10  10  20
        sayi1 = sayi3; // 20 10 20
        System.out.println("swap'tan sonra  " + "sayi1: " + sayi1 + "  " + "sayi2: " + sayi2);


    }
}
