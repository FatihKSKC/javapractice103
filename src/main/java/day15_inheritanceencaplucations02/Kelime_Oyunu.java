package day15_inheritanceencaplucations02;

import java.util.Scanner;

public class Kelime_Oyunu {

    static int oyuncu = 1;
    static int puan1 = 0;
    static int puan2 = 0;
    static String kelime = "";
    static String ekleme = "";

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println(oyuncu + " . oyuncu bir kelime giriniz" + kelime);
        kelime = input.next(); // oyuncunun verdigi kelimeyi class levelda hiclik olarak atamistik.

        oyuncuDegistir(); // oyuncu degistirme methodu.

        onaySor();


    }

    public static void onaySor() {

        System.out.println("girilen kelime" + kelime);
        System.out.println(oyuncu + " .oyuncu girilen kelimeyi kabul ediyor musunuz: \n 1: Evet \n 0: Hayir");
        int kabul = input.nextInt();
        if (kabul == 1) { // tercihi girilenkelimeyi kabul ettigini gosterir
            if (oyuncu == 1) { // islemi yapan 1. oyuncu ise
                puan2 += kelime.length();

            } else
                puan1 = kelime.length();
            oyunaDevamEdecekMi();


        } else oyuunuBitir(); // girilen kelimeyi kabul etmiyor.

    }

    private static void oyuunuBitir() {
        System.out.println("oyunu " + oyuncu + " kazandi");
    }

    private static void oyunaDevamEdecekMi() {

        System.out.println("oyuna devam etmek istiyor musunuz 1: Evet 0: Hayir");
        int tercih = input.nextInt();
        if (tercih == 1) {
            kelimeEkle();

        } else {
            System.out.println("oyun bitti ");
            System.out.println("havvva hanimin puani " + puan1);
            System.out.println("goksel beyin puani " + puan2);
            if (puan1 > puan2) {
                System.out.println("kazanan havva hanim");
            } else if (puan2 > puan1) {
                System.out.println("kazanan goksel bey");
            } else
                System.out.println("oyun berabere");
        }

    }

    private static void kelimeEkle() {
        System.out.println("eski kelimeye eklenecek str giriniz");
        ekleme = input.next();
        System.out.println("yeni str i basa mi sona ekleyelim \n 1: basa ekle \n 0: sona ekle");

        int tercih = input.nextInt();
        if (tercih == 1) {
            kelime = ekleme + kelime;
        } else kelime = kelime + ekleme;

        oyuncuDegistir();
        onaySor();

    }

    public static void oyuncuDegistir() {


        if (oyuncu == 1) {
            oyuncu = 2;
        } else
            oyuncu = 1;
    }


}
