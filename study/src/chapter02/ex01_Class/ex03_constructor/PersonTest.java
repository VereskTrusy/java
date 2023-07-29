package chapter02.ex01_Class.ex03_constructor;

public class PersonTest {

    public static void main(String[] args) {

        // 사람 객체 생성, 생성자 사용, 이름/키/몸무게 입력받기
        Person person = new Person("KimDuck", 185, 85);

        System.out.println("이름 : " + person.getName());
        System.out.println("키 : " + person.getWeight());
        System.out.println("몸무게 : " + person.getHeight());


    }
}
