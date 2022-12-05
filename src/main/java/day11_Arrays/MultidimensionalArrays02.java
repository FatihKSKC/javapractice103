package day11_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArrays02 {

    public static void main(String[] args) {

        // kullanıcıdan alınan arrayin en buyuk ve en kucuk elemanının farkını bulun


        Scanner input = new Scanner(System.in);
        System.out.println("lufren arraın uzunlugunun yaınızı");
        int uzunluk = input.nextInt();


        int arr[]= new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {

            System.out.println("arrayın " +(i+1)+". elemanını giriniz");
            arr[i]= input.nextInt();


        }
        Arrays.sort(arr);

        System.out.println("arrayın en buyuk elemanı : " +arr[uzunluk-1]);
        System.out.println("arrayın en kucuk elemanı : "+arr[0]);

        System.out.println("en buyuk en kucuk farkı: "+ (arr[uzunluk-1]-arr[0]));






    }
}
