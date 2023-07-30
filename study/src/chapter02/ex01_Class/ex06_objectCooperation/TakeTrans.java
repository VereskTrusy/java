package chapter02.ex01_Class.ex06_objectCooperation;

public class TakeTrans {
    public static void main(String[] args) {

        // 학생 생성
        Student studentDuck = new Student("김덕배", 5000);
        Student studentChun = new Student("김춘규", 10000);

        System.out.println("> 김덕배와 김춘규의 현재 자금 상태 입니다.");
        studentDuck.studentInfo();
        studentChun.studentInfo();

        // 버스, 지하철 생성
        Bus bus1000 = new Bus(1000);
        Subway subway2 = new Subway("2호선");


        System.out.println("> 김덕배와 김춘규가 버스와 지하철을 타는 행위를 합니다.");
        
        // 김덕배가 버스를 타는 행위와 각 정보 출력
        studentDuck.takeBus(bus1000);
        studentDuck.studentInfo();
        bus1000.busInfo();

        // 김춘규가 지하철을 타는 행위와 각 정보 출력
        studentChun.takeSubway(subway2);
        studentChun.studentInfo();
        subway2.subwayInfo();
    }
}
