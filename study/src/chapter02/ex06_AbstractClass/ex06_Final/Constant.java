package chapter02.ex06_AbstractClass.ex06_Final;

public class Constant {

    int num = 100;
    final int NUM = 200;

    public static void main(String[] args) {
        Constant constant = new Constant();
        constant.num = 50;
        // constant.NUM = 150;
        // 오류 발생 : final 로 선언해 놓은 변수에 다시 값을 대입해서 발생함
        // final 예약어로 선언한 변수는 상수로 취급된다. 변경 불가

        System.out.println(constant.num);
        System.out.println(constant.NUM);

    }
}
