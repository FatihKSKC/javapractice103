package day08_forloop;

import java.util.Scanner;

public class C02_ForLoop {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("lutfen 0-100 arası bir sayı giriniz");
        int sayi = input.nextInt();

        for (int i = 1; i < sayi+11; i++) {

            if (i > 0 && i < 101) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("java guzeldir" + ",");
                } else if (i % 3 == 0) {
                    System.out.print("java" + ",");
                } else if (i % 5 == 0) {
                    System.out.print("guzeldi" + ",");
                }else System.out.print(i+",");

            } else System.out.print("lutfen 0-100 arasında bir sayı giriniz");
        }


    }
}
