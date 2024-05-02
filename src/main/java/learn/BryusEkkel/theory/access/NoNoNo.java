package learn.BryusEkkel.theory.access;

import learn.BryusEkkel.theory.access.cookie.Cookie;
import learn.BryusEkkel.theory.access.cookie.CookieOne;
import learn.BryusEkkel.theory.access.cookie2.CookieTwo;
/**
 * Класс, реализующий правила модификаторов доступа в классе.
 * Данный класс является наследником класса Object();
 * Данный класс и классы Cookie(),CookieOne(), CookieTwo() находятся в разных пакетах.
 */
public class NoNoNo {
    public NoNoNo() {      // Конструктор класса
        System.out.println("\nКонструктор NoNoNo() - не потомок, в разных пакетах с родителем Cookie(), CookieOne(), CookieTwo()");
    }

    public static void main(String[] args) {
        Cookie cookie = new Cookie();    // Родитель
        cookie.bite1();       // Возможность вызвать из любого места  (public)
//        cookie.bite2();     // Возможность вызвать у потомка        (protected)
//        cookie.bite3();     // Доступ внутри пакета                 (без модификатора)
//        cookie.bite4();     // Доступ внутри класса                 (private)
        System.out.println();

        CookieOne cookieOne = new CookieOne();  // CookieOne() - в одном пакете с родителем Cookie()
        cookieOne.bite1();    // Возможность вызвать из любого места  (public)
//        cookieOne.bite2();  // Возможность вызвать у потомка        (protected)
//        cookieOne.bite3();  // Доступ внутри пакета                 (без модификатора)
//        cookieOne.bite4();  // Доступ внутри класса                 (private)
        System.out.println();

        CookieTwo cookieTwo = new CookieTwo();  // CookieTwo() - не в пакете с родителем Cookie()
        cookieTwo.bite1();    // Возможность вызвать из любого места  (public)
//        cookieTwo.bite2();  // Возможность вызвать у потомка        (protected)
//        cookieTwo.bite3();  // Доступ внутри пакета                 (без модификатора)
//        cookieTwo.bite4();  // Доступ внутри класса                 (private)
    }
}
