package day10_arrays;

import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {

        /*
        kullanıcı yazdıgı metni hackerlerin konuşma dilini çeviren kodu yazınız
        s<<<<5
        a<<<<4
        e<<<<3
        i<<<<1
        o<<<<0

        test data
        hackerdili "java ile hersey guzel"
        ipucu harfleri degistirin ve ekrana yazdırın



         */

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen bir cumle giriniz");
        String cumle = input.nextLine().toLowerCase();


        String arr[] = new String[cumle.length()];

        for (int i = 0; i < cumle.length(); i++) {

            arr[i] = cumle.substring(i, i + 1);
            System.out.print(arr[i]);


        }
        System.out.println();
        for (int i = 0; i < cumle.length(); i++) {
            if (arr[i].contains("s")) {
                arr[i] = "5";
            }if (arr[i].contains("a")) {
                arr[i] = "4";
            } if (arr[i].contains("e")) {
                arr[i] = "3";
            } if (arr[i].contains("i")) {
                arr[i] = "1";
            }if (arr[i].contains("o")) {
                                arr[i] = "0";


                            }
            System.out.print(arr[i]);
                        }



    }
}