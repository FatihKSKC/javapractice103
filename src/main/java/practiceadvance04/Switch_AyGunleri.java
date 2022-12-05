package practiceadvance04;

import java.util.Scanner;

public class Switch_AyGunleri {
    public static void main(String[] args) {

         /*

Girilen yil ve ay numarasına göre ayin kaç gün olduğunu yazdiran bir kod yazınız.
    Girdi yıl: 2000 ay: 2
    Çıktı: 29

*/


        Scanner input = new Scanner(System.in);

        System.out.println("lutfen yılı giriniz");
        int yil = input.nextInt();

        System.out.println("lutfen ay numarasını giriniz");
        int ay = input.nextInt();

        int gun;

        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                gun = 31;
                System.out.println("girdiginiz ayın gun sayısi :" + gun);
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                gun = 30;
                System.out.println("girdigininz ayın gun sayısı " + gun);
                break;

            case 2:
                if ((yil % 100 == 0 && yil % 400 == 0) || (yil % 4 == 0 && yil % 100 != 0)) {
                    gun = 29;

                } else {

                    gun = 28;
                    System.out.println("girdiginiz ayın gun sayısı " + gun);
                }

                break;


        }


    }
}
