package day_11_indexOf;

public class C03_contains {
    public static void main(String[] args) {
        //   Soru 1) Kullanicidan email adresini girmesini isteyin,
        //   mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
        //   @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
        //   @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

        String input= "esulukan@gmmail.com";

        if(!input.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");
        }else if(input.lastIndexOf("@gmail.com")==input.length()-10){
            System.out.println("Email adresiniz kaydedildi");
        }else{
            System.out.println("lutfen yazimi kontol edin");
        }
    }
}
