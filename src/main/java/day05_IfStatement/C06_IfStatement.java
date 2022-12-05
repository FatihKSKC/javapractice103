package day05_IfStatement;

import java.util.Scanner;

public class C06_IfStatement {


    public static void main(String[] args) {

        //Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
// Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin.
// Son rakamı 0 ise ekrana "5’e bölünen çift sayı" yazdırın.
// Son rakamı 0 değil ise "5’e bölünen tek sayı" yazdırın.
// Girdiği password 5’e bölünmüyorsa ekrana "Tekrar deneyin" yazdırın.

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen dort basamaklı bir sayı giriniz");
        int sayı = input.nextInt();

        if (sayı<999 || sayı>9999){
            System.out.println("lutfen 4 basamaklı bir sayı giriniz");

        } else if (sayı%5==0) {
            if (sayı%10==0){
                System.out.println("5 e bolunen çift sayı");
            }else {
                System.out.println("5 e bolunen tek sayı ");
            }


        }else {
            System.out.println("tekrar deneyin");
        }


    }



}
