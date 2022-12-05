package day09_nestedforloop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {

        /*

        kullanıcıdan toplanmak uzere sayılar isteyin sayı adedi 10 u veya toplamı 500 u geçerse
        bu kadar sayı yeter ... adet sayı girdiniz toplamı .... yazdırın
         */

        Scanner input = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        int counter = 0;


        while (counter < 10 && toplam < 500) {

            System.out.println("lutfen toplamak istediğiniz sayıyı giriniz");
            sayi = input.nextInt();
            toplam += sayi;
            counter++;

        }
        if (toplam > 500 && counter < 10) {
            System.out.println(counter + " adet sayı girdiniz toplam 500 sınırını geçtiniz: Toplam " + toplam);
        } else if (toplam < 500 && counter > 10) {
            System.out.println(counter + " adet sayı girdiniz 10 adet sayı sınırını geçtiniz. Tolam: " + toplam);

        } else if (toplam > 500 && counter > 10) {
            System.out.println(counter + " adet sayı girdiniz hem sayı hem de toplam sınırını geçtiniz: Toplam" + toplam);

        }
    }
}
