package day02_variables;

import java.util.Scanner;

public class Study01 {


    public static void main(String[] args) {

        // adını soyadnı ve tc giriiz ad soyad yan yana tc alt satırda olacak sekilde yazdırıız

        Scanner bilgiler = new Scanner(System.in);

        System.out.println("lutfen ad soyad ve tc giriniz");

        String adSotadTc = bilgiler.nextLine();
        System.out.println(adSotadTc);


    }
}