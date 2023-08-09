package chapter02.ex05_Polymorphism.ex01_Polymorphism;


/**
 * 동물 클래스
 */
class Animal {

    /**
     * 동물 클래스 메소드
     */
    public void move(  ) {
        System.out.println("동물이 움직입니다.");
    }
}


/**
 * 사람 클래스
 */
class Human extends Animal {

    /**
     * 사람 클래스 메소드
     */
    public void move(  ){
        System.out.println("사람이 두발로 걷습니다.");
    }
}

/**
 * 호랑이 클래스
 */
class Tiger extends Animal {

    /**
     * 호랑이 클래스 메소드
     */
    public void move(  ) {
        System.out.println("호랑이가 네발로 뜁니다.");
    }
}

/**
 * 독수리 클래스
 */
class Eagle extends Animal {
    /**
     * 독수리 클래스 메소드
     */
    public void move(  ) {
        System.out.println("독수리가 하늘을 낣니다.");
    }
}


public class AnimalTest1 {
    public static void main(String[] args) {
        
        AnimalTest1 test = new AnimalTest1();
        test.moveAnimal( new Human() );
        test.moveAnimal( new Tiger() );
        test.moveAnimal( new Eagle() );
        
        // Animal ani = new Human();
        // 이런식으로 형변환 됐을 것이다
    }

    /**
     * 
     * @param animal
     */
    public void moveAnimal( Animal animal ) { // 매개변수의 자료형이 상위 클래스
        animal.move(); // 재정의된 메서드가 호출됨
    }

}
