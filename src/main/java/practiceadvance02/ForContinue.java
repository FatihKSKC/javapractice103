package practiceadvance02;

import java.util.Scanner;

public class ForContinue {


    public static void main(String[] args) {


        /* TASK :
Kullanıcıdan 5 adet sayı isteyiniz
Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
*/

        Scanner input = new Scanner(System.in);
        int num = 0;

        for (int i = 1; i < 6; i++) {
            System.out.println("lutfen bir sayı giriniz");

            int sayi = input.nextInt();

            if (sayi > 5 && sayi < 10) {
                continue;

            }
            num+=sayi;
        }

        System.out.println(num);
    }


}
