package chapter02.ex01_Class.ex03_constructor;

public class StudentTest {

    public static void main(String[] args) {

        // 직접 설정한 생성자로 인스턴스 생성 시
        // id를 부여 해줬기 때문에 해당 객체의 studentId를 바로 사용 가능하다
        Student student = new Student("20230729");

        String id = student.getStudentId();

        System.out.println(id);
    }
}
