package practiceadvance07;

import java.util.Arrays;

public class ArraysString {
    public static void main(String[] args) {



        /*
      Array olarak verilen bir cümleyi String olarak negatif anlamıyla yazdıran bir kod yazınız.
      Input:
      String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
      Output:
      String output ="JavaIsNOTDifficult";
       */




        String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};

        System.out.println(Arrays.toString(arr));


        String str ="";
        for (String w: arr){

            str+=w;

        }

        System.out.println(str);

        String strNot = str.replace("Is","IsNot");
        System.out.println(strNot);

    }
}