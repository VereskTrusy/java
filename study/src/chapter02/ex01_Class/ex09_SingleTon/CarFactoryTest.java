package chapter02.ex01_Class.ex09_SingleTon;

public class CarFactoryTest {
    public static void main(String[] args) {


        // 싱글톤 패턴으로 클래스 구현 연습하기

        CarFactory factory = CarFactory.getInstance(); // 싱글톤 패턴


        Car mySonata = factory.createCar();
        Car yourSonata = factory.createCar();
        Car car1 = CarFactory.getInstance().createCar(); // 위에꺼랑 이거랑 뭐가다름?

        System.out.println(mySonata.getCarNumber());
        System.out.println(yourSonata.getCarNumber());
        System.out.println(car1.getCarNumber());
    }
}
