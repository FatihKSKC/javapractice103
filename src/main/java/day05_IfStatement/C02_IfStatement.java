package day05_IfStatement;

import java.util.Scanner;

public class C02_IfStatement {
    //Kullanicidan yasini isteyin
// 65 veya daha buyukse emekli olabilirsin
// 65'den kucukse emekli olamazsin "? sene daha calisman lazim" yazdiri
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen yaşınızı giriniz");
        int yas = input.nextInt();
/*
if (yas>=65){
    System.out.println("emekli olabilirisin");
}else {
    System.out.print("emekli olamazsın  ");
    System.out.println(65-yas + " sene daha çalışmalısın");
}
*/
// nested if else
        /*
        if (yas > 0) {
            if (yas >= 65) {
                System.out.println("emeli olabilirisn");
            } else {
                System.out.println("emekli olamazsın  " + (65 - yas) + "  sene daha çalışmalısın");
            }


        } else {
            System.out.println("lutfen gecersiz yas sıfırdan buyuk bir yaş giriniz");
        }
*/
        String buyukMu = yas>=0 ? (yas>=65 ? ("emekli olabilirsin"):("emekli olamazsın "+(65-yas)+" sene daha çalışmalısıın")):("gecersiz yas lutfen gecerli bir yas giriniz");

        System.out.println(buyukMu);
    }

}
