package chapter01.ex004_Constant;

public class ex004_Constant {
    public static void main(String[] args) {

        // java 에서는 상수를 final 예약어를 사용해 선언한다
        // 상수는 대문자로 주로 사용한다
        // 여러단어를 연결하는 경우엔 _ 기호를 사용한다
        // 한번 선언한 상수는 변하지 않기 때문에 선언과 동시에 값을 지정하는 것이 좋다

        final double PI = 3.14;
        final int MAX_NUM = 100; // 선언과 동시에 초기화
        final int MIN_NUM;

        MIN_NUM = 0; // 사용하기 전에 초기화, 초기화 하지 않으면 오류 발생

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

        // MAX_NUM = 1000; // 값을 변경 할 수 없는 상수를 변경해서 오류 발생

    }
}
