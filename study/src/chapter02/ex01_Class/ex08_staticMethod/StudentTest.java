package chapter02.ex01_Class.ex08_staticMethod;

public class StudentTest {
    public static void main(String[] args) {

        // static 변수를 이용하여 자동으로 학번 증가하게 만들기
        
        // 학생 1 생성
        Student studentLee = new Student("이호갑");
        System.out.println("성명 : " + studentLee.getStudentName()); // 이름 출력
        System.out.println("학번 : " + Student.getSerialNumber()); // 학번 출력

        // 학생 2 생성
        Student studentDuck = new Student("장덕배");
        System.out.println("성명 : " + studentDuck.getStudentName()); // 이름 출력
        System.out.println("학번 : " + Student.getSerialNumber()); // 학번 출력

        // static 변수 참조
        System.out.println("스태틱 변수값 : " + Student.getSerialNumber()); // 클래스 매서드와 클래스 변수는 인스턴스가 생성되지 않아도 사용 가능하다

    }
}