package practiceadvance05;

public class Market {

    String urunAdi;
    double urunFiyati;
    String sonKT;
    static int toplamUrun;

    Market(String urunIsmi,double fiyat, String sKT){

        urunAdi= urunIsmi;
        urunFiyati= fiyat;
        sonKT = sKT;

        toplamUrun++;

    }

    Market(String urunIsmi, double fiyat){

        urunAdi = urunIsmi;
        urunFiyati = fiyat;
        sonKT = "son kullanma tarihi yoktur";

    }



}
