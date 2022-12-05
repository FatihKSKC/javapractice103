package practiceadvance10;

public class RandomAdOlusturma {

    public static void main(String[] args) {

        //Rastgele alınan harfleri bir Stringe ekleyerek adınızı oluşturan ve
        // bunu kaç deneme ile yaptığını yazdıran bir kod yazınız.

        String karakterler=" ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        int maxIndeks = karakterler.length();

        String isim = "Fatih Kasikci";

        String yeniIsim = "";
        int counter =0;

        for (int i = 0; i < isim.length(); i++) { // bulunacak ismin karakter sayisi kadar olacak

            while (true){

             char harf =   karakterler.charAt((int)(Math.random()*maxIndeks)); // Math den sonra paranteze al unutma

            counter++;

            if (isim.charAt(i)==harf){
                yeniIsim+=harf;
                break;
            }
            }
        }
        System.out.println(yeniIsim);
        System.out.println(counter);


    }
}
