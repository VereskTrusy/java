package chapter02.ex03_Inheritance;

public class CustomerTest {
    public static void main(String[] args) {

        double price = 10000;

        // 상속한 클래스 테스트


        Customer customerDuck = new Customer();
        customerDuck.setCustomerID(1001);
        customerDuck.setCustomerName("김덕배");
        customerDuck.setBonusPoint(1000);
        System.out.println(customerDuck.showCustomorInfo());
        System.out.println(customerDuck.getCustomerName() + " 님이 지불해야하는 금액은 " + customerDuck.calPrice(price) + " 입니다");

        VIPCustomer vipCustomerChun = new VIPCustomer();
        vipCustomerChun.setCustomerID(1002);
        vipCustomerChun.setCustomerName("황춘식");
        vipCustomerChun.setBonusPoint(1000);
        System.out.println(vipCustomerChun.showCustomorInfo());



//        // 상속관계에서 커스텀생성자 테스트
//        VIPCustomer vipCustomerJo = new VIPCustomer(1003, "조태식", 90);
//        vipCustomerJo.setBonusPoint(1500);
//        System.out.println(vipCustomerJo.showVIPInfo());
//
//        // 부모 클래스로 형 변환시 테스트
//        Customer dd = vipCustomerJo;
//        System.out.println( dd.showCustomorInfo() );

//        // test
//        Customer cc = new VIPCustomer(1003, "cc", 80);
//        cc.setBonusPoint(2000);
//        System.out.println(cc.showCustomorInfo());


        // 묵시적 클래스 형변환과 메서드 재정의
        Customer vc = new VIPCustomer(1005, "아몰랑", 80);
        vc.setBonusPoint(1000);
        vc.showCustomorInfo();
        System.out.println(vc.getCustomerName() + " 님이 지불해야하는 금액은 ");
        System.out.println("1 " + vc.calPrice(price) + " 입니다");
        // 부모클래스 자료형으로 선언 후 자식클래스 생성자로 인스턴스화 시켰을 경우
        // 부모 클래스의 멤버변수 : 접근 가능
        // 자식 클래스의 멤버변수 : 접근 안됨
        // 부모 클래스의 메서드 : 사용 안됨
        // 자식 클래스의 메서드(오버라이드) : 사용 가능
        // 이때 사용되는 매서드가 가상매서드 ( Virtual Method ) 이다


    }

}
