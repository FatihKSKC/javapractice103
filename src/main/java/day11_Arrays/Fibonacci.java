package day11_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        // kullanıcıdan alınan bir tamsayıya kadar fibonacci dizisi olusturun. 0-1-1-2-3-5-8-13-21-34

        List<Integer>fibonacc = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("lutfen istediginiz bir fibonacci sayısı giriniz");
        int istenen = input.nextInt();



        fibonacc.add(0);
        fibonacc.add(1);
        int i=1;

        if (istenen<=1){

            System.out.println("lutfen 1 den buyuk bir sayı giriniz");

        }else {

            while (fibonacc.get(i)<istenen){
                fibonacc.add(fibonacc.get(i)+fibonacc.get(i-1)); // bir onceki eleman ile topladı
                i++; // bir basamak ilerlersin

            }

            if (fibonacc.get(fibonacc.size()-1)>istenen){ // fibonacci de yer almıyorsa
                fibonacc.remove(fibonacc.size()-1); // son elemanı sil.

                System.out.println("girdiginiz sayı yok. girilen sayıya kdarki fibonacci "+ fibonacc);
            }else {
                System.out.println("girdiginiz sayı fibonaccci sayısıdır "+fibonacc);
            }

        }



    }
}
