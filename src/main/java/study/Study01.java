package study;

import java.util.Arrays;
import java.util.Scanner;

public class Study01 {

    public static void main(String[] args) {

    /*

     Elementlerini kullanıcıdan alarak bir integer Array oluşturunuz.
     Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.

     */

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen arrayin elemena sayısını giriniz");
        int sayı = input.nextInt();

        int arr[] = new int[sayı];

        for (int i = 0; i < arr.length; i++) {

            System.out.println("lutfen arrayin " + i + ". indeksini girini ");
            arr[i] = input.nextInt();// array olusturuldu.


        }

        System.out.println(Arrays.toString(arr)); //


        System.out.println("lutfen silmek istediğiniz indeksi giriniz");
        int indexSayisi = input.nextInt();



        int yeni[] = new int[sayı - 1];

        int index=0;

        for (int i = 0; i < arr.length ; i++) {

            if (i!=indexSayisi){


               yeni[index]= arr[i];
               index++;

            }


        }

        System.out.println(Arrays.toString(yeni));



    }
}
