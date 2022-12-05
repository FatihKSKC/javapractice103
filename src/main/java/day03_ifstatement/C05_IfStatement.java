package day03_ifstatement;

import java.util.Scanner;

public class C05_IfStatement {

    public static void main(String[] args) {

        // kullanıcıdan alacagınız iki sayıyı yine kullanıcıdan sectireceginiz dort islemden biri ile yazdır

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen \n toplama islemi icin 1 \n cıkarma islemi icin 2 \n bolme islemi icn 3 \n carpma islemi icin 4 \n giriniz");
        int islem = input.nextInt(); // variable olusturudkk

        System.out.println("lutfen iki sayı giriniz");
        double num1= input.nextDouble();
        double num2 = input.nextDouble();


        if (islem==1){
            System.out.println(num1+num1);
        } else if (islem==2) {
            System.out.println(num1-num2);

        } else if (islem==3) {
            System.out.println(num1/num2);

        } else if (islem==4) {
            System.out.println(num1*num2);

        }else {
            System.out.println("invalid value please choose one of them : 1,2,3,4");
        }


    }













}
