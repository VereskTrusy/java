package chapter02.ex01_Class.ex04_referenceDataType;

/**
 * 학생 클래스
 */
public class Student {

    /**
     * 학생 학번
     */
    private int studentId;

    /**
     * 학생 이름
     */
    private String studentName;

    /**
     * 학생의 국어 과목
     */
    private Subject korean;

    /**
     * 학생의 수학 과목
     */
    private Subject math;


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Subject getKorean() {
        return korean;
    }

    public void setKorean(Subject korean) {
        this.korean = korean;
    }

    public Subject getMath() {
        return math;
    }

    public void setMath(Subject math) {
        this.math = math;
    }
}
