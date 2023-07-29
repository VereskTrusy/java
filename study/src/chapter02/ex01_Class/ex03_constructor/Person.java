package chapter02.ex01_Class.ex03_constructor;

/**
 * 사람 객체
 */
public class Person {

    /**
     * 이름
     */
    private String name;

    /**
     * 키
     */
    private float height;

    /**
     * 몸무게
     */
    private float weight;


    // 생성자
    /**
     * 사람 객체 기본 생성자
     */
    public Person( ) {

    }

    /**
     * 사람 객체 이름 입력 생성자
     * @param name
     */
    public Person( String name ) {
        this.name = name;
    }

    /**
     * 사람 객체 이름,키, 몸무게 입력 생성자
     * @param name
     * @param weight
     * @param height
     */
    public Person( String name, int height, int weight ) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }



    // 매서드

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
    /*
    default 생성자 :
    - 매개변수가 없고 구현코드도 없다.
    - 생성자 정의가 없다면, 자바 컴파일러가 자동으로 만들어준다
    - 자바 컴파일러는 생성자가 없는 경우에만 기본 생성자를 만든다
    - 생성자를 만들어 줬다면 기본 생성자는 만들어지지 않는다

    생성자 오버로드 ( constructor overload ) :
    - 매개변수 갯수에 따라 기본 생성자와 동일한 매서드 명으로 여러 매서드를 정의 가능
    - 인스턴스 변수의 초기화 역활
     */