package practiceadvance10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapKeyYazdir {
    public static void main(String[] args) {


        //Aşağıda verilen fiyat listesinden fiyatı 29.99 olan ürünlerin adlarını yazdırınız.
        Map<String, Double> urunler = new HashMap<>();
        urunler.put("Kemer", 19.99);
        urunler.put("Gomlek", 29.99);
        urunler.put("Kazak", 24.99);
        urunler.put("Pijama", 29.99);
        urunler.put("Ayakkabi", 89.99);
        urunler.put("Kravat", 19.99);
        urunler.put("Terlik", 29.99);

        List<Integer>fiyatlar = new ArrayList<>();

        for (Map.Entry<String,Double> w : urunler.entrySet()){

            if (w.getValue()==29.99){
                System.out.println(w.getKey()+" >>>> "+ w.getValue());
            }

        }

    }
}
