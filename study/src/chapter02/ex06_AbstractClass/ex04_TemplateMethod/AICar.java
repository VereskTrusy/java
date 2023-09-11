package chapter02.ex06_AbstractClass.ex04_TemplateMethod;

public class AICar extends Car {


    @Override
    public void drive() {
        System.out.println("자율 주행 합니다.");
        System.out.println("자동차가 알아서 방향을 전환 합니다.");
    }

    @Override
    public void stop() {
        System.out.println("스스로 멈춥니다.");
    }
}
