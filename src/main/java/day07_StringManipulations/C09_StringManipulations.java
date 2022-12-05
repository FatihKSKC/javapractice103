package day07_StringManipulations;

import java.util.Scanner;

public class C09_StringManipulations {

    public static void main(String[] args) {

         /*
       Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
                   i)En az 8 character icermeli
                   ii)Space characteri icermemeli
                   iii)Buyuk harf icermemeli
                   iv)Son characteri "." olmali

*/
        String pwd = "1m34567.";

        boolean birinci = pwd.length() > 7;
        boolean ikinci = !pwd.contains(" ");
        boolean ucuncu = pwd.replaceAll("[A-Z]", "").length() == pwd.length();
        boolean dorduncu = pwd.endsWith(".");


        System.out.println(birinci && ikinci && ucuncu && dorduncu);


        int a = 20;
        int count = 0;
        int top = 0;

        for (int i = 1; i < a + 1; i++) {

            if (a % i == 0) {
                count++;
                System.out.println(i);
            }

        }
        System.out.println(count);


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen sayılar giriniz");
        int sayı = input.nextInt();

        for (int i = sayı; i >=0 ; i++) {


        }
    }

}
