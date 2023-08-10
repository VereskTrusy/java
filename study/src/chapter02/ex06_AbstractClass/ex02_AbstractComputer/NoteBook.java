package chapter02.ex06_AbstractClass.ex02_AbstractComputer;

public abstract class NoteBook extends Computer { // 노트북도 추상 클래스로 선언

    @Override
    public void display() {
        System.out.println("NoteBook Display");
    }
    // 상속 받은 메서드를 모두 구현하지 않고 display( ) 하나만 구현하였다
    // 그러므로 노트북 클래스는 추상메서드를 하나 가지고 있기 때문에 추상클래스가 된다
    // MyNoteBook 클래스에서 구현 할꺼다
}
