package chapter02.ex02_ArrayAndArrayList.ex01_Array;

public class ArrayInit {
    public static void main(String[] args) {


        // 배열 사용하기
        // 배열 초기화 하기

        // 방법 1.
        int[] array1 = new int[] {1, 2 , 3};

        // 방법 2.
        //int[] array2 = new int[3] {1, 2, 3}; // 오류 발생

        // 방법 3.
        int[] array3 = {1, 2, 3};

        // 방법 4.
        int[] array4;
        array4 = new int[] {1, 2, 3}; // new int[]를 생략 할 수 없음
    }
}
