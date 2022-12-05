package day03_ifstatement;

public class C04_MantikOperatorleri {

    public static void main(String[] args) {
// tek & ile de çalışır ancak yavaş çalışır
// java üclü karşılastırma yapmak ikili karşılaştıma  yapar.
        System.out.println(5 + 2 == 8);

        boolean sonuc1 = 5 > 4 && 7 < 9 && 6 + 3 == 9 && 5 + 2 != 8;
        System.out.println(sonuc1);

        Boolean sonuc2 = 5 > 4 && 7 > 9 && 6 + 3 == 9 && 5 + 2 != 8;
        System.out.println(sonuc2);

        int sayi1 = 15;
        System.out.println(sayi1 > 10 && sayi1 < 20);

int sayi2= 5; // 10 ile 20 arasınsa olmadıgını turue veren kod yaz
        System.out.println(sayi2<10 || sayi2<20);


    }


}
