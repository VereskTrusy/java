package chapter01.ex006_Operator;

public class ex006_Operator {
    public static void main(String[] args) {

        // 연산자 ( operator )
        // 단항 연산자
        int num1 = 10; // 대입 연산자 ( assignment operator )
        ++num1;

        // 이항연산자
        int num2 = 5;
        int num3 = 3;
        int num4 = num2 + num3;

        // 삼항 연산자
        int num5 = 10;
        boolean tf = ((num5 > 20) ? true : false);
        System.out.println(tf);


        // 부호 연산자
        // +, - 를 붙여서 부호를 나타낸다
        int num6 = 10;

        System.out.println(+num6); // 값 10이 그대로 출력됨
        System.out.println(-num6); // 값 10에 -가 붙어서 -10이 출력되지만 값이 실제로 바뀌지는 않음
        System.out.println(num6);

        num6 = -num6; // 값을 음수로 바꿔서 다시 변수에 대입함
        System.out.println(num6); // 값 -10 이 출력됨

    }
}
