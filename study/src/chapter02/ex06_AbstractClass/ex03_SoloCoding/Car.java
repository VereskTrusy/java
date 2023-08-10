package chapter02.ex06_AbstractClass.ex03_SoloCoding;

/**
 * Car 추상 클래스
 */
public abstract class Car {

    /**
     * run() 추상 메서드
     */
    public abstract void run();

    /**
     * refuel() 추상 메서드
     */
    public abstract void refuel();

    /**
     * stop() 구현코드가 있는 일반 메서드
     */
    public void stop(){
        System.out.println("Car stop");
    }
}
