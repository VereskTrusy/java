package chapter02.ex01_Class.ex08_staticMethod;


public class Student {

    // step 1. serialNumber를 public -> private로 변경
    private static int serialNumber  = 1000; // 학번 스태틱 변수

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

    // step 2. static method 만들기
    public static int getSerialNumber() {
        // studentName = "장광남"; // 오류발생 : 클래스의 멤버 변수로 인스턴스가 생성될때 만들어지는 인스턴스 변수라서 사용 불가.
        return serialNumber; // serialNumber는 static 변수라서 클래스메서드 안에서 사용가능하다
    }

    public static void setSerialNumber(int serialNumber) {
        Student.serialNumber = serialNumber;
    }
}
