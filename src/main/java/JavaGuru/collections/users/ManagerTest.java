package JavaGuru.collections.users;

import java.time.LocalDate;

public class ManagerTest {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.addNewUser(new User("Миша", "12345", LocalDate.of(2020,10,20)));
        manager.addNewUser(new User("Юля", "55555", LocalDate.of(2023,2,25)));
        manager.addNewUser(new User("Ваня", "98765", LocalDate.now()));
        manager.addNewUser(new User("Петя", "Пароль", LocalDate.of(2022,3,12)));
        manager.addNewUser(new User("Илья", "Число", LocalDate.of(2021,5,15)));
        System.out.println();
        manager.login("Ваня", "98765");
        manager.deleteUser("Миша");
        manager.getAllUsers("date");
        manager.editUser(new User("Петя", "11111", LocalDate.now()));
        manager.getAllUsers("date");
    }
}
