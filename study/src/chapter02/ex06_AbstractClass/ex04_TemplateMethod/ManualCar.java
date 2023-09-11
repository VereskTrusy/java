package chapter02.ex06_AbstractClass.ex04_TemplateMethod;

public class ManualCar extends Car {


    @Override
    public void drive() {
        System.out.println("사람이 운전 합니다.");
        System.out.println("사람이 핸들을 조작 합니다.");
    }

    @Override
    public void stop() {
        System.out.println("브레이크를 정지합니다.");
    }
}
