package learn.programming_methods.enums;

public class TaxaRunner {
    public static void main(String[] args) {
        TaxiStation taxiStation = TaxiStation.valueOf(TaxiStation.class, "Volvo".toUpperCase());
        System.out.println(taxiStation + " : ordinal -> " + taxiStation.ordinal());
        taxiStation.setFreeCabs(3);
        TaxiStation[] stations = TaxiStation.values();
        for (TaxiStation elem : stations) {
            System.out.println(elem);
        }
    }
}
