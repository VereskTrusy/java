package chapter02.ex03_Inheritance;

/**
 * 고객 객체
 */
public class Customer {

    /**
     * 고객 아이디(숫자형식)
     */
    protected int customerID;

    /**
     * 고객 이름
     */
    protected String customerName;

    /**
     * 고객 등급
     */
    protected String customerGrade;

    /**
     * 보너스 포인트
     * 고객이 물건을 구입하면 물건 가액의 bonusRatio 비율대로
     * 포인트가 누적되는 점수
     */
    protected int bonusPoint;

    /**
     * 보너스 적립 비율
     * 기본 1% 적립, 10000원 구매시 100원 적립
     */
    protected double bonusRatio;

    /**
     * 고객 객체 기본 생성자
     */
    public Customer(){
        this.customerGrade = "SILVER"; // 기본 고객 등급
        this.bonusRatio = 0.01; // 기본 보너스 적립 비율
        System.out.println("Customer() 생성자 호출");
    }

    /**
     * 고객 아이디와 이름을 매개변수로 받는 생성자
     * @param customerID
     * @param customerName
     */
    public Customer( int customerID, String customerName ) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerGrade = "SILVER";
        this.bonusRatio = 0.01;
        System.out.println("Customer(int,String) 생성자 호출");
    }

    /**
     * 보너스 포인트 적립 계산
     * @param price
     * @return
     */
    public double calPrice( double price ) {

        this.bonusPoint += price * this.bonusRatio;

        return price;
    }

    /**
     * 고객 정보 출력
     */
    public String showCustomorInfo(  ) {
        return this.customerName + " 님의 등급은 " + this.customerGrade + " 이며, 보너스포인트는 " + this.bonusPoint + "입니다.";
    }


    // getter, setter
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }
}
