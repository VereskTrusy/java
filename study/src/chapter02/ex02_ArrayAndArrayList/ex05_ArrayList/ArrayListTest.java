package chapter02.ex02_ArrayAndArrayList.ex05_ArrayList;

import java.util.ArrayList;
import chapter02.ex02_ArrayAndArrayList.ex05_ArrayList.Book;

public class ArrayListTest {
    public static void main(String[] args) {


        // Array List 연습하기
        ArrayList<Book> library = new ArrayList<Book>();
        
        library.add( new Book( "책이름1", "책저자1") );
        library.add( new Book( "책이름2", "책저자2") );
        library.add( new Book( "책이름3", "책저자3") );
        library.add( new Book( "책이름4", "책저자4") );
        library.add( new Book( "책이름5", "책저자5") );
        
        int libSize = library.size();

        for ( int i = 0; i < libSize; i++) {
            Book book = library.get(i);
            book.showBookInfo();
        }

        System.out.println("===== 향상된 for 문 사용 =====");
        for ( Book book : library ) {
            book.showBookInfo();
        }
    }
}
