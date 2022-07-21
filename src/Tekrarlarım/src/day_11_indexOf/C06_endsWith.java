package day_11_indexOf;

public class C06_endsWith {
    public static void main(String[] args) {
        //   Soru 1) Kullanicidan email adresini girmesini isteyin,
        //   mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
        //   @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
        //   @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

        String email="esulukan@gmail.com";

        if(!email.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");
        } else if (email.endsWith("@gmail.com")) {
            System.out.println("mail adresiniz kaydedildi");

        }else{
            System.out.println("lutfen yazimi kontol edin");
        }


    }
}
