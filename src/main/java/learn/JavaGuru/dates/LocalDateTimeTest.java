package learn.JavaGuru.dates;

import java.time.*;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Получаем текущую дату и время : " + today);

        today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("DateTime : " + today);

        LocalDateTime randomDate = LocalDateTime.of(2017, Month.MAY, 9, 11, 33,50);
        System.out.println("LocalDateTime с указанной датой : " + randomDate);

        LocalDateTime dateFromBase = LocalDateTime.ofEpochSecond(2000, 0, ZoneOffset.UTC);
        System.out.println("Через 2000 секунд после 01.01.1970 : " + dateFromBase);

        ZoneId zone1 = ZoneId.of("Asia/Kolkata");
        ZoneId zone2 = ZoneId.of("Asia/Tokyo");
        System.out.println(zone1);
        System.out.println(zone2);

        LocalTime time1 = LocalTime.now(zone1);
        System.out.println("India time zone : " + time1);
        LocalTime time2 = LocalTime.now(zone2);
        System.out.println("Japan time zone : " + time2);

    }
}
