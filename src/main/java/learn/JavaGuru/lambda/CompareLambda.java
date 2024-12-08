package learn.JavaGuru.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CompareLambda {
    public static void main(String[] args) {
        String[] s1 = new String[] { "vccm", "c", "qwe", "asd", "zxc", "mnb", "hg", "yt", "ds", "fv" };
        String[] s2 = new String[] { "vccm", "c", "qwe", "asd" };
        String[] s3 = new String[] { "vccm", "c", "qwe", "asd", "zxc", "mnb", "hg", "yt", "ds" };
        String[] s4 = new String[] { "vccm"};
        String[] s5 = new String[] { "vccm", "c", "qwe", "asd", "zxc" };

        List<String[]> arrays = new ArrayList<>();
        arrays.add(s1);
        arrays.add(s2);
        arrays.add(s3);
        arrays.add(s4);
        arrays.add(s5);

        arrays.sort((o1,o2) -> o2.length - o1.length);

        for (String[] arr : arrays) {
            System.out.println(Arrays.toString(arr));
        }

        System.out.println();
        arrays.sort(Comparator.comparingInt(o -> o.length));
        for (String[] arr : arrays) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
