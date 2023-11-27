package chapter02.ex04_VirtualFunction.test;

public class main {
    public static void main(String[] args) {

        Parent parent = new Parent();
        System.out.println("--------------------");
        System.out.println("Parent 멤버변수 접근 가능");
        parent.parentVal1 = 1;
        System.out.println("--------------------");
        parent.parentMethod1();
        System.out.println("--------------------");
        parent.metond();
        System.out.println("--------------------");


        Child child = new Child();
        System.out.println("--------------------");
        System.out.println("Child 멤버변수 접근 가능");
        child.childVal1 = 2;
        System.out.println("--------------------");
        System.out.println("Parent 멤버변수 접근 가능");
        child.parentVal1 = 3;
        System.out.println("--------------------");
        child.childMethod1();
        System.out.println("--------------------");
        child.metond();
        System.out.println("--------------------");
        child.parentMethod1();
        System.out.println("--------------------");



        System.out.println("--------------------");
        System.out.println("부모 자료형으로 자식 인스턴스 생성");
        Parent child2 = new Child();
        System.out.println("--------------------");
        System.out.println("Child 멤버변수 접근 불가");
//        child2.childVal1 = 2;
        System.out.println("--------------------");
        System.out.println("Parent 멤버변수 접근 가능");
        child2.parentVal1 = 3;
        System.out.println("--------------------");
        System.out.println("Child 자식클래스 childMethod1() 호출 불가");
//        child2.childMethod1();
        System.out.println("--------------------");
        child2.metond();
        System.out.println("--------------------");
        child2.parentMethod1();
        System.out.println("--------------------");
    }


}
