package chapter02.ex01_Class;

public class Student { // 학생 클래스

    // 멤버변수 ( property, attribute )
    private int studentID;      // 학번
    private String studentName; // 학생이름
    private int grade;          // 학년
    private String address;     // 사는 곳


    // 생성자
    private void Student(  ) {

    }


    // 메서드 ( member function, method )
    /**
     * 학생 이름, 주소 정보 console 창에 출력하는 함수
     */
    public void showStudentInfo(){
        System.out.println(studentName + ", " + address); // 이름, 주소 출력
    }

    /**
     * 학생의 이름 가져오기
     * @return studentName
     */
    public String getStudentName(  ) {
        return studentName;
    }

    /**
     * 학생의 이름 설정하기
     * @param studentName
     */
    public void setStudentName( String studentName ) {
        this.studentName = studentName;
    }

    /*
    // 테스트용 메인 메서드
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentName("김덕배"); // setter로 설정하기

        System.out.println(student.getStudentName()); // getter로 가져오기
    }*/
}