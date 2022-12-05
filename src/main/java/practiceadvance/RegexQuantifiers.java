package practiceadvance;

public class RegexQuantifiers {
    public static void main(String[] args) {

        // bir string degerin belirli bir sayıda karakter içerip belirli bir karakter ile bitip bitmediğini kontrol
        // edden bir kod yazınız

        String str = "aslanlar";

        boolean result = str.matches(".....lar"); // .. işareti iki karakter olup olmadığınıgı kontrol eder.

        System.out.println(result); // true verdi çunku iki karakterli bir string kontrol ettik.
// matches() methodu regex ile çalışıp string degerin regex ile karşılaştırmasını yapar.
        // bir string degerin ikinci karakterinin belirli bir karakter olup oolamdığını kontrol eden bir kod yazınız

        String str1 = "fatih";

        boolean result1 = str1.matches(".a.*"); // . dan sonra * işareti koyarsak sonrakileri dikkate almak oncekler var mı yokmu onu kontrol eder.
        System.out.println(result1); // 2. karakter a mı diye kontrol ettik.


        //  bir strin degerin sadece harf içerip içermediğini kontrol eden bir kod yazınız.

        String str2 = "ab";

        boolean result2 = str2.matches("\\w{2}");
        System.out.println(result2);

        String str3 = "abcde";
        boolean result3 = str3.matches("[a-zA-Z]{5}");

        System.out.println(result3); // sedece harfler ve 5 karakterli oldugu için true verecektir.

        //Bir String değerin belirli karakterleri en az belirli sayıda içerip içermediğini kontrol eden bir kod yazınız.

        String str4 = "123456";

        boolean result4= str4.matches("[0-9]{6,}"); // en az 6 rakam vardır.
        boolean result5 = str4.matches("[0-9]{3,6}"); // en az 3 en fazla 6 rakam içeriyor. \\w harf ve sayılar içindir

// ilk karakter 1, ikinci karekter noktalama işareti ve kalan 8 karakter rakam toplam 10 karakter olmali,

        String str5= "1?2345678";

        boolean result6 = str5.matches("[1][\\p{Punct}]{[0-9]{8}");
        System.out.println(result6);









    }
}
