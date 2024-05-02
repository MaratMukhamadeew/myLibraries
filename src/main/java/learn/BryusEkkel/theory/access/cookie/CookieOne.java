package learn.BryusEkkel.theory.access.cookie;

import learn.BryusEkkel.theory.access.cookie2.CookieTwo;
/**
 * Класс, реализующий правила модификаторов доступа в классе.
 * Данный класс является наследником класса Cookie(), находящемся в одном с ним пакете;
 */
public class CookieOne extends Cookie{
    public CookieOne() {      // Конструктор класса
        System.out.println("Конструктор CookieOne() - в одном пакете с родителем new Cookie()");
    }
    public static void main(String[] args) {
        Cookie cookie = new Cookie();    // Родитель
        cookie.bite1();       // Возможность вызвать из любого места  (public)
        cookie.bite2();       // Возможность вызвать у потомка        (protected)
        cookie.bite3();       // Доступ внутри пакета                 (без модификатора)
//        cookie.bite4();     // Доступ внутри класса                 (private)
        System.out.println();

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

    @Override
    public void bite1() { // Возможность вызвать из любого места
        System.out.println("bite1() - класса CookieOne() - public");
    }
    @Override
    protected void bite2() {  // Возможность вызвать у потомка
        System.out.println("bite2() - класса CookieOne() - protected");
    }
    @Override
    void bite3() { // Доступ внутри пакета
        System.out.println("bite3() - класса CookieOne() - (без модификатора)\n");
    }
//    @Override
//    private void bite4() { // Доступ внутри класса
//        System.out.println("bite4() - класса Cookie() - private");
//    }
}

