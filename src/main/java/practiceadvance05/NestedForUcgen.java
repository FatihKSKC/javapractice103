package practiceadvance05;

import java.util.Scanner;

public class NestedForUcgen {
    public static void main(String[] args) {

 /*
Kullanıcıdan aldığınız satır sayısına göre aşağıdaki şekli yazdıran bir kod yazınız.

               *
              * *
             * * *
            * * * *
           * * * * *
 */

        Scanner input = new Scanner(System.in);

        System.out.println("satir sayısını giriniz");
        int satırSayısı = input.nextInt();




        for (int i = 0; i <satırSayısı ; i++) {  // satır sayısını veriyor.

            for (int bosluk =satırSayısı-i;bosluk>1; bosluk--){
                System.out.print(" ");

            }

            for (int yildiz=0; yildiz<=i; yildiz++){
                System.out.print("* ");
            }
            System.out.println();
        }
/*

        Scanner scan = new Scanner(System.in);
        System.out.println("satir sayisini veriiii misin");
        int s = scan.nextInt();
        for (int i =1; i<=s ; i++)
        {
            System.out.print(" ".repeat(s-i));
            System.out.println("* ".repeat(i));
        }



 */



    }
}
