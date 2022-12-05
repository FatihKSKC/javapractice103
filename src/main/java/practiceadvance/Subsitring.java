package practiceadvance;

import java.util.Scanner;

public class Subsitring {
    public static void main(String[] args) {


/*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
       */


        Scanner input = new Scanner(System.in);

        System.out.println("lutfen ad ve soyadınızı aralarında bir boşluk olacak şekilde giriniz.");
String tamIsim= input.nextLine();
String ilkAd= tamIsim.substring(0,tamIsim.indexOf(" "));
String soyAd= tamIsim.substring(tamIsim.indexOf(" ")+1);

        System.out.println(ilkAd);
        System.out.println(soyAd);


    }


}
