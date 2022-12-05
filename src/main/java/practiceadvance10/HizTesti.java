package practiceadvance10;

import java.time.LocalTime;

public class HizTesti {
    public static void main(String[] args) {
        //İki java işlemi arasındaki çalışma zamanı farkını gösteren bir kod yazınız.

        int nano1 = LocalTime.now().getNano();

        int x =0;
        while (x<200){
            int a = 1234*1234;

            x++;

        }


        int nano2 = LocalTime.now().getNano();



        int fark1 = (Math.abs(nano2-nano1));



        int nano3 = LocalTime.now().getNano();

        int y =0;

        while (y<200000000){
            int b =1234*1234;
            y++;
        }

        int nano4 =  LocalTime.now().getNano();

        int fark2 = (Math.abs(nano4-nano3));


        if (fark1>fark2){
            System.out.println("birinci islem daha cok zaman aldi");
        }else System.out.println("ikinci islem daha cok zaman aldi");


    }
}
