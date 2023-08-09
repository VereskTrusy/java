package chapter02.ex02_ArrayAndArrayList.ex06_ArrayEXE;

import java.util.ArrayList;

/**
 * 학생 객체
 */
public class Student {

    private int studentNumber;
    private String studentName;
    private ArrayList<Subject> subjectList;

    /**
     * 기본 생성자
     */
    public Student() {

    }

    /**
     * 학번과 이름을 매개변수로 받는 생성자
     * @param studentNumber
     * @param studentName
     */
    public Student( int studentNumber, String studentName){
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.subjectList = new ArrayList<Subject>();
        // 배열을 생성해놓아야 사용할 수 있나?
        // ->
        // 생성안해주고 값을 세팅하면 null에 집어넣는 행위가 되기때문에
        // 생성자에서 arraylist를 생성해서 공간을 확보 해놓아야함
    }

    /**
     *  과목 세팅
     * @param name
     * @param score
     */
    public void subjectSetting( String name, double score ){
        Subject subject = new Subject();

        subject.setSubjectName(name);
        subject.setSubjectScore(score);

        this.subjectList.add(subject);
    }

    /**
     * 과목정보 출력
     */
    public void showSubjectInfo(){

        for( Subject sub : this.subjectList ){
            System.out.println( sub.getSubjectName() + ", " + sub.getSubjectScore() );
        }
    }

    /**
     * 학생 정보 출력
     */
    public void showStudentInfo(){
        System.out.println(this.studentName + "( " + this.studentNumber + " )");
    }

    /**
     * 과목 총점 계산 및 출력
     */
    public void subjectTotal(){

        double total = 0;

        for ( Subject score : this.subjectList ){
            total += score.getSubjectScore();
        }

        System.out.println("총점 : " + total);
    }


    // getter,  setter
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

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }
}
