package chapter02.ex06_AbstractClass.ex05_GameLevel;

public class SuperLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("매우 빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("매우 높이 jump 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("한바퀴 돕니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 고급자 레벨 입니다. *****");
    }
}
