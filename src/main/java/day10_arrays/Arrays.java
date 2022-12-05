package day10_arrays;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static boolean to;

    public static void main(String[] args) {

        // size verilen bir arrayda 8 ve 8 den onceki tum elemanları 2 katına çıkarınız.

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);


        for (int i = 0; i < numbers.size(); i++) {


            if (numbers.get(i) == 8) {
                numbers.set(i, numbers.get(i) * 2);
                break;

            }

        }
        System.out.println(numbers);



    }
}
