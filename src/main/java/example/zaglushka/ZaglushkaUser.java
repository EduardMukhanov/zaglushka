package example.zaglushka;

import java.time.LocalDate;

public class ZaglushkaUser {
    String login;
    String password;
    LocalDate date;

    public ZaglushkaUser(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
