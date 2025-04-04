package learn.swing.glava3;

import javax.swing.*;
import java.awt.*;

// Проверка момента, запуска потока рассылки событий
public class StartingEventThread {
    public static void main(String[] args) {
        // Заменяем системную очередь событий своей
        Toolkit.getDefaultToolkit().getSystemEventQueue().push(new CustomQueue());

        // Создаем окно
        JFrame frame = new JFrame("Тест");
        System.out.println("(1) JFrame()");

        // Добавляем флажок
        JCheckBox checkBox = new JCheckBox("Тест");
        frame.add(checkBox, "South");
        System.out.println("(2) Добавлен флажок");

        // Создаем список
        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> list = new JList<>(model);
        frame.add(list);
        System.out.println("(3) Добавлен список");

        // Обновляем модель
        model.addElement("Тест");
        System.out.println("(4) Обновление модели");

        // Окончательно выводим интерфейс на экран
        frame.setVisible(true);
        System.out.println("(5) Интерфейс построен");
    }
    // Специальная очередь событий, сообщающая отладочную информацию о событиях и потоках
    static class CustomQueue extends EventQueue {
        // Метод кладёт событие в очередь
        @Override
        public void postEvent(AWTEvent event) {
            System.out.println("post(), поток: " + Thread.currentThread());
            System.out.println("post(), событие: " + event);
            super.postEvent(event);
        }

        // Метод распределяет событие по компонентам
        @Override
        protected void dispatchEvent(AWTEvent event) {
            System.out.println("dispatch(), поток: " + Thread.currentThread());
            System.out.println("dispatch(), событие: " + event);
            super.dispatchEvent(event);
        }
    }
}
