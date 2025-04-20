package practice.excel.devmark;

import java.time.LocalDate;

public record ClientInfo(String name, LocalDate birthDate) {

    @Override
    public String toString() {
        return "ClientInfo [name = " + name + ", birthDate = " + birthDate + "]";
    }
}
