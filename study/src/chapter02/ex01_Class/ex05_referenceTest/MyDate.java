package chapter02.ex01_Class.ex05_referenceTest;

public class MyDate {

    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {

        switch(this.month) {
            case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
                if( day < 1 || day > 31) {
                    System.out.println( "유효하지 않은 날짜 입니다.");
                }
                else {
                    System.out.println("유효한 날짜 입니다.");
                    this.day = day;
                }
                break;
            case 4 : case 6 : case 9 : case 11 :
                if( day < 1 || day > 30) {
                    System.out.println( "유효하지 않은 날짜 입니다.");
                }
                else {
                    System.out.println("유효한 날짜 입니다.");
                    this.day = day;
                }
                break;
            case 2 :
                if( day < 1 || day > 28) {
                    System.out.println( "유효하지 않은 날짜 입니다.");
                }
                else {
                    System.out.println("유효한 날짜 입니다.");
                    this.day = day;
                }
                break;
        }
    }
}
