package chapter02.ex02_ArrayAndArrayList.ex02_ObjectArray;

public class Book { // 클래스
    private String bookName; // 보안 지역
    private String author;

    public  Book(  ){    } // 기본 생성자

    /**
     * 책이름과 저자를 매개변수로 받아들이는 생성자
     * @param bookName
     * @param author
     */
    public Book( String bookName, String author ) {
        this.bookName = bookName;
        this.author = author;
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

    /**
     * 책 이름과 저자명을 출력하는 매서드
     */
    public void bookInfo(  ) {
        System.out.println( bookName + ", " + author);
    }
}
