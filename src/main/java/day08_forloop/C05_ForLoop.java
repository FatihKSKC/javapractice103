package day08_forloop;

public class C05_ForLoop {

    public static void main(String[] args) {

        // kelimenin ilk ve son harfi kaç defa ekrana yazdıran bir kodu yazınız.



        String kelime = "istanbul";
        int tekrarlan =4;

        String ilkSonHarf = kelime.substring(0,1) + kelime.substring(kelime.length()-1);



        String cikti = "";

        for (int i = 1; i <=tekrarlan ; i++) {

            cikti=cikti+ilkSonHarf;

        }


        System.out.println(cikti);




    }


}
