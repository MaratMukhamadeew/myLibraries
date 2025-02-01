package practice.javaRush.tasks.tasks15__.task1525;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try(BufferedReader bf = new BufferedReader(new FileReader(Statics.FILE_NAME))) {
            String temp = "";
            while ((temp = bf.readLine()) != null) {
                lines.add(temp);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
