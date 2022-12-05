package day10_arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayCharacterSay {
    public static void main(String[] args) {

        /*
        kullanıcıdan bir string alın stringde var olan her karakterin saysını ekrana yazdırn





         */


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir string giriniz");
        String str = input.nextLine();

        String arr[] = str.split(""); // split methodu ile parçaladık ve arraya verir.

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
int counter =0;

        for (int i = 1; i < arr.length ; i++) {

            if (arr[i - 1].equals(arr[i])) {
                counter++;
            } else {
                System.out.println(arr[i - 1] + " karakter sayisi " + (counter + 1));

                counter = 0;
            }

            if (i == arr.length - 1) {


                System.out.println(arr[i] + " karakterinin sayisi " + (counter + 1));

            }


        }
    }
}
