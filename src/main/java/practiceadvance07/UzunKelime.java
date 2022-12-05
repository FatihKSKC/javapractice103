package practiceadvance07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UzunKelime {
    public static void main(String[] args) {

        /*
          Kullanıcıdan alınan cümledeki en uzun kelimeyi(kelimeleri) return eden bir method oluşturunuz.
         */

        System.out.println(uzunKelime());


    }

    public static List<String> uzunKelime(){
        Scanner input = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle =input.nextLine();

        String arr[] = cumle.split(" ");
        int max = 0;

        for (String w:arr){

           if (w.length()>max){
               max = w.length();
           }

        }
        List<String>enUzunKelimeler = new ArrayList<>();
        for (String w: arr){

            if (w.length()==max){
                enUzunKelimeler.add(w);
            }
        }


        return enUzunKelimeler;

    }

}
