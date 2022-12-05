package practiceadvance06;

public class Kutuphane {
    //Kütüphaneye eklemek istediğiniz kitapları, adı, yazar adı, sayfa sayısı, seri numarası ile yazdıran bir kod yazınız.

    public static void main(String[] args) {

        Kitap kitap1 = new Kitap("zambaklar","mustafa",500);
        kitap1.kitapBilgileriMethodu();


        Kitap kitap2 = new Kitap("istanbulun fethi","fatih sultan",1453);

        kitap2.kitapBilgileriMethodu();




    }


}
