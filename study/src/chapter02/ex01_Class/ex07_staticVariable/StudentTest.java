package chapter02.ex01_Class.ex07_staticVariable;

public class StudentTest {
    public static void main(String[] args) {

        // static 변수를 이용하여 자동으로 학번 증가하게 만들기
        
        // 학생 1 생성
        Student studentLee = new Student("이호갑");
        System.out.println("성명 : " + studentLee.getStudentName()); // 이름 출력
        System.out.println("학번 : " + studentLee.getStudentNumber()); // 학번 출력

        // 학생 2 생성
        Student studentDuck = new Student("장덕배");
        System.out.println("성명 : " + studentDuck.getStudentName()); // 이름 출력
        System.out.println("학번 : " + studentDuck.getStudentNumber()); // 학번 출력

        // static 변수 참조
        System.out.println("스태틱 변수값 : " + Student.serialNumber); // 인스턴스를 생성하지 않아도 클래스명으로 접근 가능하다
    }
}

// static 변수는 데이터 영역에 생성되며
// 인스턴스 생성 순서와 상관없이 초기에 생성된ㄷ
// 모든 인스턴스가 공유한다
