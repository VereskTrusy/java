package chapter02.ex02_ArrayAndArrayList.ex01_Array;

public class ArrayAlpa {
    public static void main(String[] args) {
        
        
        // 알파벳 문자와아스키 코드값 출력하기
        
        char[] alphabets = new char[26]; // 알파벳 저장 할 배열
        char ch = 'A'; // A : 65
        
        int length = alphabets.length; // 배열 길이
        
        for( int i = 0; i < length; i++, ch++ ) { // 증감 연산자 하나이상 가능했네?ㅋㅋ
            alphabets[i] = ch; // 아스키 값으로 각 요소에 저장
        }

        for( int j = 0; j < length; j++) {
            System.out.println(alphabets[j] + " : " + (int)alphabets[j]); // 배열의 값과, ch 아스키코드 ( char형을 int정수형으로 변환 ) 출력
        }
    }
}
