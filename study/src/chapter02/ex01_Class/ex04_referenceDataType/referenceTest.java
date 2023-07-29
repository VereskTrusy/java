package chapter02.ex01_Class.ex04_referenceDataType;

public class referenceTest {
    public static void main(String[] args) {


        Student student = new Student();

        // 기본정보 세팅
        student.setStudentId(230729);
        student.setStudentName("김춘식");

        // 국어과목 세팅
        Subject subjectKorean = new Subject();
        subjectKorean.setSubjectName("국어");
        subjectKorean.setSubjectScore(85);
        student.setKorean(subjectKorean);

        // 수학과목 세팅
        Subject subjectMath = new Subject();
        subjectMath.setSubjectName("수학");
        subjectMath.setSubjectScore(90);
        student.setMath(subjectMath);

        // 학생 정보와 과목 점수 출력
        System.out.println("학번 : " + student.getStudentId());
        System.out.println("이름 : " + student.getStudentName());
        System.out.println("과목1 이름 : " + student.getKorean().getSubjectName());
        System.out.println("과목1 점수 : " + student.getKorean().getSubjectScore());
        System.out.println("과목2 이름 : " + student.getMath().getSubjectName());
        System.out.println("과목2 점수 : " + student.getMath().getSubjectScore());
    }
}
/*
접근제어자 ( access modifier ) : 클래스 멤버에 대한 접근 권한을 지정할 수 있는것
정보은닉 :
- 클래스의 멤버변수에 private를 붙여서 외부클래스에서 접근이 불가하게 만든것
- 외부 클래스에서 접근이 제한되지 않으면 정보의 오류가 발생할 수 있다


 */