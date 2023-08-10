package chapter02.ex05_Polymorphism.ex02_Polymorphism;


public class CustomerTest {
    public static void main(String[] args) {

        System.out.println("========== 일반 고객 ==========");
        // 고객 정보 세팅
        Customer lee = new Customer(10001, "이순대");
        lee.setBonusPoint(1000);

        // 고객 정보 출력
        System.out.println(lee.showCustomorInfo());

        System.out.println("========== VIP 고객 ==========");

        // VIP 고객 정보 세팅
        Customer kim = new VIPCustomer(11001, "김족발", 80); // VIPCustomer를 Customer 형으로 선언
        kim.setBonusPoint(1000);

        // VIP 고객 정보 출력
        System.out.println(kim.showCustomorInfo());

        System.out.println("========== 할인율과 보너스 포인트 계산 ==========");

        double price = 10000;
        double leePrice = lee.calPrice(price);
        double kimPrice = kim.calPrice(price);

        System.out.println(lee.getCustomerName() + " 님이 " + leePrice + "원 지불");
        System.out.println(lee.showCustomorInfo());

        System.out.println(kim.getCustomerName() + " 님이 " + kimPrice + "원 지불");
        System.out.println(kim.showCustomorInfo());

    }
}
