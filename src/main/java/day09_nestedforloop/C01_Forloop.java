package day09_nestedforloop;

import java.util.Scanner;

public class C01_Forloop {

    public static void main(String[] args) {

        /*

        kullanıcıdan aldıgınız c ve a degeri içeren bir string içindeki c karakterinden onceki a karakterlerinin sayısını
        bulan bir kod


         */

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen bir strin giriniz");
        String str = input.nextLine();

        int counter =0;

        for (int i = 0; i <str.length() ; i++) {

            if (str.charAt(i)=='a'){
                counter++;

            } else if (str.charAt(i)=='c') {
                break;
            }

        }

        System.out.println("counter = " + counter);

    }
}
