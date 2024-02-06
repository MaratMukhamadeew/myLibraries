package learn.JavaGuru.enums;

public enum Day {
    MONDAY(true, 8),
    TUESDAY(true, 8),
    WEDNESDAY(true, 8),
    THURSDAY(true, 8),
    FRIDAY(true, 8),
    SATURDAY(false, 0),
    SUNDAY(false, 0);

    private boolean isWorkingDay;
    private int isWorkingHours;

    Day(boolean isWorkingDay, int isWorkingHours) {
        this.isWorkingDay = isWorkingDay;
        this.isWorkingHours = isWorkingHours;
    }

    public boolean isWorkingDay() {
        return isWorkingDay;
    }

    public void setWorkingDay(boolean workingDay) {
        isWorkingDay = workingDay;
    }

    public int getIsWorkingHours() {
        return isWorkingHours;
    }

    public void setIsWorkingHours(int isWorkingHours) {
        this.isWorkingHours = isWorkingHours;
    }

    public static void main(String[] args) {
        System.out.println(Day.MONDAY.isWorkingDay);

        for (Day day : Day.values()) System.out.println(day + " " + day.isWorkingDay + " " + day.isWorkingHours);
    }
}
