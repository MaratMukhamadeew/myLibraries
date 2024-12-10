package learn.programming_methods.glava1.inner;

public class Abonent {
    private long id;
    private String name;
    private String tariffPlan;
    private PhoneNumber phoneNumber; // Ссылка на внутренний класс
    public Abonent(long id, String name) {
        this.id = id;
        this.name = name;
    }
    // Объявление внутреннего класса
    private class PhoneNumber {
        private int countryCode;
        private int netCode;
        private int number;
        public void setCountryCode(int countryCode) {
            // Проверка на допустимые значения кода страны
            this.countryCode = countryCode;
        }
        public void setNetCode(int netCode) {
            // Проверка на допустимые значения кода сети
            this.netCode = netCode;
        }
        public int generateNumber() {
            // Проверка значения temp на совпадение в БД
            number = new java.util.Random().nextInt(10_000_000);
            return number;
        }
    } // Окончание внутреннего класса
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getTariffPlan() {
        return tariffPlan;
    }
    public void setTariffPlan(String tariffPlan) {
        this.tariffPlan = tariffPlan;
    }
    public String getPhoneNumber() {
        if (phoneNumber != null) {
            return ("+" + phoneNumber.countryCode + "-" + phoneNumber.netCode + "-" + phoneNumber.number);
        } else {
            return ("phone number is empty!");
        }
    }
    // Соответствует шаблону Фасад (Facade)
    public void obtainPhoneNumber(int countryCode, int netCode) {
        phoneNumber = new PhoneNumber();
        phoneNumber.setCountryCode(countryCode);
        phoneNumber.setNetCode(netCode);
        phoneNumber.generateNumber();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("Abonent '")
                .append(name)
                .append("':\n")
                .append("   ID - ")
                .append(id).append("\n")
                .append("   Tariff Plan - ")
                .append(tariffPlan).append("\n")
                .append("   Phone Number - ")
                .append(getPhoneNumber())
                .append("\n");
        return sb.toString();
    }
}
