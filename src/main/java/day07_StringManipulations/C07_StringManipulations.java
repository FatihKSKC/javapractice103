package day07_StringManipulations;

public class C07_StringManipulations {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan email adresini girmesini isteyin,
// mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
// @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
// @gmail.com ile bitmiyorsa "lutfen yazimı kontrol edin" yazdırın


        String mail = "fatihgmail.com";

        boolean bir = mail.contains("@gmail.com");
        boolean iki = mail.endsWith("@gmail.com");
        if (false==bir){
            System.out.println("lutfen gmail adresigirin");
        } else if (true==iki) {
            System.out.println("email kaydedildi");
        } else if (false==iki) {
            System.out.println("lutfen yazımıkonrol et");
        }

   // 2. yol
        String email = "abc@gmail.com";
        String arananMetin = "@gmail.com";

        if (!email.contains(arananMetin)){
            System.out.println("lutfen adres gir");
        }else if (email.endsWith(arananMetin)){
            System.out.println("email ok ");
        }else System.out.println("lutfen yazımı kontrol edin");



    }




}
