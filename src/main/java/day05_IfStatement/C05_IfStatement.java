package day05_IfStatement;

import java.util.Scanner;

public class C05_IfStatement {

    //Kullanicidan iki sayi alin buyuk olmayan sayiyi yazdirin.



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen iki sayı giriniz");
        double sayi1 = input.nextDouble();
        double sayi2 = input.nextDouble();



        Object sonuc = sayi1==sayi2 ? ("sayılar esit"):(sayi1<sayi2 ? (sayi1):(sayi2));

        if (sayi1<sayi2){
            System.out.println("kucuk olan say " + sayi1);
        } else if (sayi1>sayi2) {
            System.out.println("buyuk olan sayı  " + sayi2);

        }else {
            System.out.println("sayılar birbirine eşittir");
        }


    }




}
