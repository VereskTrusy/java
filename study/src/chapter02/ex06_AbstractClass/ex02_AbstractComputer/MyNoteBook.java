package chapter02.ex06_AbstractClass.ex02_AbstractComputer;

public class MyNoteBook extends NoteBook {
    @Override
    public void typing() {
        System.out.println("MyNoteBook typing");
    }
    // MyNoteBook 은 추상메서드가 모두 구현된 클래스 이므로 오류가 나지 않는다, 그리고 abstract 예약어도 사용하지 않는다
    //
}
