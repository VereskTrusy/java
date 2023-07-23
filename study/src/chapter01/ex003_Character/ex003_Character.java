package chapter01.ex003_Character;

public class ex003_Character {
    public static void main(String[] args) {

        char ch1 = 'A';
        System.out.println(ch1); // 문자 출력
        System.out.println((int)ch1); // 문자에 해당하는 정수값(아스키코드값) 출력
        
        char ch2 = 66; // 정수 값 대입
        System.out.println(ch2); // 정수 값에 해당하는 문자 출력
        
        int ch3 = 67;
        System.out.println(ch3); // 정수 값 출력
        System.out.println((char)ch3); // 정수 값에 해당하는 문자출력

        // 1~127 번까지 문자 찍기
        char ch4 = 1;
        for ( int i = 1; i < 128; i++ ) {
            System.out.println(i + " : " + (char)i);
        }
    }
}
