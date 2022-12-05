package day09_nestedforloop;

import java.util.Scanner;

public class C05_ForLoop {

    public static void main(String[] args) {

        /*
        girilen bir stringin harflerini teker teker ekrana alt alta olacak şekilde yazdırın.
        boşluk veya a harfi varsa atlayarakyazdırın
         */


        Scanner input = new Scanner(System.in);

        System.out.println("lutfen string bir ifade giriniz");
        String str = input.nextLine();


        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' '||str.charAt(i)=='a')
                continue;

            System.out.println(str.charAt(i));


        }

    }
}
