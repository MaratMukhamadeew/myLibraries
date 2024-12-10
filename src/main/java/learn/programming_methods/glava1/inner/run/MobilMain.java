package learn.programming_methods.glava1.inner.run;

import learn.programming_methods.glava1.inner.Abonent;

public class MobilMain {
    public static void main(String[] args) {
        Abonent abonent = new Abonent(819002, "Timofey Balashov");
        abonent.setTariffPlan("free");
        abonent.obtainPhoneNumber(375, 25);
        System.out.println(abonent);
    }
}
