package day12;

import java.util.Scanner;

public class LocalDateTime {

    // kullanıcıdan ay ve gun bilgilerini alarak burcunu hesaplatan kodu yazınız

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen doğdugunuz ayı string olarak giriniz");
        String ay = input.next();

        System.out.println("lutfen dogdunuz gun bilgisini yazınız");
        int gunNo = input.nextInt();

        String burc = "";

        if (ay.equalsIgnoreCase("ocak")){
            if (gunNo>22)
                burc = "Kova";
            else
                burc = "Oglak";
        }
        if (ay.equalsIgnoreCase("subat")){
            if (gunNo>20)
                burc = "balık";
            else
                burc = "kova";
        }
        if (ay.equalsIgnoreCase("mart")){
            if (gunNo>21)
                burc = "koc";
            else
                burc = "balık";
        }
        if (ay.equalsIgnoreCase("nisan")){
            if (gunNo>21)
                burc = "Kova";
            else
                burc = "Oglak";
        }
        if (ay.equalsIgnoreCase("mayıs")){
            if (gunNo>22)
                burc = "Kova";
            else
                burc = "Oglak";
        }
        if (ay.equalsIgnoreCase("haziran")){
            if (gunNo>23)
                burc = "yengec";
            else
                burc = "ikizler";
        }
        if (ay.equalsIgnoreCase("temmuz")){
            if (gunNo>23)
                burc = "aslan";
            else
                burc = "yengec";
        }
        if (ay.equalsIgnoreCase("agustos")){
            if (gunNo>23)
                burc = "basak";
            else
                burc = "aslan";
        }
        if (ay.equalsIgnoreCase("eylul")){
            if (gunNo>23)
                burc = "terazi";
            else
                burc = "basak";
        }
        if (ay.equalsIgnoreCase("ekim")){
            if (gunNo>23)
                burc = "akrep";
            else
                burc = "terazi";
        }
        if (ay.equalsIgnoreCase("kasım")){
            if (gunNo>22)
                burc = "yay";
            else
                burc = "akrep";
        }
        if (ay.equalsIgnoreCase("aralık")){
            if (gunNo>22)
                burc = "oglak";
            else
                burc = "yay";
        }


        System.out.println(gunNo +" "+ay+" "+" tarihinde dogduysanız burcunuz "+ burc);







    }

}
