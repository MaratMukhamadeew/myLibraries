package learn.programming_methods.glava2.packing;

import java.io.*;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class UnPackJar {
    private File destFile;
    public final int BUFFER = 2_048;
    public void unpack(String destinationDirectory, String nameJar) {
        File sourceJarFile = new File(nameJar);
        try(JarFile jFile = new JarFile(sourceJarFile)) {
            File unzipDir = new File(destinationDirectory);
            // Открытие jar-архива для распаковки
            Enumeration<JarEntry> jarFileEntries = jFile.entries();;
            while (jarFileEntries.hasMoreElements()) {
                // Извлечение текущей записи из архива
                JarEntry entry = jarFileEntries.nextElement();
                String entryName = entry.getName();
                System.out.println("Extracting: " + entry);
                destFile = new File(unzipDir, entryName);
                // Определение каталога
                File destinationParent = destFile.getParentFile();
                // Создание структуры каталогов
                destinationParent.mkdirs();
                // Распаковывание записи, если она не каталог
                if (!entry.isDirectory()) {
                    writeFile(jFile, entry);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void writeFile(JarFile jFile, JarEntry entry) {
        int currentByte;
        byte[] data = new byte[BUFFER];
        try(BufferedInputStream bis = new BufferedInputStream(jFile.getInputStream(entry));
            FileOutputStream fos = new FileOutputStream(destFile);
            BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER)) {
                // Запись на диск
            while ((currentByte = bis.read(data, 0, BUFFER)) > 0) {
                bos.write(data, 0, currentByte);
            }
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
