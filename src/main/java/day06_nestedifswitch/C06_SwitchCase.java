package day06_nestedifswitch;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {

//Ex: Girilen Pozitif 3 basamaklı bir sayıyı yazı ile yazdırınız
//Ex : 568
//Besyuzaltmissekiz

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen uc basamaklı bir sayı giriniz");
        int sayi= input.nextInt();

        int birler = sayi%10;
        int onlar = (sayi/10)%10;
        int yuzler = (sayi/100)%10;


        if (sayi>99&&sayi<1000){

            switch (yuzler){

                case 0:
                    System.out.println("ilk sayı sıfır olamaz");
                break;
                case 1:
                    System.out.println("yüz");
                break;
                case 2:
                    System.out.println("ikiyuz");
                break;
                case 3:
                    System.out.println("uzyuz");
                break;
                case 4:
                    System.out.println("dortyuz");
                break;
                case 5:
                    System.out.println("besyuz");
                break;
                case 6:
                    System.out.println("altıyuz");
                break;
                case 7:
                    System.out.println("yediyuz");
                break;
                case 8:
                    System.out.println("sekizyuz");
                break;
                case 9:
                    System.out.println("dokuzyuz");
                break;

            }
            switch (onlar){

                case 0:
                    System.out.println("");
                break;
                case 1:
                    System.out.println("on");
                break;
                case 2:
                    System.out.println("yirmi");
                break;
                case 3:
                    System.out.println("otuz");
                break;
                case 4:
                    System.out.println("kırk");
                break;
                case 5:
                    System.out.println("elli");
                break;
                case 6:
                    System.out.println("altmıs");
                    break;
                case 7:
                    System.out.println("yetmis");
                    break;
                case 8:
                    System.out.println("seksen");
                    break;
                case 9:
                    System.out.println("doksan");
                    break;


            }

            switch (birler) {

                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("uc");
                    break;
                case 4:
                    System.out.println("dort");
                    break;
                case 5:
                    System.out.println("bes");
                    break;
                case 6:
                    System.out.println("altı");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;



            }



        }else {
            System.out.println("lutfen uc basamaklı pozitif bir sayı giriniz");
        }

















    }
}
