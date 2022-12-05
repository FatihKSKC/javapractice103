package day13;

public class Overloading {

    public static void main(String[] args) {
        // aynı classta aynı isimde birden çok method olusturmak için method signature degiştiriliri
        // bu durumda elementi en uygun olanı java seçer.
        //buna overlaoading denir.

        // data type lar degistirilerek overloading yaptık yada data type sayılarını degiştirirek de yapabiliriz.
        // yani ya data tiplerini degiştiririz ya da data sayısını degiştiririz.

        cikarma(98,(float)52.666);
        cikarma(14.3,3);
       toplama(55,63);
       toplama(2.3,4.5);
       carpma(2,3);
       carpma(2.2,3);

    }

    private static void carpma(double i, int i1) {
        System.out.println(i*i1);
    }


    private static void carpma(int i, int i1) {
        System.out.println(i*i1);
    }

    private static void toplama(double i, double i1) {
        System.out.println(i+i1);
    }

    private static void toplama(int i, int i1) {
        System.out.println(i+i1);
    }


    private static void cikarma(int i, float v) {

        System.out.println(i-v);
    }

    private static void cikarma(double v,int i) {

        System.out.println(i-v);
    }






}
