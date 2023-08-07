package chapter02.ex02_ArrayAndArrayList.ex02_ObjectArray;

/**
 * 책 객체
 */
public class Book {

    // 객체 배열 만들기

    /**
     * 책 제목
     */
    private String bookName;

    /**
     * 책 저자
     */
    private String author;

    /**
     * 기본 생성자
     */
    public Book() {

    }

    /**
     * 책 이름과 저자를 매개변수로 받는 생성자
     * @param bookName 책 이름
     * @param author 책 저자
     */
    public Book( String bookName, String author ) {
        this.bookName = bookName;
        this.author = author;
    }

    /**
     * 책이름과 책저자를 출력하는 매서드
     */
    public void showBookInfo(  ) {
        System.out.println(bookName + ", " + author);
    }

    // getter, setter
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
