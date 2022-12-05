package practiceadvance10;

public class ConvertThreeDijitNumberToWords {
    public static void main(String[] args) {

        // uc haneli bir sayiyi ingilizce okunusuna ceviren bir kod yaziniz.

        int number = 123;

        int hundreds = number / 100; // elimizde yuzler basamagindaki  rakam kaldi
        int tens = (number / 10) % 10; // elimizde onlar basamagi kaldi
        int ones = number % 10; // birler basamagi kaldi elimizde.
    }
}

