package practiceadvance06;

public class Array_Simetrik {
    public static void main(String[] args) {
        // bir arrayın simetrik olup olmadıgını kontrol eden br method yazınız.

        int arr[] = {1, 2, 3, 3, 5, 2, 1};
        System.out.println(simetrik(arr));

    }


    public static boolean simetrik(int[] arr) {
        boolean sonuc = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {

                sonuc = false;
                break;

            }

        }
        return sonuc;
    }
}







