package day05_IfStatement;

import java.util.Scanner;

public class C03_IfStatement {

    public static void main(String[] args) {

        //Soru 8) Kullanicidan maas icin bir teklif isteyin ve
        // asagidaki degerlere gore cevap yazdirin.
        //Teklif 20.000’in uzerinde ise "Kabul ediyorum" ,
        //10000 – 20.000 arasinda ise "Konusabiliriz",
        //10.000’nin altinda ise "Maalesef Kabul edemem" yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("maas için teklif isteyiniz");
        double maas = input.nextDouble();

        if (maas>0){
            if (maas>=20000){
                System.out.println("kabul ");
            } else if (maas>=10000 && maas<20000) {
                System.out.println("konusabilirirz");

            }else if (maas<10000){
                System.out.println("reddediyorum");
            }


        }else {
            System.out.println("gecersiz teklif negatif teklif olmaz");
        }









    }






}
