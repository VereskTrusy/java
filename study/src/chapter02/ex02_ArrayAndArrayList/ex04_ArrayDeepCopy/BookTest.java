package chapter02.ex02_ArrayAndArrayList.ex04_ArrayDeepCopy;


public class BookTest {
    public static void main(String[] args) {

        // 깊은 복사 연습하기 ( deep copy )
        // 객체배열의 복사 시 인스턴스를 따로 관리하고 싶다면
        // 직접 인스턴스를 만들고 그 값을 복사해야 한다.

        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[1] = new Book("데미안", "헤르만 허세"); // 1번 배열에 인스턴스 생성
        bookArray1[0] = new Book("태백산맥", "조정래");
        bookArray1[2] = new Book("어떻게 살 것인가", "유시민");


        bookArray2[0] = new Book(); // 2번 배열에 기본 생성자로 인스턴스 생성
        bookArray2[1] = new Book();
        bookArray2[2] = new Book();

        int arr1Size = bookArray1.length; // 1번 배열 사이즈 획득

        for ( int i = 0; i < arr1Size; i++) { // 배열1의 요소를 배열2의 인스턴스에 복사
            bookArray2[i].setBookName( bookArray1[i].getBookName() );
            bookArray2[i].setAuthor( bookArray1[i].getAuthor() );
        }

        bookArray1[1].setBookName("나목"); // 1번 배열의 요소를 변경
        bookArray1[1].setAuthor("박완서");


        System.out.println("===== Array 1 =====");
        for ( int i = 0; i < arr1Size; i++ ) {
            bookArray1[i].showBookInfo();
        }

        System.out.println("===== Array 2 =====");
        for ( int i = 0; i < arr1Size; i++ ) {
            bookArray2[i].showBookInfo();
        }

        // 얕은 복사와 다르게 깊은 복사는 새로 생성한 인스턴스를 가리키고 있기 때문에
        // 복사 후 원본배열이 가리키고 있는 내용을 변경 하더라도
        // 복사한배열의 내용은 바뀌지 않았다
    }
}
