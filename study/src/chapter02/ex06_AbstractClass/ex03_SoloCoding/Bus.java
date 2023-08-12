package chapter02.ex06_AbstractClass.ex03_SoloCoding;

/**
 * 추상 클래스 상속
 */
public class Bus extends Car {

    /**
     * 일반 클래스 생성자
     */
    public Bus() {
        super(); // 추상클래스의 생성자 호출
        System.out.println("클래스 생성자 Bus");
    }

    /**
     * Car의 추상 메서드 구현
     */
    @Override
    public void run() {
        System.out.println("Bus run");
    }

    /**
     * Car의 추상 메서드 구현
     */
    @Override
    public void refuel() {
        System.out.println("Bus refuel");
    }

//    @Override
//    public void stop() {
//        System.out.println("Bus stop");
//    }

    /**
     * 일반 메서드
     */
    public void takePassenger() {
        System.out.println("Bus takePassenger");
    }
}
