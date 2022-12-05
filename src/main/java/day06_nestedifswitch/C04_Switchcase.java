package day06_nestedifswitch;

import java.util.Scanner;

public class C04_Switchcase {

    public static void main(String[] args) {
        // Kullanıcının yasadıgı güne  göre;
// Kullanicinin verecegi gun kadar sonraki günun  hangi gün olduğunu yazdırınız.
// pazartesi hafta başlangıcı
//BulunanGun = (kacGunSonrasi + kacıncıGun) % 7;

        Scanner input = new Scanner(System.in);

        System.out.println("pazartesi : 1 \t sali : 2 \t carsamba : 3 \t persembe : 4 \t cuma: 5 \t cumartesi: 6 \t pazar : 7\t   ");
        int kacinciGun = input.nextInt();

        if (kacinciGun<1 || kacinciGun>7){
            System.out.println("hatalı veri girdiniz");
        }else {

            System.out.println("kaç gun sonrasını bilmek istiyorusnuz");
            int sayi = input.nextInt();
            int bulunanGun = (sayi + kacinciGun)%7;
            switch (bulunanGun){

                case 1:
                    System.out.println("pazartesi");
                    break;
                case 2:
                    System.out.println("sali");
                    break;
                case 3:
                    System.out.println("carsamba");
                    break;
                case 4:
                    System.out.println("persembe");
                    break;
                case 5:
                    System.out.println("cuma");
                    break;
                case 6:
                    System.out.println("cumaartesi");
                    break;
                case 0:
                    System.out.println("pazar");
                break;
                default:
                    System.out.println("gecerli bir deger giriniz");







            }
















        }













    }





}
