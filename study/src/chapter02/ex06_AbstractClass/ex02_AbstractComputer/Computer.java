package chapter02.ex06_AbstractClass.ex02_AbstractComputer;


public abstract class Computer { // 추상 클래스
    public abstract void display(); // 추상 메서드
    public abstract void typing();

    public void turnOn(){
        System.out.println("전원을 켭니다.");
    }
    public void turnOff(){
        System.out.println("전원을 끕니다.");
    }
}
