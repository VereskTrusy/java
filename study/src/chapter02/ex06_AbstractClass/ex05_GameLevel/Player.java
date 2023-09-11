package chapter02.ex06_AbstractClass.ex05_GameLevel;

public class Player {

    // 멤버변수
    private PlayerLevel level;

    // 생성자
    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    // get 레벨
    public PlayerLevel getLevel(){
        return level;
    }

    // 레벨 업
    public void upgradeLevel(PlayerLevel level){
        this.level = level;
        level.showLevelMessage();
    }

    // 플레이
    public void play(int count){
        level.go(count);
    }
}
