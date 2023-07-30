package chapter02.ex01_Class.ex09_SingleTon;

public class Company {

    /**
     * step 2. 클래스 내부에 private static으로 유일한 인스턴스 생성하기
     */
    private static Company instance = new Company();


    /**
     * step 1. 싱글톤 패턴으로 회사 클래스 구현하기
     */
    private Company() { // 생성자

    }

    /**
     * step 3. 외부에서 참조 할 수 있는 public 메서드 만들기
     */
    public static Company getInstance(  ) { // 인스턴스를 외부에서 참조할 수 있도록 public get() 메서드구현
        if( instance == null ) {
            instance = new Company();
        }
        return instance; // 유일하게 생성한 인스턴스 반환
    }
}
