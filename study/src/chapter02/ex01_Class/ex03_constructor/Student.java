package chapter02.ex01_Class.ex03_constructor;

public class Student {

    private String studentId;


    // 생성자
    /**
     * 학생이 생성 될 때 반드시 학번이 필요 하다면 생성자를 통해 필수로 입력 가능하게 만들 수 있다.
     * @param studentId
     */
    public Student( String studentId ) {
        this.studentId = studentId;
    }

    // 매서드
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
