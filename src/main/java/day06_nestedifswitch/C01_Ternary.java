package day06_nestedifswitch;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        /*
TASK :
 Kullanıcıdan sifirdan buyuk pozitif bir tamsayı girmesini isteyin.
 Girilen pozitif tamsayı 3 basamaklı ise ekrana "3 Basamaklı" yazdırın.
 3 basamaklı degilse çift olup olmadigini kontrol edin.
 Çift ise "3 basamaklı olmayan çift sayı" yazdırın.
 Çift sayı degilse "3 basamaklı olmayan tek sayı yazdırın."
 */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir pozitfi tam sayı girniz");
        int sayi = input.nextInt();

        boolean ucBasamakMı = sayi > 99 && sayi < 1000;
        boolean ciftMi = sayi % 2 == 0;


        String snc = sayi > 0 ? (ucBasamakMı ? ("uc basamaklı") : (ciftMi ? ("ucbasamaklı olmayan çiftsayı") : ("uc basamaklı olamyan tek sayı"))) :
                ("lutfen pozitfi sayı giriniz");

        System.out.println(snc);

if (sayi>0){
    if (sayi<100&&sayi>99){
        System.out.println("uc basamaklı pozitif sayı");
    } else if (sayi%2==0) {
        System.out.println("uc basamaklı olmayan cift sayı");

    }else {
        System.out.println("uc basamaklı olmayan tek sayı");
    }


}else {
    System.out.println("lutfen pozitif bir sayı giriniz");
}



    }


}
