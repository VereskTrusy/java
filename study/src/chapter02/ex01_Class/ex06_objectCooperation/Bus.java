package chapter02.ex01_Class.ex06_objectCooperation;

/**
 * 버스 객체
 */
public class Bus {

    // variable
    /**
     * 버스 번호
     */
    private int busNumber;

    /**
     * 승객 수
     */
    private int passengerCount;

    /**
     * 버스 수입
     */
    private int money;


    // constructor
    /**
     * 버스 번호를 매개변수로 받는 생성자
     * @param busNumber
     */
    public Bus( int busNumber ) {
        this.busNumber = busNumber;
    }

    // method
    /**
     * 버스요금 1000원 수입 증가
     * @param money
     */
    public void take(int money) {
        this.money += money; // 승객이 버스비를 지불하면 1000원 증가
        this.passengerCount++; // 승객 수 증가
    }

    /**
     * 버스 번호와 승객 수와 현재까지의 수입을 출력하는 매서드
     */
    public void busInfo(  ) {
        System.out.println("버스 " + this.busNumber + "번의 승객은 " + this.passengerCount + "명이고, 수입은 " + this.money + "원 입니다.");
    }

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
