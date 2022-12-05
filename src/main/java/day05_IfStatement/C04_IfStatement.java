package day05_IfStatement;

import java.util.Scanner;

public class C04_IfStatement {

    public static void main(String[] args) {

        //Kullanici 0'dan kucuk 120'den buyuk deger giremiyecek sekilde degerleri aldiktan sonra ;
// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
// calisan erkekse 65 yasindan buyukse emekli olabilir seklinde yazdiran bir kod yaziniz.

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen cinsiyeti yazınız" + "?\nkadın icin K  \n erkek icin E giriniz");
        char cinsiyet = input.next().toUpperCase().charAt(0);

        System.out.println(" lutfen yaşınızı giriniz ");
        byte yas = input.nextByte();

        if (cinsiyet=='K'){
            if (yas<0 && yas>120){
                System.out.println("lutfen geçerli bir yas giriniz");
            }else if (yas>=60){
                System.out.println(" emekli olabilir ");
            }else {
                System.out.println("emekli olamazsın  " + (60-yas) + " sene daha çalışmalısın");
            }




        } else if (cinsiyet== 'E'){
            if (yas<0 && yas>120){
                System.out.println("lutfen gecerli bir yas giriniz");
            }if (yas>=65){
                System.out.println("emekli olabilirsin");
            }else {
                System.out.println("emekli olamazsın " + (65-yas )+ " sene daha çalışmalısıın");
            }



        }else {
            System.out.println("lutfen E yada K harflerinden birini giriniz");
        }




    }








}
