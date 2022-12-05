package practiceadvance10;

import java.io.*;
import java.util.Arrays;

public class TextOkuma {

    //Bir text dosyasındaki 3. satırın kelime sayısını veren bir kod yazınız.

    public static void main(String[] args) throws IOException {


       BufferedReader file  = new BufferedReader(new FileReader("src\\main\\java\\practiceadvance10\\Text"));
// yukaridaki obje satir satir okumak icin olusturulur.
        file.readLine(); // 1. satiri okudu
        file.readLine(); // 2. satiri okudu
        String line3 = file.readLine(); // 3. satiri okudu.
        String arr [] = line3.split(" ");
        System.out.println(Arrays.toString(arr)); //[sen, de, kazan, cok, para]

        int kelimeSayisi = arr.length; // eleman sayisi icin length methodunu kullandik.
        System.out.println(kelimeSayisi); //5

        // her file.readLine(); metodu bir satir okuyor.

        //Son satırı okutma...
        String line = "";
        while (true){
            line = file.readLine();
            if (file.readLine()==null){
                break;
            }
        }
        System.out.println(line);

        String brr[] = line.split(" ");
        System.out.println(brr.length);


    }



}
