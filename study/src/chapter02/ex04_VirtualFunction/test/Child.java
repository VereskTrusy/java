package chapter02.ex04_VirtualFunction.test;

public class Child extends Parent {
    public int childVal1;

    public Child(){
        System.out.println("Child.child() 생성자 호출");
    }

    public void childMethod1(){
        System.out.println("Child.childMethod1() 자식 메서드 호출");
    }

    @Override
    public void metond(){
        System.out.println("Child.metond() 재정의된 자식 메서드");
    }
}
