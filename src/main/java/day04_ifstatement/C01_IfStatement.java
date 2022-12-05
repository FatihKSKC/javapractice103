package day04_ifstatement;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        /*
         * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         *
         * INPUT  ==>  OUTPUT
         *  Y     ==>   YES ;
         *  N     ==>   NO
         */

        Scanner hava = new Scanner(System.in);
        System.out.println("lutfen Y yada N seceneklerinden birini giirniz");
        String kod = hava.next();

        if (kod.equalsIgnoreCase("y")) {
            System.out.println("YES");
        } else if (kod.equalsIgnoreCase("n")) {
            System.out.println("NO");

        } else {
            System.out.println("lutfen gecerli bir harf giirniz ");
        }


    }


}
