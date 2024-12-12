package learn.programming_methods.glava2.num;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class DemoNumberFormat {
    public static void main(String[] args) {
        NumberFormat nfGe = NumberFormat.getInstance(Locale.GERMAN);
        NumberFormat nfUs = NumberFormat.getInstance(Locale.US);
        NumberFormat nfFr = NumberFormat.getInstance(Locale.FRANCE);
        double iGe = 0, iUs = 0, iFr = 0;
        String str = "1.234,5"; // Строка, представляющая число
        try {
            // Преобразование строки в германский стандарт
            iGe = nfGe.parse(str).doubleValue();
            // Преобразование строки в американский стандарт
            iUs = nfUs.parse(str).doubleValue();
            // Преобразование строки во французский стандарт
            iFr = nfFr.parse(str).doubleValue();
        } catch (ParseException e) {
            System.err.println("Error position: " + e.getErrorOffset());
        }
        System.out.printf("iGe = %f\niUs = %f\niFr = %f", iGe, iUs, iFr);

        // Преобразование числа из германского в американский стандарт
        String sUs = nfUs.format(iGe);
        // Преобразование числа из германского во французский стандарт
        String sFr = nfFr.format(iGe);
        System.out.println("\nUs " + sUs + "\nFr " + sFr);
    }
}
