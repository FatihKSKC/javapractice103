package day03_ifstatement;

public class C02_AsciiDegerleri {
    public static void main(String[] args) {

        char harf1 = 'a';
        char harf2 = 'A';
        System.out.println("harf1>harf2  "  + (harf1>harf1));

        // buyuk harflerin ascii degerleri kucuk harflerin ascii degerlerinden daha kucuktur.

// herhenagi bir char variablenin ascii degerini bulunuz.
// 1. yol: toplamadaki etkisiz eleman 0 ile toplarsak ascii degerini bulunuz
        char space = ' ';
        System.out.println(" sapce in ascii degeri : "+ (space+0)); // 32

        char harf3 = 'm';
        System.out.println("m harficinin asci degeri : "+ (harf3+0)); // 109

// 2. yol:
        // eger int kullanırsak charların ascii degerini yazıdırır
        int harf4 = 'm';
        System.out.println("m nin ascii deger i : " + harf4 );


        int harf5 = 'z';
        System.out.println(" z nin ascii degeri : " + harf5);

        int sembol = '=';
        System.out.println(" = sembolunun ascii degeri : " + sembol);

         byte b1 = 12;
         byte b2 = -125;

        System.out.println("b1>b2 ise " + (b1>b2));

        float f1 = 2.45f;
        float f2 = 5.45f;
        System.out.println("f1>f2 ise " + (f1>f2)); //false
        System.out.println("b1>f2 ise " + (b1>f2)); // ture

        long l1 = 45522258455L;
        System.out.println("b1<l1 ise "  + (b1<l1));

        char ch = 'h';
        System.out.println("b1>ch ise "+ (b1>ch));

        int soru = '?';
        System.out.println("? isaretinin  ascii degeri : " + soru);


    }

}
