package chapter01.ex007_If_Else;

public class ex007_IfElse02 {
    public static void main(String[] args) {

        // 삼항연산자로 바꾸기

        int a = 10;
        int b = 20;
        int max;

        // 기존 if else 형태
        if ( a > b ) {
            max = a;
        }
        else {
            max = b;
        }
        System.out.println(max);

        // 삼항연산자로 변경한 형태
        max = ( a > b ) ? a : b;
        System.out.println(max);
        
        // 허지만 가독성은 if else 문이 더 좋다

    }
}
