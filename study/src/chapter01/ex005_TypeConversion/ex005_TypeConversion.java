package chapter01.ex005_TypeConversion;

public class ex005_TypeConversion {

    public static void main(String[] args) {

        // 형변환 : 묵시적형변환(자동형변환), 명시적형변환(강제형변환)
        // 1. 바이트 크기가 작은 자료형에서 큰 자료형으로 형변환은 자동으로 이루어진다
        // 2. 덜 정밀한 자료형에서 더 정밀한 자료형으로 형 변환은 자동으로 이루어진다

        // 묵시적 형변환 예제
        byte byteNum = 10;
        int intNum = byteNum; // byte 형이 int 형 변수로 대입됨


        System.out.println(byteNum);
        System.out.println(intNum);


        int intNum2 = 20;
        float floatNum = intNum2; // int 형이 float 형 변수로 대입됨

        System.out.println(intNum);
        System.out.println(floatNum);


        double doubleNum;
        doubleNum = floatNum + intNum2;

        System.out.println(doubleNum);


        // 명식적 형변환 예제
        int intNum3 = 10;
        byte byteNum2 = (byte)intNum3;

        System.out.println(byteNum2);


        int intNum4 = 1000;
        byte byteNum3 = (byte)intNum4;

        System.out.println(byteNum3); // 1000이 byte 형 범위( -128~127 )을 넘기 때문에 자료 손실이 발생해 대입된갑이 -24로 출력된다


        double doubleNum2 = 3.14;
        int intNum5 = (int)doubleNum2;

        System.out.println(intNum5); // 소수점이 생략되고 정수부분만 대입된다


        // 연산중 형변환
        double doubleNum3 = 1.2;
        float floatNum2 = 0.9F;

        int intNum6 = (int)doubleNum3 + (int)floatNum2; // 두 실수가 형변환 되어 더해짐
        int intNum7 = (int)(doubleNum3 + floatNum2); // 두 실수 합 연산 후 형변환됨

        // 결과 값이 다름
        System.out.println(intNum6);
        System.out.println(intNum7);


    }
}
