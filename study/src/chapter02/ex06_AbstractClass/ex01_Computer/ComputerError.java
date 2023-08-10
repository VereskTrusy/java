package chapter02.ex06_AbstractClass.ex01_Computer;

// 추상 클래스 학습하기

public class ComputerError { // 오류 발생 : Class 'Computer' must either be declared abstract or implement abstract method 'display()' in 'Computer'
//    public void display(); // 오류 발생 : Missing method body, or declare abstract
//    public void typing(); // 오류 발생 : 매서드 바디가 없다, 아니면 추상매서드로 선언해라

    // ->
//    public abstract void display(); // 오류 발생 : Abstract method in non-abstract class
//    public abstract void typing(); // 오류 발생 : 현재 클래스가 추상클래스가 아니야 추상클래스로 바꿔~

    public void turnOn(){
        System.out.println("전원을 켭니다.");
    }
    public void turnOff(){
        System.out.println("전원을 끕니다.");
    }
}
