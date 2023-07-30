package chapter02.ex01_Class.ex06_objectCooperation;

/**
 * 학생 객체
 */
public class Student {

    // variable
    private String studentName;
    private int money;


    // constructor
    /**
     * 학생 객체 생성자
     * @param studentName
     * @param money
     */
    public Student( String studentName, int money ) { // 학생 이름과가진 돈을 매개변수로 받는 생성자
        this.studentName = studentName;
        this.money = money;
    }


    // method
    /**
     * 학생이 버스를 타면 1000원을 지불하는 매서드
     * @param bus
     */
    public void takeBus( Bus bus ) {
        bus.take(1000); // 버스에 1000원 지불 행위
        this.money -= 1000; // 내돈에서 1000원 빠져나감
    }

    /**
     * 학생이 지하철을 타면 1500원을 지불하는 매서드
     * @param subway
     */
    public void takeSubway( Subway subway ) {
        subway.take(1500); // 지하철에 1500원 지불 행위
        this.money -= 1500; // 내돈에서 1500원 빠져나감
    }

    /**
     * 학생의 남은 돈을 출려하는 매서드
     */
    public void studentInfo( ) {
        System.out.println(this.studentName + "님의 남은 돈은 " + this.money + "입니다.");
    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
