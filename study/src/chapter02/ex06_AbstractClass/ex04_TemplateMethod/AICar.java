package chapter02.ex06_AbstractClass.ex04_TemplateMethod;

public class AICar extends Car {


    // 추상 메서드의 구현
    @Override
    public void drive() { // 운전
        System.out.println("자율 주행합니다.");
        System.out.println("자동차가 알아서 방향을 전환 합니다.");
    }

    // 추상 메서드의 구현
    @Override
    public void stop() { // 정지
        System.out.println("스스로 멈춥니다.");
    }
}
