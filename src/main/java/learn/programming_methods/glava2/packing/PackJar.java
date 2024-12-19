package learn.programming_methods.glava2.packing;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.zip.Deflater;

public class PackJar {
    private String jarFileName;
    public final int BUFFER = 2_048;
    public PackJar(String jarFileName) {
        this.jarFileName = jarFileName;
    }
    public void pack(String dirName) throws FileNotFoundException {
        // Получение списка имен файлов в директории
        var dir = new File(dirName);
        if (!dir.exists() || !dir.isDirectory()) {
            throw new FileNotFoundException(dir + " not found");
        }
        File[] files = dir.listFiles();
        ArrayList<String> listFilesToJar = new ArrayList<>();
        for (int i = 0; i < Objects.requireNonNull(files).length; i++) {
            if (!files[i].isDirectory()) {
                listFilesToJar.add(files[i].getPath());
            }
        }
        String[] tmp = {};
        String[] filesToJar = listFilesToJar.toArray(tmp);
        // Собственно архивирование
        try(FileOutputStream fos = new FileOutputStream(jarFileName);
            JarOutputStream jos = new JarOutputStream(fos)) {
            byte[] buffer = new byte[BUFFER];
            // Метод сжатия
            jos.setLevel(Deflater.DEFAULT_COMPRESSION);
            for (String s : filesToJar) {
                jos.putNextEntry(new JarEntry(s));
                try (FileInputStream fis = new FileInputStream(s)) {
                    int len;
                    while ((len = fis.read()) > 0) {
                        jos.write(buffer, 0, len);
                    }
                    jos.closeEntry();
                } catch (FileNotFoundException e) {
                    System.err.println("Файл не найден " + e);
                }
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Некорректный аргумент " + e);
        } catch (IOException e) {
            System.err.println("Ошибка доступа " + e);
        }
    }
}
