package study;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Study03 {
    public static void main(String[] args) {

        //  /*
        //
        //     Elementlerini kullanıcıdan alarak bir integer Array oluşturunuz.
        //     Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
        //
        //     */


        Scanner input = new Scanner(System.in);

        System.out.println("lutfen arrayin sayısının giriniz");
        int sayi = input.nextInt();

        int arr[] = new int[sayi];

        int index = 0;

        for (int i = 0; i < sayi; i++) {
            System.out.println("lutfen " + i + ". indeksi giriniz");
            int indeksSayisi = input.nextInt();
            arr[index] = indeksSayisi;
            index++;
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("lutfen silmek istediğiniz indeksi yazınız");
        int silinecekIndex = input.nextInt();

        int yeni[] = new int[sayi - 1];
        int yeniindex = 0;

        for (int w : arr) {


            if (w != silinecekIndex) {

                yeni[yeniindex] = w;
                yeniindex++;
            }
        }

        System.out.println(Arrays.toString(yeni));

    }
}
