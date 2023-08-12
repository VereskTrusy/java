package chapter02.ex06_AbstractClass.ex03_SoloCoding;

/**
 * Car 추상 클래스
 */
public abstract class Car {

    /**
     * 추상 클래스 생성자
     */
    public Car() {
        System.out.println("추상클래스 생성자 Car ");
    }

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
