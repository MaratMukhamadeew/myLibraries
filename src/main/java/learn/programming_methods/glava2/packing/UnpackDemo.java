package learn.programming_methods.glava2.packing;

public class UnpackDemo {
    public static void main(String[] args) {
        // Расположение и имя архива
        String nameJar = "example.jar";
        // Куда будут распакованы файлы
        String destinationPack = "C:\\Users\\marat\\temp\\";
        new UnPackJar().unpack(destinationPack, nameJar);
    }
}
