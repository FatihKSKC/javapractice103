package day13;

public class Vararg {
    public static void main(String[] args) {
        // verilen sayılarda ilki hariç tum sayıları toplayıp ilk sayı ile çarpan bir method oluşturun.



        sayılar(5,7,2,4,9,9,4,5,6,8,9); //vararg


    }


    public static void sayılar(int a, int...b){

        int toplam=0;

        for (int w: b){

            toplam = toplam+w;
        }

        System.out.println(toplam*a);


    }


}
