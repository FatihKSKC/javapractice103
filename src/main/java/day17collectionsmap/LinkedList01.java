package day17collectionsmap;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList01 {
    public static void main(String[] args) {


        LinkedList<String> isimlar = new LinkedList<>((Arrays.asList("AYSE","EMEL","HARUN","IREM")));

        System.out.println(isimlar);

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen isim giriniz");

        String isim = input.nextLine().toUpperCase();


        if (isimlar.remove(isim)){

            System.out.println("bu isim vardi ve silindi");
            System.out.println("listenin silinmis hali "+ isimlar);
        }else {
            System.out.println("bu isim linkedlist te yok o yuzden silinemedi");
        }


    }
}
