package practiceadvance04;

public class ArraysOrtalamadanBuyuk {
    public static void main(String[] args) {
//Elemetlerin ortalamasından büyük elementleri yazdıran bir kod yazınız.

        int arr[] = {5, 9, 33, 81, 15, 25, 3, 68,23,11};

        int toplam = 0;

        for (int w : arr) {

            toplam = toplam + w;
        }

        double ort = toplam / arr.length;

        System.out.println(ort);
        for (int w : arr) {

            if (w > ort) {
                System.out.print(w + " ,");
            }
        }


    }
}
