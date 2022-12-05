package practiceadvance06;

import java.util.Scanner;

public class RastgeleSifreOlusturma {
    public static void main(String[] args) {


        //Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip rastgele şifre üreten bir kod yazınız.


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir şifre için karakter sayını giriniz");
        int karakterSayısı = input.nextInt();
        String sifre = ""; // şifreyi bunun içine koyacak
        int sayac=0; // girilen karakter sayısı kadar şifre oluşturmak için kullanacagız

        String karakterler = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789 ";
        int maxIndeks = karakterler.length();

        while (sayac<karakterSayısı){

            int ratgeleIndeks = (int)(Math.random()*maxIndeks);
            sifre+= karakterler.charAt(ratgeleIndeks);
            sayac++;


        }

        System.out.println(sifre);




    }
}
