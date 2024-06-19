package learn.JavaGuru.dates;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Parsing {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        // Стандартный формат даты
        System.out.println("Стандартный формат даты для LocalDate : " + date);

        // Применяем свой формат даты
        System.out.println(date.format(DateTimeFormatter.ofPattern("d::MM::uuuu")));
        System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));

        LocalDateTime dateTime = LocalDateTime.now();
        // Стандартный формат даты
        System.out.println("Стандартный формат даты для LocalDateTime : " + dateTime);
        // Применяем свой формат даты
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
        System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));

        Instant timestamp = Instant.now();
        // Стандартный формат даты
        System.out.println("Стандартный формат даты для Instant : " + timestamp);
    }
}
