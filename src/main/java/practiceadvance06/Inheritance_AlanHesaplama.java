package practiceadvance06;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Inheritance_AlanHesaplama {

    //Kare prizma, silindir ve koninin hacmini hesaplayan bir kod yazınız.(Inheritance kullanınız)

    public static void main(String[] args) {

        KarePrizma karePrizma = new KarePrizma();
        double kareprizmaHacmi = karePrizma.hacimHesapla(5,6);
        NumberFormat obj = new DecimalFormat(".00"); // virgulden sonra iki basamak olsun istedim.
        System.out.println("kareprizmaHacmi = " + kareprizmaHacmi);







        Koni koni = new Koni();
        double koniHacmi = koni.hacimHesapla(3,6);
        System.out.println("koniHacmi = " + koniHacmi);





        Silindir silindir = new Silindir();
        double silindirHacmi  = silindir.hacimHesapla(6,4);
        NumberFormat obj2 = new DecimalFormat(".00");
        System.out.println("silindirHacmi = " + silindirHacmi);



    }


}
