package ex02;

public class Super_Level implements LevelState{
    public Super_Level() {
    }
    public void jump() {
        System.out.println("아주 높이 jump 합니다.");
    }
    public void run() {
        System.out.println("엄청 빨리 달립니다.");
    }
    public void turn() {
        System.out.println("한 바퀴 돕니다.");
    }
}
