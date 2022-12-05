package day05_IfStatement;

import java.util.Scanner;

public class C01_IfStatement {

/*Soru 6) Kullanicidan iki sayi isteyin,
 sayilarin ikisi de pozitif ise "sayilarin toplamini "yazdirin,
 sayilarin ikisi de negative ise "sayilarin carpimini" yazdirin,
 sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
 sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.*/


    public static void main(String[] args) {

        Scanner sayilar = new Scanner(System.in);
        System.out.println("lutfen birinci sayiyi giriniz");
        double sayi1 = sayilar.nextDouble();

        System.out.println("lutfen ikinci sayıyı giirniz");
        double sayi2 = sayilar.nextDouble();

        if (sayi1>0 && sayi2>0){
            System.out.println(sayi1+sayi2);
        } else if (sayi1<0 &&sayi2<0) {
            System.out.println(sayi1*sayi2);

        } else if (sayi1*sayi2<0 ) {
            System.out.println("farklı işaretlerde işlem yapamazsın");

        }else
            System.out.println("sıfıra göre yutan elemena");



    }

}
