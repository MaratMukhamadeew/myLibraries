package learn.swing.glava3;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class UsingSwingWorker extends JFrame {
    private JButton button;
    public UsingSwingWorker() {
        super("Using swing worker");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        button = new JButton("Выполнить сложную работу");
        button.addActionListener(e -> {
            // Запустим отдельную долгую работу
            new ComplexJob().execute();
            button.setText("Подождите...");
        });
        setLayout(new FlowLayout());
        add(new JTextField(20));
        add(button);
        setSize(300,200);
        setVisible(true);
    }

    // Класс, выполняющий сложную работу
    class ComplexJob extends SwingWorker<String, String> {
        // Здесь выполняется работа, это отдельный поток!
        @Override
        protected String doInBackground() throws Exception {
            Thread.sleep(3000);
            publish("Половина работы закончена...");
            Thread.sleep(3000);
            return "";
        }
        // Обработка промежуточных результатов, это поток рассылки событий!
        @Override
        protected void process(List<String> chunks) {
            button.setText(chunks.get(0));
        }
        // Окончание работы - и вновь это поток рассылки
        @Override
        public void done() {
            button.setText("Работа завершена");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(UsingSwingWorker::new);
    }
}
