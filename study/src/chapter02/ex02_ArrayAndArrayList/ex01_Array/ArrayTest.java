package chapter02.ex02_ArrayAndArrayList.ex01_Array;

public class ArrayTest {
    public static void main(String[] args) {


        // 배열 초기화 후에 사용하기

        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int arrayLength = array.length; // 배열의 길이, for문에 직업적으로 array.length 사용시 for문 돌때마다 길이를 다시 구함
        int sum = 0;


        for( int i = 0; i < arrayLength; i++ ) { // 배열의 모든 값 출력
            sum += array[i];
            System.out.println(sum);
        }

    }
}
