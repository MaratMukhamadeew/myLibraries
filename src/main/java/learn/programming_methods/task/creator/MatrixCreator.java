package learn.programming_methods.task.creator;

import learn.programming_methods.task.entity.Matrix;
import learn.programming_methods.task.exceptions.MatrixException;

public class MatrixCreator {
    public static void fillRandomizer(Matrix t, int start, int end) {
        int v = t.getVerticalSize();
        int h = t.getHorizontalSize();
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < h; j++) {
                try {
                    int value = (int) ((Math.random() * (end - start) + start));
                    t.setElement(i, j, value);
                } catch (MatrixException ex) {
                    // В данном случае exception невозможен
                }
            }
        }
    }

//    public void fillFromFile(Matrix t, File f) { /* Код */ }
//    public void fillFromStream(Matrix t, InputStream inputS) { /* Код */ }
//    public void fillFromDataBase(Matrix t, Connection con) { /* Код */ }
}
