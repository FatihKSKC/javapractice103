package practiceadvance04;

import java.util.ArrayList;
import java.util.List;

public class ArraysOrtakElemanlar {
    public static void main(String[] args) {

        /*
         * İki Array'de ortak bulunan elementleri yazdırınız.
         * (case sensitivity olmadan)

         * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}

         * Output : [brad,sofia,emily]
         */

        String arr[] = {"John", "Brad", "Angel", "Sofia", "Emily" };
        String brr[] = {"sofia", "brad", "grace", "emily", "hazel","john" };

        List<String> list = new ArrayList<>();

        for (String w : arr) {

            for (String k : brr) {

                if (w.equalsIgnoreCase(k)) {

                    list.add(w);


                }

            }

        }


        System.out.println("ortak elementler : " + list);


    }
}
