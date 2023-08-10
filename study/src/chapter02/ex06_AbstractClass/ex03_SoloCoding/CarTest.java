package chapter02.ex06_AbstractClass.ex03_SoloCoding;

public class CarTest {
    public static void main(String[] args) {


        // 추상 클래스를 구현한 클래스의 인스턴스 생성
        Bus bus = new Bus();
        AutoCar autoCar = new AutoCar();

        // 생성한 인스턴스로 각각 구현한 메서드 접근
        bus.run();
        bus.refuel();
        bus.stop();
        bus.takePassenger();

        autoCar.run();
        autoCar.refuel();
        autoCar.stop();
        autoCar.load();




    }
}
