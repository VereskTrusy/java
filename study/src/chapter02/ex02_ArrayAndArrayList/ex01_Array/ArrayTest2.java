package chapter02.ex02_ArrayAndArrayList.ex01_Array;

public class ArrayTest2 {
    public static void main(String[] args) {

        // 배열의 유효한 데이터만 출력하기

        double[] data = new double[10]; // 배열 생성 및 초기화
        int size = 0; // 배열의 사이즈를 구할 변수

        data[0] = 10.0; size++; // 배열의 첫번째부터
        data[1] = 20.0; size++; // 데이터를 넣으면서
        data[2] = 30.0; size++; // 사이즈 증가하여 유효한 사이즈를 구한다.


        for( int i = 0; i < size; i++ ) { // 구했던 사이즈만큼 출력
            System.out.println(data[i]);
        }


    }
}
