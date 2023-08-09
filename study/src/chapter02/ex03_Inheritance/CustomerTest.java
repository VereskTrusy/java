package chapter02.ex03_Inheritance;

public class CustomerTest {
    public static void main(String[] args) {


        // 상속한 클래스 테스트


        Customer customerDuck = new Customer();

        customerDuck.setCustomerID(1001);
        customerDuck.setCustomerName("김덕배");
        customerDuck.setBonusPoint(1000);
        System.out.println(customerDuck.showCustomorInfo());


        VIPCustomer vipCustomerChun = new VIPCustomer();
        vipCustomerChun.setCustomerID(1002);
        vipCustomerChun.setCustomerName("황춘식");
        vipCustomerChun.setBonusPoint(1000);
        System.out.println(vipCustomerChun.showCustomorInfo());

        // 상속관계에서 커스텀생성자 테스트
        VIPCustomer vipCustomerJo = new VIPCustomer(1003, "조태식", 90);
        vipCustomerJo.setBonusPoint(1500);
        System.out.println(vipCustomerJo.showVIPInfo());

    }

}
