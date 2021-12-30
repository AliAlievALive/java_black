package enums;

public class EnumEx1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.SUNDAY);
        today.daysInfo();
    }

}

enum WeekDays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

class Today {
    WeekDays weekDay;

    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo() {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Go to work!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("You can rest");
        }
    }
}