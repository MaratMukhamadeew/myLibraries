package Tsymbaliuk.Enum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(Direction.UP.changeCoordinate());

        UserRole[] roles = UserRole.values();
        for (UserRole ur : roles)
            System.out.println(ur);

        System.out.println(UserRole.EDITOR.getFilePermission());

        Scanner sc = new Scanner(System.in);
        System.out.println("Input you role");

        UserRole user = UserRole.valueOf(sc.nextLine());
        switch (user) {
            case ADMINISTRATOR -> System.out.println("You can do everything");
            case EDITOR -> System.out.println("You can edit records");
            case READER -> System.out.println("You can read the records");
        }
    }
}
