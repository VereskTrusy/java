package chapter02.ex05_Polymorphism.ex03_Polymorphism;


/**
 * 골드 등급 고객 클래스, Customer 상속됨
 */
public class GoldCustomer extends Customer {

    /**
     * 골드등급 고객에 배정된 상담원 ID
     */
    // private int agentID; // 골드 등급 고객은 담당 상담원이 배정되지 않는다

    /**
     * 골드 등급 고객이 구매한 물품의 금액을 할인 해주는 할인율
     */
    private double saleRatio;

    // 전해

    /**
     * 골드 긍급 고객 생성자
     */
    public GoldCustomer( int customerID, String customerName ) {
        super(customerID, customerName); // Customer() 부모 클래스 기본 생성자 호출
        super.customerGrade = "GOLD";
        super.bonusRatio = 0.02;
        this.saleRatio = 0.1;
        System.out.println("GoldCustomer() 생성자 호출");
    }

    /**
     * Customer 에서 선언한 매서드 재정의, 골드용
     * @param price
     * @return
     */
    @Override
    public double calPrice( double price ) {

        super.bonusPoint += price * super.bonusRatio; // 보너스 적립

        price = price - (price * this.saleRatio); // 할인 계산

        return price;
    }
}
