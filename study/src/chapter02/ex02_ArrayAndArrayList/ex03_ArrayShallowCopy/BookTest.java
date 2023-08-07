package chapter02.ex02_ArrayAndArrayList.ex03_ArrayShallowCopy;

public class BookTest {
    public static void main(String[] args) {

        // 객체 배열 만들기

        Book[] bookArray1 = new Book[5]; // 객체 배열 생성, 메모리내 공간 할당

        // 할당된 공간에 인스턴스 매칭
        bookArray1[0] = new Book("태백산맥", "조정래");
        bookArray1[1] = new Book("데미안", "헤르만 허세");
        bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
        bookArray1[3] = new Book("토지", "박경리");
        bookArray1[4] = new Book("어린왕자", "생텍형님");


        // 객체 배열 복사하기

        // 원본객체배열 bookArray1 의 1번째 인덱스 부터 3번째 인덱스 까지를 bookArray2 에 복사
        Book[] bookArray2 = new Book[3]; // 복사하여 할당 할 배열 선언

        System.arraycopy(bookArray1, 1, bookArray2, 0, 3); // 복사 진행

        int bookArray2Length = bookArray2.length; // 배열 길이 획득

        // 복사한 객체배열 출력해보기
        for ( int k = 0; k < bookArray2Length; k++ ) {
            bookArray2[k].showBookInfo();
        }




        // 얕은 복사 연습하기 ( shallow copy )
        // 원본객체배열의 내용을 변경한 후 복사한배열이 무엇을 참조하는지 테스트한다
        // 원본객체배열의 첫번째 요소를 변경한다

        bookArray1[1].setBookName("나목");
        bookArray1[1].setAuthor("박완서");

        // 복사한 객체배열 출력해보기
        // 복사한 객체배열의 0번째 요소가 기존 데이만 에서 나목으로 변경 되었다
        for ( int k = 0; k < bookArray2Length; k++ ) {
            bookArray2[k].showBookInfo();
        }

        // 알 수 있는 사항 :
        // 객체 배열 요소에 저장된 값은 인스턴스 자체가 아니고
        // 인스턴스의 주소값이기 때문이다

    }
}
