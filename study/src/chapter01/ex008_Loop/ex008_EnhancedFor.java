package chapter01.ex008_Loop;

public class ex008_EnhancedFor {
    public static void main(String[] args) {


        // 향상된 for문 사용 해보기

        // 향상된 for문은 배열의 처음부터 끝까지의 요소를 참조 할 때
        // 유용한 반복문이다

        String[] array = new String[]{ "java", "C", "javaScript", "Python" };

        for( String lang : array ){
            System.out.println(lang);
        }
        // lang 변수에는 array의 각 요소가 대입된다



    }
}
