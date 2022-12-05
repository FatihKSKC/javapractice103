package day09_nestedforloop;

public class C04_DoWhileLoop {

    public static void main(String[] args) {
        /*
        adada yalnız bir maymun var
        hergun 4 muz ymesi gerekiyor
        muz sayısı 165
        maymun kaç gun hayatta kalabilir.

         */

        int muzSayisi = 165;
        boolean maymunAlive = true;
        int survivalDays = 0;

        do {
            muzSayisi -= 4;
            survivalDays++;

            if (muzSayisi < 4) {
                break;
            }

        } while (muzSayisi > 0);
        System.out.println(" yaşadığı gun sayısı " + survivalDays);

    }
}
