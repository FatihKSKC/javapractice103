package practiceadvance05;

public class Market_Constructor {

    //Ürün adı, ürün fiyatı ve (varsa) son kullanma tarihlerini yazdıran bir market programı yazınız..

    public static void main(String[] args) {

       Market ekmekObjesi = new Market("ekmek",5,"12.11.2023");

        System.out.println("urun fiyatı = "+ekmekObjesi.urunFiyati);
        System.out.println("urunun adı = "+ekmekObjesi.urunAdi);
        System.out.println("son kullanma tarihi = "+ekmekObjesi.sonKT);


        Market nutella = new Market("nutella",45,"12.10.2023");
        System.out.println("urun adı = "+ nutella.urunAdi);
        System.out.println("urun fiyaı = "+nutella.urunFiyati);
        System.out.println("son kullanma tarihi = "+nutella.sonKT);


        Market bardakObjesi = new Market("bardak",50); // new keywordu bize constructor verdi.
        System.out.println("urunun adı: "+bardakObjesi.urunAdi);
        System.out.println("urunun fiyatı: "+bardakObjesi.urunFiyati);





    }
}
