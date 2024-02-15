package learn.BryusEkkel.theory.initialization;
// Использование finalize() для выявления объекта,
// не осуществившего необходимой финализации

class Book {
    boolean checkedOut = false;
    Book(boolean checked) {
        checkedOut = checked;
    }
    void checkIn() {
        checkedOut = false;
    }
    @Override
    public void finalize() {
        if (checkedOut)
            System.out.println("Ошибка: checkedOut");
        // Обычно это делается так:
        // super.finalize();  Вывов версии базового класса
    }
}
public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        // Правльная очистка:
        novel.checkIn();
        // Теряем ссылку, забыли про очистку:
        new Book(true);
        // Принудительная очистка и финализация:
        System.gc();
    }
}
