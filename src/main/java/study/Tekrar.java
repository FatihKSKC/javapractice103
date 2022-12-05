package study;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Tekrar {


    public static void main(String[] args) throws IOException {

        //Bir text dosyasındaki 3. satırın kelime sayısını veren bir kod yazınız.

        BufferedReader oku = new BufferedReader(new FileReader("src\\main\\java\\practiceadvance10\\Text"));
        oku.readLine();

        String arr[] = oku.readLine().split(" "); // ikinci satiri aldi.
        System.out.println(arr.length); // ikinci satirdaki kelime sayisini verdi




        oku.readLine();
        String str =""; // icine atacagimiz bos string tanimladik

        while (true){

            str = oku.readLine();

            if (oku.readLine()==null){
                break;
            }

        }

        System.out.println(str); // son satirdaki cumle

        String brr[] = str.split(" "); // kelimeleri array icine koyduk.

        System.out.println(Arrays.toString(brr)); // arrayi yazdirdik
        System.out.println(brr.length); // arraydeki kelimelerin sayisini yazdirdik.


    }


}





