package day17collectionsmap;

import java.util.HashMap;

public class Map01 {

    /*
    ad ve soyad iki ayri array da ad=soyad seklinde birlikte yaziniz


     */

    public static void main(String[] args) {

        String isim[] ={"ummu","elif","esil"};
        String soyisim[] = {"zeren", "eslem","erva"};

        HashMap<String,String>tamIsim = new HashMap<>();

        for (int i = 0; i < isim.length; i++) {

            tamIsim.put(isim[i],soyisim[i]);

        }

        System.out.println(tamIsim);






    }
}
