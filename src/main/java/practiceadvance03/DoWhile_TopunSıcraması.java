package practiceadvance03;

import java.util.Scanner;

public class DoWhile_TopunSıcraması {

/*
 Bir top belirli yükseklikten atılmaktadır.(scanner ile yuksekligi al)
 Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
 Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
 Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
 */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("bırakılan yuksekligi giriniz");

        double yukseklik = input.nextDouble();


        double toplamYol = 0;

        int counter = 0;


        do {

            counter++;
            toplamYol += yukseklik;
            yukseklik = yukseklik * 0.75;
            toplamYol = yukseklik;


        } while (yukseklik > 1);

        System.out.println(toplamYol);
        System.out.println(counter);

    }
}
