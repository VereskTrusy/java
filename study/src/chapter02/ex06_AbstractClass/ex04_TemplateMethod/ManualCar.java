package chapter02.ex06_AbstractClass.ex04_TemplateMethod;

public class ManualCar extends Car {

    // 추상메서드의 구현
    @Override
    public void drive() { // 운전
        System.out.println("사람이 운전합니다.");
        System.out.println("사람이 핸들을 조작 합니다.");
    }

    // 추상 메서드의 구현
    @Override
    public void stop() { // 정지
        System.out.println("브레이크로 정지합니다.");
    }
}
