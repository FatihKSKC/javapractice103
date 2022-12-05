package practiceadvance03;

import java.util.Arrays;

public class Min_Max {
    /*
   Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' değerleri bulan bir kod yazınız.

   input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
   output: min:-90, max:10001, secMax: 8787

  */
    public static void main(String[] args) {

//1.yol
    int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};

Arrays.sort(arr);


        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
        System.out.println(arr[arr.length-2]);

// 2.yol


        int min =arr[0];
        int secMax = arr[0];
        int max = arr[0];   // hangi deger atadıgım onemli degil.

        for (int w: arr){

            if (w<min){

                min=w;
            } else if (w>max) {
                secMax=max;
                max=w;
            } else if (w>secMax) {
                secMax=w;
            }

        }

        System.out.println("min "+ min+" second maksimum "+secMax+" max "+max);


    }
}
