package day09_nestedforloop;

import java.util.Scanner;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        /*

        ^
        ^ ^
        ^ ^ ^
        ^ ^ ^ ^
        ^ ^ ^ ^ ^
        ^ ^ ^ ^ ^ ^









         */

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen agacın taç uzunlugunu giriniz");

        int tacUzunluk = input.nextInt();


        String yaprak = "";

        for (int i = 0; i <tacUzunluk ; i++) {


            yaprak+= "^";
            System.out.println(yaprak);
        }

        for (int i = 0; i <6 ; i++) {

            System.out.println("||");
        }




    }
}
