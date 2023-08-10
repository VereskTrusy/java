package chapter02.ex06_AbstractClass.ex03_SoloCoding;

/**
 * 추상 클래스 상속
 */
public class AutoCar extends Car {

    /**
     * Car의 추상 메서드 구현
     */
    @Override
    public void run() {
        System.out.println("AutoCar run");
    }

    /**
     * Car의 추상 메서드 구현
     */
    @Override
    public void refuel() {
        System.out.println("AutoCar refuel");
    }

//    @Override
//    public void stop() {
//        System.out.println("AutoCar stop");
//    }

    /**
     * 일반 메서드
     */
    public void load(){
        System.out.println("AutoCar load");
    }
}
