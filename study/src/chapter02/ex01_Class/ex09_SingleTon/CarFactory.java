package chapter02.ex01_Class.ex09_SingleTon;

/**
 * 자동차 공장
 */
public class CarFactory {

    /**
     * 싱글톤 패턴 인스턴스 : 외부에서 인스턴스 참조 불가 하도록 private와
     * 유일한 인스턴스 이도록 static을 사용하여 인스턴스 생성
     * 시스템이 메모리에 적제될때 만들어 진다
     */
    private static CarFactory carFactoryInstance = new CarFactory();



    /**
     * 싱글톤 패턴 생성자 : 외부에서 생성자 호출 할 수 없도록 private 생성자 만들기
     */
    private CarFactory(  ) {

    }




    /**
     * 싱글톤 패턴 자동차 공장 인스턴스 반환 매서드 : 외부에서 호출 가능토록 public으로 선언
     * @return instance
     */
    public static CarFactory getInstance(  ) {

        if( null == carFactoryInstance ) { // 인스턴스가 널이면 생성하고 널이 아니면 인스턴스 반환
            carFactoryInstance = new CarFactory();
        }
        return carFactoryInstance;
    }


    /**
     * 자동차 생산
     * @return
     */
    public Car createCar(){
        Car car = new Car();
        return car;
    }
}
