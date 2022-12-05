package day02_variables;

import java.util.Scanner;

public class C04_Scanner {


    public static void main(String[] args) {

// kullanıcının girdigi 4 basamaklı sayıdan ilk ve son rakamanın toplamını ekrana yazdırın
// bir sayının birler basamagındaki rakamı %10 ile alabiliriz
        Scanner
                toplam = new Scanner(System.in);
        System.out.println("lutfen dort basamaklı bir sayı girini");
        int a= toplam.nextInt();

        int sonRakam = a%10;
        int ilkRakam = a/1000;
        System.out.println(" " + (ilkRakam+sonRakam));
// kullanıcıdan uc basamakı-lı bir sayı alın ve rakamları toplamını yazdırırın

        Scanner toplam1 = new Scanner(System.in);
        System.out.println("lutfen uc basamaklı bir sayı giriniz");

        int b = toplam1.nextInt();


        System.out.println(" " + ((b/100)%10) + ((b/10)%10) + (b%10));


// kullcıcıdan 5 bsamaklı bir sayı girininz

        Scanner besBasamakli =new Scanner(System.in);

        System.out.println("lufen bes basamaklibir sayi giriniz");
        int abcde = besBasamakli.nextInt();

        int onbinler = (abcde/10000)%10;
        int binler = (abcde/1000)%10;
        int onler = (abcde/10)%10;
        int birler = abcde%10;

        int rakamlarToplami = (onbinler+binler+onler+binler);
        System.out.println(" " + rakamlarToplami);




    }

}
