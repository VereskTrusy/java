package chapter02.ex03_Inheritance;

/**
 * VIP 고객 객체, Customer 상속됨
 */
public class VIPCustomer extends Customer {

    // 상속

    /**
     * VIP에 배정된 상담원 ID
     */
    private int agentID;

    /**
     * VIP가 구매한 물품의 금액을 할인 해주는 할인율
     */
    private double saleRatio;


    /**
     * VIP 생성자
     */
    public VIPCustomer(){
        
        // 컴파일러가 자동으로 추가하는 코드 상위클래스의 Customer() 가 호출됨
        super(); // Customer() 부모 클래스 기본 생성자 호출
        super.customerGrade = "VIP";
        super.bonusRatio = 0.05;
        this.saleRatio = 0.1;
        System.out.println("Customer() 생성자 호출");
        
    }

    /**
     * 고객아이디, 고객이름, 담당상담원아이디를 매개변수로 받는 생성자
     * @param customerID
     * @param customerName
     * @param agentID
     */
    public VIPCustomer( int customerID, String customerName, int agentID ){
        
        super(customerID, customerName); // 매개변수가 있는 부모클래스 생성자 호출
        super.customerGrade = "VIP";
        super.bonusRatio = 0.05;
        this.saleRatio = 0.1;
        this.agentID = agentID;
        System.out.println("Customer(int, String, int) 생성자 호출");
        
    }

    /**
     * 굳이 super를 사용하여 Customer의 showCustomorInfo() 사용하기
     * @return
     */
    public String showVIPInfo(  ) {
        return super.showCustomorInfo() + " 담당 상담원 ID는 " + this.agentID + " 입니다.";
    }
}
