package JavaGuru.javaio;

import java.io.*;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("Test");
        User user2 = null;

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:/user.dat"))) {
            oos.writeObject(user);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:/user.dat"))) {
            user2 = (User) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }

        System.out.println(user.equals(user2));
    }
}
