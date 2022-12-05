package day07_StringManipulations;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class C01_StringManipulationsConcat {

    public static void main(String[] args) {




   // ONEMLI NOT=JAVA YUKARIDAN ASAGI ; SOLDAN SAGA CALISIR.






            System.out.println(15 + 20 + "Merhaba");
            System.out.println("Merhaba" + 15 + 20);
            System.out.println("Merhaba" + (15 + 20));
            System.out.println("Merhaba" + 15 * 20);

            //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola kullanici nasil girerse girsin
            //tam isminin buyuk harfle yazilmasini saglayin.

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen isminizi giirnz");
        String isim= input.nextLine();
        System.out.println("lutfen soyisminizi giriniz" );
        String soyIsim = input.next();
        String isimSoyisim = isim.concat(" "+soyIsim).toUpperCase();

        System.out.println(isimSoyisim);





    }




}
