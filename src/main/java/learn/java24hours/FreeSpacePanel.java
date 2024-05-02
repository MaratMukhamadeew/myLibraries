package learn.java24hours;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FreeSpacePanel extends JPanel {
    JLabel spaceLabel = new JLabel("Объем диска: ");
    JLabel space = new JLabel();

    public FreeSpacePanel() {
        super();
        add(spaceLabel);
        add(space);
        try {
            setValue();
        } catch (IOException e) {
            space.setText("Ошибка");
        }
    }

    private final void setValue() throws IOException {
        // Получение сведений о хранилище текущего файла
        Path current = Paths.get("");
        FileStore store = Files.getFileStore(current);

        // Определение свободного места в хранилище
        long totalSpace = store.getTotalSpace();
        long freeSpace = store.getUsableSpace();

        // Вычисление объема % (с двумя знаками после запятой)
        double percent = (double) freeSpace / totalSpace * 100;
        percent = (int) (percent * 100) / (double) 100;

        // Настройка текста метки
        space.setText(freeSpace + " свободно из " + totalSpace + " (" + percent + "%)");
    }

    public static void main(String[] args) {
        FreeSpacePanel panel = new FreeSpacePanel();
    }
}
