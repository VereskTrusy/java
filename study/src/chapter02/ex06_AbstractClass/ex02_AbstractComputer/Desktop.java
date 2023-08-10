package chapter02.ex06_AbstractClass.ex02_AbstractComputer;

public class Desktop extends Computer { // 추상 클래스 상속함

    @Override // 선언해놓은 메서드를 구현한거니까 오버라드 하는거네~
    public void display() { // 추상 클래스를 상속 받으면 추상 클래스에서 선언된 추상메서드를 구현하여야한다.
        System.out.println("Desktop Display");
    }

    @Override
    public void typing() {
        System.out.println("Desktop typing");
    }
}
