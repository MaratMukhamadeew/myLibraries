package learn.BryusEkkel.theory.access.cookie;

import learn.BryusEkkel.theory.access.cookie2.CookieTwo;

/**
 * Класс реализующий 4 модификатора доступа:
 *  - public (Возможность вызвать из любого места);
 *  - protected (Возможность вызвать у потомка);
 *  - (без модификатора) Доступ внутри пакета;
 *  - private (Доступ внутри класса)
 */
public class Cookie {
    public Cookie() {
        System.out.println("             Конструктор Cookie()\n" +
                "Имеет потомков CookieOne() и new CookieTwo()");
    }

    public static void main(String[] args) {
        Cookie cookie = new Cookie();    // Родитель
        cookie.bite1();       // Возможность вызвать из любого места  (public)
        cookie.bite2();       // Возможность вызвать у потомка        (protected)
        cookie.bite3();       // Доступ внутри пакета                 (без модификатора)
        cookie.bite4();       // Доступ внутри класса                 (private)

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

    public void bite1() { // Возможность вызвать из любого места
        System.out.println("bite1() - класса Cookie() - public");
    }
    protected void bite2() {  // Возможность вызвать у потомка
        System.out.println("bite2() - класса Cookie() - protected");
    }
    void bite3() { // Доступ внутри пакета
        System.out.println("bite3() - класса Cookie() - (без модификатора)");
    }
    private void bite4() { // Доступ внутри класса
        System.out.println("bite4() - класса Cookie() - private\n");
    }
}
