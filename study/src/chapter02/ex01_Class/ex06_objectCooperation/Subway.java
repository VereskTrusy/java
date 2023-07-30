package chapter02.ex01_Class.ex06_objectCooperation;

/**
 * 지하철 객체
 */
public class Subway {

    // variable
    /**
     * 지하철 노선번호
     */
    private String subwayNumber;

    /**
     * 지하철 승객 수
     */
    private int passengerCount;

    /**
     * 지하철 수입
     */
    private int money;

    // constructor
    /**
     * 지하철 노선번호를 매개변수로 받는 생성자
     * @param subwayNumber
     */
    public Subway( String subwayNumber ){
        this.subwayNumber = subwayNumber;
    }

    // method
    /**
     * 지하철 요금 1500원 지불하는 매서드
     * @param money
     */
    public void take( int money ) {
        this.money += money; // 승객이 지하철 요금을 지불하면 1500원 증가
        this.passengerCount++; // 승객 수 증가
    }

    /**
     * 지하철 노선번호와 승객 수와 현재까지의 수입을 출력하는 매서드
     */
    public void subwayInfo(  ) {
        System.out.println("지하철 " + this.subwayNumber + "노선의 승객은 " + this.passengerCount + "명이고, 수입은 " + this.money + "원 입니다.");
    }

    public String getSubwayNumber() {
        return subwayNumber;
    }

    public void setSubwayNumber(String subwayNumber) {
        this.subwayNumber = subwayNumber;
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
