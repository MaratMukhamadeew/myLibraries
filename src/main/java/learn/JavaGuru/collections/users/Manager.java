package learn.JavaGuru.collections.users;

import java.util.*;

public class Manager {
    private static Map<String, User> userMap = new HashMap<>();

    boolean addNewUser(User user) {
        if (userMap.containsKey(user.getLogin())) {
            System.out.println("Пользователь с логином " + user.getLogin() + " уже существует");
            return false;
        } else {
            userMap.put(user.getLogin(), user);
            System.out.println(user.getLogin() + " вы успешно зарегистрировались");
            return true;
        }
    }

    boolean login(String login, String password) {
        if (!userMap.containsKey(login)) {
            System.out.println("Пользователя с логином " + login + " не существует");
            return false;
        } else if (userMap.get(login).getPassword().equals(password)) {
            System.out.println(login + " вы успешно вошли");
            return true;
        } else {
            System.out.println("Вы ввели неверный логин или пароль");
            return false;
        }
    }

    boolean deleteUser(String login) {
        if (userMap.containsKey(login)) {
            userMap.remove(login);
            System.out.println("Пользователь с логином " + login + " удален");
            return true;
        } else {
            System.out.println("Пользователя с логином " + login + " не существует");
            return false;
        }
    }

    void getAllUsers() {
        System.out.println(userMap.keySet());
    }

    void getAllUsers(String sortCriterion) {
        switch (sortCriterion) {
            case "login" -> {
                Map<String, User> sortedByLoginMap = new TreeMap<>(userMap);
                for (Map.Entry<String, User> mapEntry : sortedByLoginMap.entrySet()) {
                    System.out.println(mapEntry.getKey() + " : " + mapEntry.getValue());
                }
            }
            case "date" -> {
                UserDateComparator userDateComparator = new UserDateComparator();
                List<User> sortedByDateList = new ArrayList<>(userMap.values());
                sortedByDateList.sort(userDateComparator);
                for (User user : sortedByDateList) {
                    System.out.println(user);
                }
            }
        }
    }

    boolean editUser(User user) {
        if (!userMap.containsKey(user.getLogin())) {
            System.out.println("Пользователя с логином " + user.getLogin() + " не существует");
            return false;
        } else {
            userMap.put(user.getLogin(), user);
            System.out.println("пользователь с логином " + user.getLogin() + " успешно изменен");
            return true;
        }
    }
}
