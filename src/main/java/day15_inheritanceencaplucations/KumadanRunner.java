package day15_inheritanceencaplucations;

public class KumadanRunner {
    public static void main(String[] args) {

        Test tv = new Test(34.35,80.00,40,45);

        tv.gucDugmesi();// tv actim
        System.out.println(tv.kanalDegistirme(2));
        System.out.println(tv.sesAzaltma());
        System.out.println(tv.sesArtirma());


    }
}
