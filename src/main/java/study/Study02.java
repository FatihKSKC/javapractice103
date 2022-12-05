package study;

import java.util.Arrays;
import java.util.Scanner;

public class Study02 {
    public static void main(String[] args) {
 /*

 Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

    Input :

    John White

    1234234534561478

    Output : Name :

    J*** W****

    CCN  : **** **** **** 1478

            * Ilk Harfler Buyuk harf ile baslamalidir.

   */


        Scanner input = new Scanner(System.in);

        System.out.println("lutfen adınızı soyadınız ve kredi kartı numaranızı giriniz");
        String isim = input.next();
        String soyIsim = input.next();
        String kartNo = input.next();

        System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1,isim.length()).replaceAll("[a-zA-Z]","*"));

        System.out.println(soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("[a-zA-Z]","*"));
        System.out.println(kartNo.substring(0,4).replaceAll("[0-9]","*")+" "+
                kartNo.substring(4,8).replaceAll("[0-9]","*")+" "+
                kartNo.substring(8,12).replaceAll("[0-9]","*")+" "+
                kartNo.substring(12));



    }
}
