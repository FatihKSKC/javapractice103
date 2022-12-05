package day11_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionalArrays01 {
    public static void main(String[] args) {

        // kullanıcıdan alınan bir stringdeki gecen sesli harfleri consola yazıdırın


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir string ifadesi giriniz");
        String str = input.nextLine();

        String arr[]= str.split("");


        for (String w: arr){


            if (w.equals("a")||w.equals("e")||w.equals("i")||w.equals("o")||w.equals("u")){
                System.out.print(w + " ");
            }

        }



    }
}
