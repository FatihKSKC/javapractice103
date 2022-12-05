package practiceadvance09;

import java.util.HashMap;
import java.util.Map;

public class KelimeleriSay {

     /*

 Bir String içerisindeki kelimelerin kaç kez tekrar ettiğini bulan bir method yazınız.

 input: "Ali okula geldi ve Ayse de okula geldi."
 output: Ali = 1, okula = 2, geldi = 2, ve = 1, Ayse= 1, de = 1

*/

    public static void main(String[] args) {

        String str = "    Ali    okula  .,,  geldi ve Ayse de okula  geldi .";

        kelimeleriSay(str);






    }

    public static void kelimeleriSay(String str){

        String yenistr = str.replaceAll("\\p{Punct}","").replaceAll("\\s+"," ").trim();
        String arr [] = yenistr.split(" "); // arraya cevirdik

        Map<String,Integer>kelimeTekrarli = new HashMap<>();

        for (String w: arr){
            if (!kelimeTekrarli.containsKey(w)){
                kelimeTekrarli.put(w,1);
            }else {
                kelimeTekrarli.put(w,kelimeTekrarli.get(w)+1);
            }

        }
        System.out.println(kelimeTekrarli);


    }


}
