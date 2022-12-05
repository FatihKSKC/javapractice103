package practiceadvance03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MountainArray {
    public static void main(String[] args) {

        /*
Bir Array'in Mountain Array olup olmadığını kontrol eden bir kod yazınız.
Mountain Array: Element değerleri bir noktaya kadar sürekli artıp o noktadan sonra sürekli azalan Array.
 */

        int arr[] = {-999, 1, 2, 5, 7, 9, 22, 8, 3, 1, -100};

        List<Integer>list = new ArrayList<>();
        for (int w: arr){
            list.add(w);
        }

        int max = arr[0];

        for (int w : arr) {

            if (w > max) {
                max = w;
            }
        }
        System.out.println(max);

        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < max; i++) {
            if (arr[i] == max) {
                break;
            }
            list1.add(arr[i]);

        }
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (i<list.indexOf(max)) {
                continue;
            }
            list2.add(arr[i]);
        }
        System.out.println(list2);


        List<Integer>list1copy = new ArrayList<>(list1);
        Collections.sort(list1copy);


        List<Integer>list2copy = new ArrayList<>(list2);
        Collections.sort(list2copy);
        Collections.reverse(list2copy);

        if (list1.equals(list1copy)&&list2.equals(list2copy)){
            System.out.println("mountain array");
        }else System.out.println("mountain array degil");

    }
}
