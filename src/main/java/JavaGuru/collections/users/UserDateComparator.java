package JavaGuru.collections.users;

import java.util.Comparator;

public class UserDateComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if (o1.getLocalDate().isAfter(o2.getLocalDate()))
            return 1;
        else if (o1.getLocalDate().isBefore(o2.getLocalDate()))
            return -1;
        else return 0;
    }
}
