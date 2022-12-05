package day04_ifstatement;

import java.util.Scanner;

public class C03_If {

    //Kullanicidan bir gun alin
    // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
    // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
    // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

    public static void main(String[] args) {

        Scanner gunler = new Scanner(System.in);
        System.out.println("lutfen bir gun giirniz");
        String gun = gunler.nextLine().toLowerCase();
/*
        if (gun.equalsIgnoreCase("cuma")){
            System.out.println("muslumanlar icin kutsal gun");
        } else if (gun.equalsIgnoreCase("cumartesi")) {
            System.out.println("yahudiler için kutsal gun");

        } else if (gun.equalsIgnoreCase("pazar")) {
            System.out.println("hristiyanalr için kutsal gun ");

        }else {
            System.out.println("lutfen tekrar deneyiniz");
        }

*/
        switch (gun){

            case "cuma":
                System.out.println("musluman");
                break;
            case "cumartesi":
                System.out.println("yahudi");
                break;
            case "pazar":
                System.out.println("hristiyan");
                break;
            default:
                System.out.println("kutsal gun degildir");


        }






    }



}
