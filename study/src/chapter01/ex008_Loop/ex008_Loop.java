package chapter01.ex008_Loop;

public class ex008_Loop {
    public static void main(String[] args) {


        // 반복문

        int num = 1;
        int sum = 0;

        while ( num <= 10 ) { // 10 보다 작거나 같을 동안
            sum += num; // sum에 num을 누적

            num++; // num 1씩 증가
        }
        System.out.println(sum);



        // for 문
        int sum2 = 0;
        for ( int i = 1; i <= 10; i++) {
            sum2 += i;
        }
        System.out.println(sum2);



        // for 문의 요소 생략
        // 초기화 생략
        int j = 0;
        for ( ; j <= 10; j++ ) {
            // ...
        }

        // 조건식 생략
        for ( j = 0; ; j++) {
            // ...
            if( j < 10) break;
        }

        // 증감식 생략
        for ( j = 0; j <= 10; ) {
            // ...
            j = (++j) % 10;
        }


        // 요소 모두 생략
        /*for ( ; ; ) {
            // 무한반복
        }*/


    }
}
