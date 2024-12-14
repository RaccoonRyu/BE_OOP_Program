package Java_Post_Advanced1.CH02_Immutable.ex;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    // 불변 객체에서 기존 객체의 값을 바꿔서 새 객체를 반환할 때는 보통 with라는 표현을 많이 쓴다.
    public ImmutableMyDate withYear(int newYear) {
        return new ImmutableMyDate(newYear, month, day);
    }

    public ImmutableMyDate withMonth(int newMount) {
        return new ImmutableMyDate(year, newMount, day);
    }

    public ImmutableMyDate withDay(int newDay) {
        return new ImmutableMyDate(year, month, newDay);
    }

    @Override
    public String toString() {
        return year +
                "-" + month +
                "-" + day;
    }
}
