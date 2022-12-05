package day16;

public class TryCatch {
    // verilen iki sayiyi 10 kez bolen kodu yaziniz


    public static void main(String[] args) {


        int a =100;
        int b = 5;

        int counter =1;

        while (counter<10){
            try {
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println("payda sifiri bolmez");
            }
            b--;
            counter++;


        }








    }


}
