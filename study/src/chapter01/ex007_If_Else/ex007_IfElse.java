package chapter01.ex007_If_Else;

public class ex007_IfElse {
    public static void main(String[] args) {


        // 조건문
        int age2 = 36;

        if( age2 > 30 ) { // 30살이 넘으면 회사 안가도 돈줌
            System.out.println("회사에 가지 않습니다.");
        } else {
            System.out.println("회사에 가지 않습니다.2");
        }


        // 놀이공원 입장료 계산
        // 취학전 아동 8살 미만 1000원
        // 초등학생 14살 미만 2000원
        // 중.고등학생 20살 미만 2500원
        // 그이상 3000원
        // 나는 정신연령 초딩이니까 2000원만 낼게요!

        int age;
        int charge;

        age = 15; // 정신연령 대입

        if( age < 8 ) { // 취학전 아동 8살 미만 1000원
            charge = 1000;
            System.out.println("취학 전 아동 ");
        }
        else if ( age < 14 ) {// 초등학생 14살 미만 2000원
            charge = 2000;
            System.out.println("초등학생 ");
        }
        else if ( age < 20 ) { // 중.고등학생 20살 미만 2500원
            charge = 2500;
            System.out.println("중.고등학생 ");
        }
        else if ( age < 60 ){ // 그이상 3000원
            charge = 3000;
            System.out.println("그이상 ");
        }
        else {
            charge = 0;
            System.out.println("경로우대 ");
        }
        System.out.println("입장료 : " + charge + "원 입니다.");
    }
}
