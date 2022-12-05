package practiceadvance09.abstraction;

public class Runner {

    //Dikdörtgen ve üçgenin alanlarını hesaplayan bir kod yazınız.(abstraction kullanın)


    public static void main(String[] args) {

        Dikdortgen dikdortgen = new Dikdortgen();
        System.out.println(dikdortgen.alanHesapla(8,9));

        Ucgen ucgen = new Ucgen();
        System.out.println(ucgen.alanHesapla(4,8));



    }
}
