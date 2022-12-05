package practiceadvance;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        /*
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplayan bir kod yazınız.
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)

         */


        Scanner input = new Scanner(System.in);

        System.out.println("lutfen birinci kenarı giriniz");
        int sayi1 = input.nextInt();

        System.out.println("lutfen ikinci kenarı giriniz");
        int sayi2 = input.nextInt();

        System.out.println("lutfen ucuncu kenarı girniz");
        int sayi3 = input.nextInt();


        if (sayi1 > 0 && sayi2 > 0 && sayi3 > 0) {
            if (sayi1 * sayi1 == sayi2 * sayi2 + sayi3 * sayi3 ||
                    sayi2 * sayi2 == sayi1 * sayi1 + sayi3 * sayi3 ||
                    sayi3 * sayi3 == sayi1 * sayi1 + sayi2 * sayi2) {
                System.out.println("dik uçgendir");
            } else {
                System.out.println("dik ucgen degildir.");
            }


        } else {
            System.out.println("kenar uzunlugu negatif olamaz lutfen pozitif sayı giriniz");
        }











    }


}
