package learn.JavaGuru.javaio;

import java.io.*;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("Test");
        User user2 = null;

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d://user.dat"))) {
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d://user.dat"))) {
            user2 = (User) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(user.equals(user2));
    }
}
