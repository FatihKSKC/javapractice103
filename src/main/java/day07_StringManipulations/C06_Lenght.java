package day07_StringManipulations;

import java.util.Scanner;

public class C06_Lenght {
    public static void main(String[] args) {

        String cumle = "bugun hava yagmurlu";
        int sayi = cumle.length();
        System.out.println(sayi);

// kullanıcıdan isim ve soyisim girmesini isteyin hangisinin uzun oldugunu yazdırın

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen isminizi ve soyisminizi giriniz \n isim");
String isim = input.nextLine();
String soyIsim = input.nextLine();

if (isim.length()>soyIsim.length()){
    System.out.println("isminiz uzundur");
} else if (soyIsim.length()>isim.length()) {
    System.out.println("soyisminiz uzundur");
}else System.out.println("eşittir");


//kullanıcıdan 4 harfli bir kelima isteyi
        // girilenkelimeyi tersten yazdır

        String s = "banu";
        char ch = s.charAt(0);
        char ch1 = s.charAt(1);
        char ch2= s.charAt(2);
        char ch3=s.charAt(3);

        System.out.println(""+ch3+ch2+ch1+ch);

    }

}
