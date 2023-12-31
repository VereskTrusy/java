package chapter02.ex06_AbstractClass.ex05_GameLevel;

public class BeginnerLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("jump 할 수 없습니다.");
    }

    @Override
    public void turn() {
        System.out.println("Turn 할 수 없습니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 초보자 레벨 입니다. *****");
    }
}
