package learn.programming_methods.glava1.inner;

public class Ship {
    // Поля и конструкторы
    private Engine eng;
    // abstract, final, private, protected - допустимы
    public class Engine { // Определение внутреннего (inner) класса
        // Поля и методы
        public void launch() {
            System.out.println("Запуск двигателя");
        }
    } // Конец объявления внутреннего класса
    public final void init() { // Метод внешнего класса
        eng = new Engine();
        eng.launch();
    }
}
