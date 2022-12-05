package practiceadvance02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrasyElement {
    public static void main(String[] args) {

        /*

     Elementlerini kullanıcıdan alarak bir integer Array oluşturunuz.
     Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.

     */



        Scanner  input =  new Scanner(System.in);

        System.out.println("lutfen array limitini giriniz");
        int limit = input.nextInt();


        int [] arr =new int[limit];


        for (int i=0; i<limit; i++){

            System.out.println("giriniz : index =" + i);
            arr[i]= input.nextInt();

        }

        System.out.println(Arrays.toString(arr));

        System.out.println("silmek istediğiniz indeksi giriniz");

        int removeIndex = input.nextInt();
        int[]  yeni = new  int[limit-1];
        int index2 = 0;

        for (int i =0; i<arr.length; i++){

            if (removeIndex!=i){

               yeni[index2]=arr[i];

               index2++;
            }
        }

        System.out.println(Arrays.toString(yeni));




        //2. yol

        List<Integer>list = new ArrayList<>();

        for (Integer w : arr){
            list.add(w);


        }

        list.remove(2); //  listte indeksi 2 olan elemanı sildi.

        System.out.println(list);

        System.out.println("silmek istediğiniz elementei giriniz");
list.remove(list.indexOf(input.nextInt()));
        System.out.println(list);




    }
}
