package day_11_indexOf;

public class C07_starsWith {
    public static void main(String[] args) {
        String cumle= "Java benim yeni yol arkadasim";

        System.out.println(cumle.startsWith("J"));//true
        System.out.println(cumle.startsWith("Java"));//true
        System.out.println(cumle.startsWith("java"));// false
        System.out.println(cumle.startsWith(""));// true
    }
}
