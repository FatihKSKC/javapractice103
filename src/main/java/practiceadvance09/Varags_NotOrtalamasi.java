package practiceadvance09;

public class Varags_NotOrtalamasi {

    // 4 ogrencinin not ortalmasini hesaplayan method yaziniz


    public static void main(String[] args) {

        ortalamaHesapla("ali",6,4,3,6,7,8,6,5,11,23,34,44);

        ortalamaHesapla("ayse",90.70,85,95);
    }


    public static void ortalamaHesapla(String isim, double...not){
        double sum =0;

        for (double w: not){



            sum+=w;

        }
        System.out.println(String.format("%.2f",sum/ not.length)); // virgulden sonra iki basamak

    }
}
