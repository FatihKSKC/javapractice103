package day16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch01 {


    public static void main(String[] args) {

         /*
      /*
    Marketteki tum urunleri bir array'de tuttugumuzu varsayalim.
    Kullaniciya index sorup, o indexdeki urunu yazdiran bir program yaziniz.
    (Kullanici marketteki urun sayisindan fazla sayida bir index girerse exeption vermesinin onune gecelim)
     */


        String arr []= {"et","sut", "fistik"};


        boolean flag = true;
        int indeks =0;
        while (flag){


            try {
                Scanner input = new Scanner(System.in);
                System.out.println("istediginiz urunun sira numarasini giriniz");
                indeks = input.nextInt();

                flag=false;

            } catch (InputMismatchException e) { // istedigi indeksi vermedeigi zaman
               e.printStackTrace();
            }


        }
        try {
            System.out.println(arr[indeks]); // arraydaki indeks varsa calisir
        } catch (ArrayIndexOutOfBoundsException e) { // arraydaki indeks yoksa calismaz.
          e.printStackTrace();
        }


    }
}
