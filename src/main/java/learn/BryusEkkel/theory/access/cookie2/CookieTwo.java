package learn.BryusEkkel.theory.access.cookie2;

import learn.BryusEkkel.theory.access.cookie.Cookie;
import learn.BryusEkkel.theory.access.cookie.CookieOne;
/**
 * Класс, реализующий правила модификаторов доступа в классе.
 * Данный класс является наследником класса Cookie(), находящемся в другом пакете;
 */
public class CookieTwo extends Cookie {
    public CookieTwo() {
        System.out.println("Конструктор CookieTwo() - не в пакете с родителем new Cookie()");
    }

    public static void main(String[] args) {
        Cookie cookie = new Cookie();    // Родитель
        cookie.bite1();       // Возможность вызвать из любого места  (public)
//        cookie.bite2();     // Возможность вызвать у потомка        (protected)
//        cookie.bite3();     // Доступ внутри пакета                 (без модификатора)
//        cookie.bite4();     // Доступ внутри класса                 (private)
        System.out.println();

        CookieTwo cookieTwo = new CookieTwo();  // CookieOne() - в одном пакете с родителем Cookie()
        cookieTwo.bite1();    // Возможность вызвать из любого места  (public)
        cookieTwo.bite2();    // Возможность вызвать у потомка        (protected)
//        cookieTwo.bite3();  // Доступ внутри пакета                 (без модификатора)
//        cookieTwo.bite4();  // Доступ внутри класса                 (private)
        System.out.println();

        CookieOne cookieOne = new CookieOne();  // CookieTwo() - не в пакете с родителем Cookie()
        cookieOne.bite1();    // Возможность вызвать из любого места  (public)
//        cookieOne.bite2();  // Возможность вызвать у потомка        (protected)
//        cookieOne.bite3();  // Доступ внутри пакета                 (без модификатора)
//        cookieOne.bite4();  // Доступ внутри класса                 (private)
    }

    @Override
    public void bite1() { // Возможность вызвать из любого места
        System.out.println("bite1() - класса CookieTwo() - public");
    }
    @Override
    protected void bite2() {  // Возможность вызвать у потомка
        System.out.println("bite2() - класса CookieTwo() - protected\n");
    }
//    @Override
//    void bite3() { // Доступ внутри пакета
//        System.out.println("bite3() - класса CookieTwo() - (без модификатора)");
//    }
//    @Override
//    private void bite4() { // Доступ внутри класса
//        System.out.println("bite4() - класса CookieTwo() - private");
//    }
}
