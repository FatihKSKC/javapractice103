package practiceadvance05;

public class HesapMakinesiMethodu {

    public void toplama(int...a){
        int toplam=0;

        for (int w: a){
            toplam+=w;
        }
        System.out.println("Toplam= "+toplam);
    }

    public void cikarma(int a, int b){

        System.out.println("Fark= "+(a-b));

    }

    public void carpma(int...a){

        int carpim =1;

        for (int w:a){
            carpim*=w;
        }
        System.out.println("carpim ="+carpim);

    }

    public void bolme(double a, double b){

        if (b==0){
            System.out.println("bolen sayı 0 olamaz");
        }else
        System.out.println("bolme = "+ a/b);

    }







}
