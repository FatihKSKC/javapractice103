package practiceadvance04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_EkleCikar {
    public static void main(String[] args) {

 /*
Kullanıcdan aldığınız bir sayıyı bir list'e ekleyen,
list'ten çıkaran yada mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.
 */


        Scanner input = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        while (true) {

            System.out.println("Ekeleme yapmak icin 'add'\n" +
                    "guncelleme yapmak icin 'update'\n" +
                    "silmek için 'delete' \n" +
                    "cikmak için 'quit' komitini girinz");

            String option = input.next();

            if (option.equalsIgnoreCase("add")) {
                System.out.println("eklemek istediginiz sayıyı giriniz");
                int ekleneceksayi = input.nextInt();
                list.add(ekleneceksayi);

            } else if (option.equalsIgnoreCase("update")) {
                System.out.println("guncelleme istediginiz elemeti gir");
                int updatedileceksayi = input.nextInt();
                System.out.println("girmek istediginiz yeni sayiyi giriniz");
                int girileceksayi = input.nextInt();
                list.set(list.indexOf(updatedileceksayi), girileceksayi);
            } else if (option.equalsIgnoreCase("delete")) {
                System.out.println("lutfen silinecek elementi giriniz");
                int silineceksayi = input.nextInt();
                list.remove((Integer) silineceksayi); // reperclass objeye çevirdik.

            } else if (option.equalsIgnoreCase("quit")) {
                break;
            } else {
                System.out.println("geçerli bir komut giriniz");
            }
            System.out.println(list);

        }
        System.out.println("gule gule ");



    }
}



