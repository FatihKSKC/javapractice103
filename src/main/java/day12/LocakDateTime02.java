package day12;

import java.time.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocakDateTime02 {
    public static void main(String[] args) {


        /*
        tom 29 ekim 1923 45 yıl 8 ay 5 gun sonra dogdu.
        veli 15 eylul 1993 ten 24 yıl 2 ay 11 gun once dogdu.
        dogum tarhileri yazdır
        tarihleri aynı mı



         */

        LocalDate dobTom = LocalDate.of(1923, Month.OCTOBER,29).plusYears(45).plusMonths(8).plusDays(5);
        LocalDate dobVeli = LocalDate.of(1993,Month.SEPTEMBER,15).minusYears(24).minusMonths(2).minusDays(11);

        System.out.println("dobTom = " + dobTom);
        System.out.println("dobVeli = " + dobVeli);

        boolean ayniMi = dobVeli.equals(dobTom);
        System.out.println("ayniMi = " + ayniMi);



        // japonay ile almaynya arasındak saat farkını yazdırın


        LocalDateTime almanya = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        LocalDateTime japan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));

        long farkSaat = ChronoUnit.HOURS.between(almanya,japan);
        System.out.println("farkSaat = " + farkSaat);

        // tarih 22,10,31 ve saat 03,26 oldugundan aşagıdaki kod ne yazdırır.

        LocalTime time = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(dtf.format(time.plusHours(2)));


        // gun ay yıl olarak yazdırma

        LocalDate date = LocalDate.now();
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMMM/yy");
        System.out.println(dtf2.format(date));

        // mevcut saat diliminden ileri geri gitme:
        // mevcut saat diliminizden 2 saat ileri yazdırın.

        LocalTime time2 = LocalTime.now();
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(dtf3.format(time2.plusHours(2)));




    }
}
