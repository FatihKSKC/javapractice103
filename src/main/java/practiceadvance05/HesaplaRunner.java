package practiceadvance05;

public class HesaplaRunner {
    // Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir method oluşturunuz.(Method overloading kullanınız)
    public static void main(String[] args) {

        Hacim hacim = new Hacim();

        int kup=hacim.hacimHesapla(5);                           //  kup        hacmi
        int kare=hacim.hacimHesapla(5,9);                    //   kare       prizma
        int dikdortgen = hacim.hacimHesapla(5,6,4);      //    dikdortgen prizma


        System.out.println(kup);
        System.out.println(kare);
        System.out.println(dikdortgen);



    }
}
