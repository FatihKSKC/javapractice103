package practiceadvance;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Variable_Fahrennehi_ToCelsius {

    public static void main(String[] args) {

        // formul : c=(f-32)*5/9


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen fahranayt degerigiriniz");

        double fahranayt= input.nextDouble();

        double celsius= (fahranayt-32)*5/9;

        System.out.println(celsius);

        NumberFormat numberFormat = new DecimalFormat(".00"); // virgulen sonra iki deger olsun

         String formatcelcius= numberFormat.format(celsius); // stringi numaraya çevirdi


        System.out.println(formatcelcius); // iki tane yazdırdı.









    }

}
