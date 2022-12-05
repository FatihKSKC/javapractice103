package practiceadvance09;

import java.util.HashMap;
import java.util.Map;

public class Map_UrunFiyatlariniTopla {

    /*
    Bir map içerisinde verilen fiyatların toplamını bulan bir kod yazınız.(for each loop kullanınız)
Örn: {Kemer=19.99, Gömlek=29.99, Ayakkabı=89.99, Kazak=24.99, Kravat=19.99} ==> Toplam: 184.95


     */


    public static void main(String[] args) {

        HashMap<String,Double> urun = new HashMap<>();
        urun.put("Kemer",19.99);
        urun.put("Gömlek",29.99);
        urun.put("Ayakkabı",89.99);
        urun.put("Kazak",24.99);
        urun.put("Kravat",19.99);

        System.out.println(fiyatTopla(urun));


    }

    public static double fiyatTopla(Map<String,Double> map){



       double sum =0;
        for (double w:   map.values()){
            sum+=w;
        }
        return sum;

    }
}
