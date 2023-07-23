package chapter01.ex006_Operator;

public class ex006_Operator02 {
    public static void main(String[] args) {

        // 산술 연산자를 이용하여 총점과 평균 구하기
        int mathScore = 80;
        int engScore = 30;

        int korScore = 50;

        // 총점
        int totalScore = mathScore + engScore + korScore;
        System.out.println(totalScore);

        // 평균
        double averageScore = totalScore / 3.0;
        System.out.println(averageScore);
    }
}
