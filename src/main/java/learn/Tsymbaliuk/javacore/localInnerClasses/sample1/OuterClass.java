package learn.Tsymbaliuk.javacore.localInnerClasses.sample1;

import java.util.Comparator;

public class OuterClass {
    private boolean reverse;

    public OuterClass() {
        super();
    }

    public OuterClass(boolean reverse) {
        this.reverse = reverse;
    }

    public Comparator<String> getLengthComparator() {
        class StringLengthComparator implements Comparator<String> {

            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        }
        return new StringLengthComparator();

//        return (o1, o2) -> o1.length() - o2.length();
//        return Comparator.comparingInt(String::length);
    }
}
