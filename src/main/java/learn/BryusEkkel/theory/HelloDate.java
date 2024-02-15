package learn.BryusEkkel.theory;

import java.util.Date;

/** Первая программа-пример книги.
 * Выводит строку и текущее число.
 * @autor Брюс Эккель
 * @autor www.MindView.net
 * @version 4.0
 */
public class HelloDate {
    /** Точка входа в класс и приложение
     * @param args Массив строковых аргументов
     * @throws exceptions исключения не выдаются
     */
    public static void main(String[] args) {
        System.out.println("Привет, сегодня: ");
        System.out.println(new Date());
    }
}
