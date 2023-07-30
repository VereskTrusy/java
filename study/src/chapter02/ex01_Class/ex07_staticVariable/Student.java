package chapter02.ex01_Class.ex07_staticVariable;


public class Student {

    public static int serialNumber  = 1000; // 학번 스태틱 변수

    private int studentNumber; // 학번
    private String studentName; // 이름


    /**
     * 학생 이름을 매개변수로 받는 생성자, 학번은 자동생성 된다
     * @param studentName
     */
    public Student( String studentName ) {

        this.studentName = studentName; // 학생 이름

        serialNumber++; // 시리얼 넘버 증가
        this.studentNumber = serialNumber; // 학번으로 부여
    }



    // getter , setter
    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
