package learn.BryusEkkel.theory.access.cookie2;

import learn.BryusEkkel.theory.access.cookie.Cookie;
import learn.BryusEkkel.theory.access.cookie.CookieOne;
/**
 * Класс, реализующий правила модификаторов доступа в классе.
 * Данный класс является наследником класса Object();
 * Данный класс находится в одном пакете с классами Cookie() и CookieTwo()
 * Данный класс и классы Cookie(), CookieOne() находятся в разных пакетах.
 */
public class NoCookieNoPackage {
    public NoCookieNoPackage() {      // Конструктор класса
        System.out.println("Конструктор NoCookieNoPackage() - не потомок, в разных пакетах с родителем Cookie(), CookieOne() и в одном пакете с наследником CookieTwo()");
    }

    public static void main(String[] args) {
        Cookie cookie = new Cookie();    // Родитель
        cookie.bite1();       // Возможность вызвать из любого места  (public)
//        cookie.bite2();     // Возможность вызвать у потомка        (protected)
//        cookie.bite3();     // Доступ внутри пакета                 (без модификатора)
//        cookie.bite4();     // Доступ внутри класса                 (private)
        System.out.println();

        CookieTwo cookieTwo = new CookieTwo();  // CookieTwo() - не в пакете с родителем Cookie()
        cookieTwo.bite1();    // Возможность вызвать из любого места  (public)
        cookieTwo.bite2();  // Возможность вызвать у потомка        (protected)
//        cookieTwo.bite3();  // Доступ внутри пакета                 (без модификатора)
//        cookieTwo.bite4();  // Доступ внутри класса                 (private)

        CookieOne cookieOne = new CookieOne();  // CookieOne() - в одном пакете с родителем Cookie()
        cookieOne.bite1();    // Возможность вызвать из любого места  (public)
//        cookieOne.bite2();  // Возможность вызвать у потомка        (protected)
//        cookieOne.bite3();  // Доступ внутри пакета                 (без модификатора)
//        cookieOne.bite4();  // Доступ внутри класса                 (private)
    }
}
