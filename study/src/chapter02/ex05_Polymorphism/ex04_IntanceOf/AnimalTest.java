package chapter02.ex05_Polymorphism.ex04_IntanceOf;

import java.util.ArrayList;

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
    @Override
    public void move(  ){
        System.out.println("사람이 두발로 걷습니다.");
    }

    /**
     * 책 읽는 동작 메소드
     */
    public void readBook(  ) {
        System.out.println("사람이 책을 읽습니다.");
    }
}

/**
 * 호랑이 클래스
 */
class Tiger extends Animal {

    /**
     * 호랑이 클래스 메소드
     */
    @Override
    public void move(  ) {
        System.out.println("호랑이가 네발로 뜁니다.");
    }

    /**
     * 호랑이 사냥 메서드
     */
    public void hunting(  ) {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

/**
 * 독수리 클래스
 */
class Eagle extends Animal {
    /**
     * 독수리 클래스 메소드
     */
    @Override
    public void move(  ) {
        System.out.println("독수리가 하늘을 납니다.");
    }

    /**
     * 독수리 더높이 나는
     */
    public void flying(  ) {
        System.out.println("독수리가 하늘을 높이 납니다.");
    }
}

public class AnimalTest {

    ArrayList<Animal> aniList = new ArrayList<Animal>(); // 배열의 자료형은 Animal로 지정

    public static void main(String[] args) { // 메인 메서드

        AnimalTest aTest = new AnimalTest();
        aTest.addAnimal();

        // 원래 형으로 다운 캐스팅
        System.out.println("원래 형으로 다운 캐스팅");
        aTest.testCasting();
    }

    /**
     * 리스트에 하위인스턴스를 추가하는 매서드
     */
    public void addAnimal(  ) {
        aniList.add( new Human() );
        aniList.add( new Tiger() );
        aniList.add( new Eagle() );

        for ( Animal ani : aniList) {
            ani.move();
        }

    }

    public void testCasting(  ) {

        int aniListSize = aniList.size(); // 리스트 사이즈 구하기

        for( int i = 0; i < aniListSize; i++ ) { // 리스트를 돌면서

            Animal ani = aniList.get(i); // Animal 형으로 하나씩 받음

            if( ani instanceof Human ) { // 상속관계면
                Human human = (Human) ani; // 명시적 형변환 시도
                human.readBook(); // 메서드 실행
            }
            else if( ani instanceof Tiger ) {
                Tiger t = (Tiger) ani;
                t.hunting();
            }
            else if( ani instanceof Eagle ) {
                Eagle e = (Eagle) ani;
                e.flying();
            }
            else {
                System.out.println("지원되지 않는 형변환 입낟.");
            }
        }
    }
}
