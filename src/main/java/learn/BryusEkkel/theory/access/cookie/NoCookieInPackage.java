package learn.BryusEkkel.theory.access.cookie;

import learn.BryusEkkel.theory.access.cookie2.CookieTwo;
/**
 * Класс, реализующий правила модификаторов доступа в классе.
 * Данный класс является наследником класса Object();
 * Данный класс находится в одном пакете с классами Cookie() и CookieOne()
 * Данный класс и класс CookieTwo() находятся в разных пакетах.
 */
public class NoCookieInPackage {
    public NoCookieInPackage() {      // Конструктор класса
        System.out.println("\nКонструктор NoCookieInPackage() - не потомок в одном пакете с родителем Cookie() и с наследником CookieOne()");
    }

    public static void main(String[] args) {
        Cookie cookie = new Cookie();    // Родитель
        cookie.bite1();       // Возможность вызвать из любого места  (public)
        cookie.bite2();       // Возможность вызвать у потомка        (protected)
        cookie.bite3();       // Доступ внутри пакета                 (без модификатора)
        System.out.println();
//        cookie.bite4();     // Доступ внутри класса                 (private)

        CookieOne cookieOne = new CookieOne();  // CookieOne() - в одном пакете с родителем Cookie()
        cookieOne.bite1();    // Возможность вызвать из любого места  (public)
        cookieOne.bite2();    // Возможность вызвать у потомка        (protected)
        cookieOne.bite3();    // Доступ внутри пакета                 (без модификатора)
//        cookieOne.bite4();  // Доступ внутри класса                 (private)

        CookieTwo cookieTwo = new CookieTwo();  // CookieTwo() - не в пакете с родителем Cookie()
        cookieTwo.bite1();    // Возможность вызвать из любого места  (public)
//        cookieTwo.bite2();  // Возможность вызвать у потомка        (protected)
//        cookieTwo.bite3();  // Доступ внутри пакета                 (без модификатора)
//        cookieTwo.bite4();  // Доступ внутри класса                 (private)
    }
}
