package chapter02.ex01_Class.ex09_SingleTon;

public class CompanyTest {

    public static void main(String[] args) {


        /**
         * step 4. 실제로 사용하는 코드 만들기
         */
        Company myCompany1 = Company.getInstance(); // 클래스 이름으로 getInstance() 호출하여 참조 변수에 대입
        Company myCompany2 = Company.getInstance();

        System.out.println(myCompany1 == myCompany2); // 두 변수가 같은 주소인지 확인
    }

}
