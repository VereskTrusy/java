package chapter02.ex06_AbstractClass.ex04_TemplateMethod;

public abstract class Car {

    // 추상 메서드 선언
    public abstract void drive();
    public abstract void stop();

    // 일반 메서드 선언
    public void startCar(){
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    // template 메서드 선언
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
    }
}
