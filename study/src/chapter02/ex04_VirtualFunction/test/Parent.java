package chapter02.ex04_VirtualFunction.test;

public class Parent {
    public int parentVal1;

    public Parent(){
        System.out.println("Parent.Parent() 생성자 호출");
    }

    public void metond(){
        System.out.println("Parent.metond() 재정의된 부모 메서드 호출");
    }

    public void parentMethod1(){
        System.out.println("Parent.parentMethod1() 부모 메서드 호출");
    }
}
