package practiceadvance10;

public class Faktoriyel {
    public static void main(String[] args) throws Exception {

        //Faktoriyel hesaplayan bir method yazınız.(Loop kullanmayınız.)

        System.out.println(faktoriyel(5));


    }


    public static int faktoriyel(int a) throws Exception {

        if (a > 0) {

            if (a == 1) {
                return 1;
            } else {
                return a * faktoriyel(a - 1);
            }

        } else {
            throw new Exception("sayi sifirdan buyuk olmalidir");
        }
    }
}
