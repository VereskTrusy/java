package chapter02.ex04_VirtualFunction;

// 가상 매서드

public class TestA {
    int num;

    void aaa() {
        System.out.println("aaa() 출력");
    }


    public static void main(String[] args) {
        TestA a1 = new TestA();

        a1.aaa();

        TestA a2 = new TestA();

        a2.aaa();
    }
}
// 생성된 인스턴스 주소가 달라도 실행되는 메서드는 동일 한 메서드를 사용한다.
// 이유는
// 지역변수는 스택 메모리에 위치하고
// 참조변수 a1과 a2가 가리키는 인스턴스는 힙 매모리에 생성되며
// 매서드는 매서드 영역(코드 영역)에 위치한다
// 매서드를 호출하면 매서드 영역의 주소를 참조하여 명령이 실행되기에
// 인스턴스가 달라도 동일한 매서드가 호출되는 것이다.