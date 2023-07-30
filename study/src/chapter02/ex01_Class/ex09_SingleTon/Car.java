package chapter02.ex01_Class.ex09_SingleTon;

/**
 * 자동차 객체
 */
public class Car {

    /**
     * 자동차 고유번호
     */
    private static int sequence = 10001; // 자동차 고유 번호

    /**
     * 자동차 번호
     */
    private int carNumber; // 자동차 번호


    /**
     * 생성자
     */
    public Car() {
        this.carNumber = sequence;
        sequence++;
    }



    // getter, setter
    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }
}
