package chapter02.ex01_Class;

public class StudentTest {
    public static void main(String[] args) {
        Student studentDuck = new Student(); // 학생클래스형의 인스턴스 생성, 생성된다는 것은 힙메모리공간에 올리는 뜻이다. student는 인스턴스를 가리키는변수로 참조변수라 한다
        studentDuck.setStudentName("김덕배"); // setter로 학생이름 설정하기

        System.out.println(studentDuck.getStudentName()); // getter로 학생이름 가져오기


        Student studentChun = new Student(); // 두번째 학생 생성
        studentChun.setStudentName("최춘배");

        System.out.println(studentChun.getStudentName());

        // 같은 클래스를 사용하더라도 인스턴스는 각각의 공간을 차지한다.
        // 참조 변수가 가리키고 있는 주소로 확인 해보자
        System.out.println(studentDuck); // chapter02.ex01_Class.Student@14899482 클래스이름@주소값 : 해시코드값( hash Code )
        System.out.println(studentChun); // chapter02.ex01_Class.Student@21588809 다른것이 확인 되었다.
    }
}
// 같은 패키지 안에서 클래스를 불러올 때는 import 안해줘도 무방하다
// Student 와 StudentTest 의 package 가 package chapter02.ex01_Class 로 동일한것을 알 수 있다.
// 만약 다른 패키지에서 Student 를 사용하려면 import 처리를 해줘야 한다.

/*
힙 : 프로그램에서 사용하는 동적 메모리 공간을 말한다.
일반적으로 프로그램은 스택, 힙, 데이터 이렇게 세 영역을 사용한다
객체가 생성될 때 힙메모리 공간을 사용한다.
힙은 동적으로 할당되며 사용이 끝나면 메모리를 해제해줘야한다.

 */