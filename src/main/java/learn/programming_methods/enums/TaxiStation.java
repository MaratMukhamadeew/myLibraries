package learn.programming_methods.enums;

public enum TaxiStation {
    MERCEDES(10), TOYOTA(7), VOLVO;
    private int freeCabs; // Поле класса перечисления
    TaxiStation() {} // Конструктор класса перечисления
    TaxiStation(int cabs) { // Конструктор класса перечисления
        freeCabs = cabs;
    }
    public int getFreeCabs() {
        return freeCabs;
    }
    public void setFreeCabs(int freeCabs) {
        this.freeCabs = freeCabs;
    }

    @Override
    public String toString() {
        return String.format("%s : free cabs = %d", name(), freeCabs);
    }
}
