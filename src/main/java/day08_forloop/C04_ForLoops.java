package day08_forloop;

public class C04_ForLoops {
    public static void main(String[] args) {

        String cumle = "istanbul";

        int index = 0;

        System.out.println(" \t karakter \t index");

        for (int i = 0; i < cumle.length(); i++) {


            System.out.println();


            System.out.println("\t\t"+cumle.charAt(i) + "\t\t" + index);
            index++;

        }


    }


}

