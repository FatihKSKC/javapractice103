package day04_ifstatement;

import java.util.Scanner;

public class C02_IfStatement {

    public static void main(String[] args) {


         /*
    Ogrenci asagidaki gibi notlar aldiginda karsisindaki degerleri yazdiran bir kod yaziniz
                 not hesaplayici
              90 ~100 => A  Cok Iyi
              80 ~ 89 => B  Iyi
              70 ~ 79 => C  Orta
              60 ~ 69 => D  Gecer
              0 ~ 59  => F  Zayif
   */


        Scanner notlar = new Scanner(System.in);

        System.out.println("lutfen bir not giriniz");
        double not = notlar.nextDouble();

        if (not<0){
            System.out.println("gecersiz not");
        } else if (not<60) {
            System.out.println("zayıf");

        } else if (not<70) {
            System.out.println("gecer");
        } else if (not<80) {
            System.out.println("notunuz gecer ");

        } else if (not<90) {
            System.out.println("notunu iyi");
        } else if (not<100) {
            System.out.println("notunuz çok iyi ");

        }else {
            System.out.println("gecerli bir not giriniz");
        }






    }






}
