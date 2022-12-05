package day06_nestedifswitch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

/*
Kullanicidan Final notunu 'A' ,'B' ,'C' seklinde  girmesini isteyiniz,
'A'  ->  "Cok Basarili"
'B'  ->  "Basarili"
'C'  ->  "Orta"    bu notlar disindakilere de
         Digerleri..
            yazdiriniz.Nested Ternary ile cozunuz
 */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        String not = input.next();

        String notAraligi = not.equalsIgnoreCase("A") ? "ÇOK BASARILI" :
                            not.equalsIgnoreCase("B") ? "BAŞARILI" :
                            not.equalsIgnoreCase("C") ? "ORTA" :
                                                                   "DIGERLERI";

        System.out.println(notAraligi);




    }


}
