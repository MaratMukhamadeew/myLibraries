package learn.JavaGuru.enums;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static void main(String[] args) {
        Pair[] scheduler = new Pair[7];
        scheduler[0] = new Pair<>(Day.MONDAY, 4);
        scheduler[1] = new Pair<>(Day.THURSDAY, 6);
        scheduler[2] = new Pair<>(Day.WEDNESDAY, 0);
        scheduler[3] = new Pair<>(Day.THURSDAY, Day.THURSDAY.getIsWorkingHours());
        scheduler[4] = new Pair<>(Day.FRIDAY, 4);
        scheduler[5] = new Pair<>(Day.SATURDAY, 8);
        scheduler[6] = new Pair<>(Day.SUNDAY, 0);

        int sum = 0;
        int sumWork = 0;

        for (Pair pair : scheduler) {
            sum += (Integer)pair.value;
            sumWork += ((Day)pair.key).getIsWorkingHours();
            System.out.println(pair.key + " отработано фактически: " + pair.value
                    + "часов, при норме часов: " + ((Day)pair.key).getIsWorkingHours());
        }
        System.out.println("Всего отработано: " + sum + " часов, при норме: " + sumWork + " часов");
    }
}
