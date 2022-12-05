package practiceadvance10;

public class Vararg {


    public static void main(String[] args) {

         /*
     Parametrelerinin ilki hariç  karakter sayılarını toplayan ve
      bu toplamı birinci parametrenin karakter sayısıyla çarpan bir method yazınız.
        (indeks ve if statement kullanmayınız)


   */

        System.out.println( ilkHaricTopla("ali","veli","selim"));


    }
    public static int ilkHaricTopla(String a , String...b){
        int sum =0;
        for (String w : b){

            sum+=w.length();
        }
        int result = sum*a.length();
        return result;


    }

}
