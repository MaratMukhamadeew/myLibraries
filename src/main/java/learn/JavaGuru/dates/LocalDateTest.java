package learn.JavaGuru.dates;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate specificDate = LocalDate.of(2015, Month.JANUARY,22);
        System.out.println(specificDate);

        LocalDate epochDate = LocalDate.ofEpochDay(0);
        System.out.println(epochDate);

        LocalDate day2502017 = LocalDate.ofYearDay(2017,250);
        System.out.println(day2502017);
    }
}
