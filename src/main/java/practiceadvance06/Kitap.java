package practiceadvance06;

public class Kitap {

    String kitapAdi;
    String yazaAdi;
    int sayfaSayisi;
    String seriNo;

    static int kitapSayisi;


    public  Kitap(String kitapAdi,String yazaAdi,int sayfaSayisi){

       this.kitapAdi =kitapAdi;
       this.yazaAdi= yazaAdi;
       this.sayfaSayisi = sayfaSayisi;
       kitapSayisi++;
       seriNo = kitapAdi.substring(0,2)+yazaAdi.substring(0,2)+kitapSayisi; // this kullanmaya gerek yok



    }

    public void kitapBilgileriMethodu(){
        System.out.println("kitapAdi = " + kitapAdi);
        System.out.println("yazaAdi = " + yazaAdi);
        System.out.println("sayfaSayisi = " + sayfaSayisi);
        System.out.println("seriNo = " + seriNo);
    }


}
