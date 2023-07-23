package chapter01.ex006_Operator;

public class ex006_Operator04 {
    public static void main(String[] args) {

        // 단락 회로 평가 : 논리연산에서 모든항이 실행되지 않는 경우
        // short circuit Evaluation, SCE 라고 한다

        int num1 = 10;
        int i = 2;

        boolean value = ( (num1 = num1 + 10) < 10 ) && ( (i = i + 2) < 10 );
        // 논리곱에서 앞 항의 결과가 거짓이므로 , 뒷항의 문장은 실행되지 않음
        System.out.println(value); // false
        System.out.println(num1); // 앞 항은 실행되어 20이 됨
        System.out.println(i); // 뒷 항은 실행되지 않아 그대로 2임

        // 논리 합도 똑같음..


        // 1분 복습
        int num2 = 5;
        int i2 = 10;

        boolean value2 = ( (num2 = num2 * 10) > 45 ) || ( (i2 = i2 - 5) < 10 );
        System.out.println(value2);
        System.out.println(num2);
        System.out.println(i2);
    }
}
