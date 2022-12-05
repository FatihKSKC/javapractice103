package day08_forloop;

import java.util.Scanner;

public class C01_ForLoop {

    public static void main(String[] args) {

        // kullanıcıdan başlangıç bitiş ve artış miktarını alarak sayı alıp aradaki sayıları virgül koyarak yzdırıınız

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen başlangıç degerini giriniz");
        int firs = input.nextInt();

        System.out.println("lutfen bitiş degerini giriniz");
        int last = input.nextInt();

        System.out.println("lutfen artış miktarını giriniz");
        int artis = input.nextInt();



        for (int i = firs; i <last+1 ; i=i+artis) {
            if (i<last){
                System.out.print(i+",");
            }else System.out.println(i);

        }











    }
}
