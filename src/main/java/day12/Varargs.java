package day12;

public class Varargs {
    public static void main(String[] args) {


        // verilen string ifadeleri birleştiren concat isimli bir method oluşturun vararg kullanarak yap.


        concat("safran","bolu", " evleri "," cok ", " guzel "," gorunuyor.");



    }








    public static void concat(String...a){
        String son ="";
        for (String w: a){

            son+=w;
        }
        System.out.println(son);
    }
}






