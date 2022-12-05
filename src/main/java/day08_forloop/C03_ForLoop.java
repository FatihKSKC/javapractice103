package day08_forloop;

public class C03_ForLoop {

    public static void main(String[] args) {


        String cumle = "java ogrenmek cok kolay";
        String harf = "a";
        int counter = 0;

        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.substring(i,i+1).equalsIgnoreCase(harf)){

                counter++;
            }

        }
        System.out.println(cumle+ " cumlesinde "+ harf+" harfi "+ counter+" adet vardır.");




    }



}
