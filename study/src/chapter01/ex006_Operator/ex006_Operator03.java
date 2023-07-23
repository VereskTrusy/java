package chapter01.ex006_Operator;

public class ex006_Operator03 {
    public static void main(String[] args) {

        // 증가 감소 연산자
        int num1 = 10;

        int val = ++num1;
        System.out.println(val); // num1 증가 후 val에 대입

        int num2 = 10;

        int val2 = num2++;
        System.out.println(val2); // num2 대입 후 num2 증가
        System.out.println(num2); // 이후에 값이 증가됨

        // -- 연산자도 시점 똑같음



    }
}
