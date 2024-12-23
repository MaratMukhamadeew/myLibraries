package learn.programming_methods.glava2.set;

import java.util.EnumSet;

public class UseEnumSet {
    public static void main(String[] args) {
        // Множество японских авто содержит элементы типа enum из интервала, определенного двумя элементами
        EnumSet<CarManufactured> japanAuto = EnumSet.range(CarManufactured.TOYOTA, CarManufactured.SUZUKI);

        // Множество other будет содержать все элементы, не содержащиеся в множестве japanAuto
        EnumSet<CarManufactured> other = EnumSet.complementOf(japanAuto);
        System.out.println(japanAuto);
        System.out.println(other);
        action("audi", japanAuto);
        action("suzuki", japanAuto);
    }

    public static boolean action(String auto, EnumSet<CarManufactured> set) {
        CarManufactured cm = CarManufactured.valueOf(auto.toUpperCase());
        boolean ok = false;
        if (ok == set.contains(cm)) {
            // Обработка
            System.out.println("Обработан: " + cm);
        } else {
            System.out.println("Обработка невозможна: " + cm);
        }
        return ok;
    }
}
