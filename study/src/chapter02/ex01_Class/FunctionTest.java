package chapter02.ex01_Class;

public class FunctionTest {

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;

        int result = plus(number1, number2); // 함수 호출
        System.out.println(number1 + " + " + number2 + " = " + result + "입니다.");

        result = minus(number1, number2);
        System.out.println(number1 + " + " + number2 + " = " + result + "입니다.");

        result = multipliedBy(number1, number2);
        System.out.println(number1 + " + " + number2 + " = " + result + "입니다.");

        result = dividedBy(number1, number2);
        System.out.println(number1 + " + " + number2 + " = " + result + "입니다.");

        result = quotient(number1, number2);
        System.out.println(number1 + " + " + number2 + " = " + result + "입니다.");
    }

    // 함수 정의

    /**
     * 더하기 함수
     * @param n1
     * @param n2
     * @return
     */
    public static int plus(int n1, int n2){ // 함수를 정의한 곳의 매개변수명과 호출한 곳의 매개변수명과 같지 않아도 된다.
        int result = n1 + n2;

        return result; // 결과 값 반환
    }

    /**
     * 빼기 함수
     * @param n1
     * @param n2
     * @return
     */
    public static int minus(int n1, int n2){
        int result = n1 - n2;

        return result;
    }

    /**
     * 곱하기 함수
     * @param n1
     * @param n2
     * @return
     */
    public static int multipliedBy(int n1, int n2) {
        int result = n1 * n2;

        return result;
    }

    /**
     * 나누기 함수
     * @param n1
     * @param n2
     * @return
     */
    public static int dividedBy(int n1, int n2) {
        int result = n1 / n2;

        return result;
    }

    /**
     * 몫 구하는 함수
     * @param n1
     * @param n2
     * @return
     */
    public static int quotient(int n1, int n2) {
        int result = n1 % n2;

        return result;
    }
}
