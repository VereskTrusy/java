package chapter02.ex01_Class.ex05_referenceTest;

public class MyDateTest {
    public static void main(String[] args) {

        // 일자 객체 생성
        MyDate myDate = new MyDate();

        // 년 월 일 입력
        myDate.setYear(2023);
        myDate.setMonth(2);
        myDate.setDay(30);

        System.out.println(myDate.getYear() + ". " + myDate.getMonth() + ". " + myDate.getDay());
    }
}
