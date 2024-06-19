package learn.JavaGuru.dates;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTest {
    public static void main(String[] args) {
        LocalDateTime date1 = LocalDateTime.of(1989,11,7,0,0,0);
        LocalDateTime date2 = LocalDateTime.of(2010,6,15,0,0,0);

        System.out.println(date1.format(DateTimeFormatter.ofPattern("dd-MMMM-uuuu")));
        System.out.println(date2.format(DateTimeFormatter.ofPattern("dd-MMMM-uuuu")));

        System.out.println(date2.minusYears(date1.getYear()).getYear());

        // Вывести количество дней между датами
        System.out.println(Duration.between(date1,date2).toDays());
    }
}
