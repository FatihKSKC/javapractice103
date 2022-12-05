package day05_IfStatement;

import java.util.Scanner;

public class C07_IfStatement {

    public static void main(String[] args) {

        //Kullanicidan dikdortgenin kenar uzunluklarini isteyin
//ve dortgenin kare olup  olmadigini yazdirin

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen  dortgenin kenar uzunluklarını 4 tamsayı olacak şekilde giriniz ");
        int s1 = input.nextInt();
        int s2 = input.nextInt();
        int s3 = input.nextInt();
        int s4 = input.nextInt();

        String sonuc = s1==s2 && s2==s3 && s3==s4 ? ("karedir"):("kare degildir");
        System.out.println(sonuc);






    }






}
