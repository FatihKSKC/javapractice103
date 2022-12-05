package day15_inheritanceencaplucations;

public class Test {
    private double genislik;
    private double yukseklik;
    private double ekranBuyuklugu;
    private int maxSes = 30;
    private int ses = 12;
    private boolean guc;

    public Test(double genislik, double yukseklik, double ekranBuyuklugu, int i) {
        this.genislik = genislik;
        this.yukseklik = yukseklik;
        this.ekranBuyuklugu = ekranBuyuklugu;
    }

    public double kanalDegistirme(int kanal) {

        switch (kanal) {
            case 1:
                return 34.35;

            case 2:
                return 45.4;
            case 3:
                return 78.2;


        }
        return 0;
    }

    public void gucDugmesi() { // kapaliysa acar aciksa kapatir tv yi.
        this.guc = !guc;
    }

    public int sesAzaltma() {
        if (0 < ses) {
            ses--;
        }
        return ses;

    }

    public int sesArtirma() {
        if (maxSes > ses) {
            ses++;
        }
        return ses;
    }
}
