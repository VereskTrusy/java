package chapter02.ex01_Class.ex02_person;

public class Person {

    /**
     * 이름
     */
    private String name;

    /**
     * 나이
     */
    private int age;

    /**
     * 결혼여부(true:기혼, false:미혼)
     */
    private boolean married;

    /**
     * 자식 수
     */
    private int child;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }


    // default 생성자
    // 매개변수가 없고 구현코드도 없다.
    // 생성자 정의가 없다면, 컴파일러가 자동으로 만들어준다
    public Person() {

    }
}
