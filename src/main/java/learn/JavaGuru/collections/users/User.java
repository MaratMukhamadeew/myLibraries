package learn.JavaGuru.collections.users;

import java.time.LocalDate;
import java.util.Objects;

public class User {
    private String login;
    private String password;
    private LocalDate localDate;

    public User(String login, String password, LocalDate localDate) {
        this.login = login;
        this.password = password;
        this.localDate = localDate;
    }

    public User(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(localDate, user.localDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, localDate);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", localDate=" + localDate +
                '}';
    }
}
