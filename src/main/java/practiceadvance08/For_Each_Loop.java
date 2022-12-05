package practiceadvance08;

import java.util.Scanner;

public class For_Each_Loop {

    public static void main(String[] args) {


        /*

        1 2 3 4 5
         2 3 4 5
        3 4 5
        4 5
        5

        yukarıdaki şekli yazdıran bir kod yazınız
         */


        Scanner input = new Scanner(System.in);

        System.out.println("lutfen satır sayısınız giriniz");
        int satirsayisi = input.nextInt();

        for(int i= 1;  i<=satirsayisi; i++){
            for (int bosluk = 1; bosluk <i ; bosluk++) {
                System.out.print(" ");

            }

            for (int sayi = i; sayi<=satirsayisi; sayi++){
                System.out.print(sayi+" ");
            }
            System.out.println();


        }



    }
}
