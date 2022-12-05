package practiceadvance;

import java.util.Scanner;

public class DoWhileTahminOyunu {
    public static void main(String[] args) {

        //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
        //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!!.


        Scanner input = new Scanner(System.in);

        int sayi = 0;
        int counter = 0;
        int rastgele = (int) (Math.random() * 100) + 1;


        System.out.println("0 ile 100 arasında bir sayı giriniz");

    do {

        sayi = input.nextInt();

        if (sayi>=0&&sayi<=100) {
            counter++;
            if (counter == 10) {
                System.out.println("10 hakkınızı da kullandınız oyun sona erdi");
                break;
            }

            if (sayi > rastgele) {
                System.out.println(counter + ". hakkınız : " + "(lutfen daha kucuk sayı giriniz)");
            } else if (sayi < rastgele) {
                System.out.println(counter + ".hakkınız : " + "lutfen daha buyuk bi rsayı giriniz");

            } else if (sayi == rastgele) {
                System.out.println("tebrikler kazandınız");
            }
        }System.out.println("verilen degerin dışında bir sayı girdiniz. lutfen 0-100 arası bir sayı giriniz");

    } while (sayi != rastgele);





    }
}
