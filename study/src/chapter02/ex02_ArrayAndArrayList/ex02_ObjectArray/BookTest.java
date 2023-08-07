package chapter02.ex02_ArrayAndArrayList.ex02_ObjectArray;

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

        int bookArray1Length = bookArray1.length; // 배열 길이 획득

        // 배열 출력 하기
        for( int i = 0; i < bookArray1Length; i++) {
            // System.out.println( bookArray1[i].getBookName() + ", " + bookArray1[i].getAuthor() ); // 만들어 놨던거 까먹었었네..ㅋㅋ
            bookArray1[i].showBookInfo();
        }

        // Book 인스턴스를 저장한 메모리 주소 출력 하기
        for( int j = 0; j < bookArray1Length; j++ ) {
            System.out.println(bookArray1[j]); // 해당 배열안의 값은 인스턴스를 가리키고 있는 주소가 들어 있다.
        }





        // 객체 배열 복사하기

        // 원본객체배열 bookArray1 의 1번째 인덱스 부터 3번째 인덱스 까지를 bookArray2 에 복사
        Book[] bookArray2 = new Book[3]; // 복사하여 할당 할 배열 선언

        System.arraycopy(bookArray1, 1, bookArray2, 0, 3); // 복사 진행

        int bookArray2Length = bookArray2.length; // 배열 길이 획득

        // 복사한 객체배열 출력해보기
        for ( int k = 0; k < bookArray2Length; k++ ) {
            bookArray2[k].showBookInfo();
        }
    }
}
