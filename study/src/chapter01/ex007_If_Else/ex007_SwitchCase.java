package chapter01.ex007_If_Else;

public class ex007_SwitchCase {
    public static void main(String[] args) {


        // 스위치 케이스문 연습하기

        int ranking = 1;
        char medalColor;

        switch( ranking ) {
            case 1:
                medalColor = 'G';
                break;
            case 2:
                medalColor = 'S';
                break;
            case 3:
                medalColor = 'B';
                break;
            default:
                medalColor = 'A';
        }
        System.out.println( ranking + "등 메달의 색깔은 " + medalColor + " 입니다.");




        // 케이스문 동시에 사용하기

        int month = 5;
        int lastDay;

        switch ( month ) {
            case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
                lastDay = 31;
                break;
            case 4 : case 6 : case 9 : case 11 :
                lastDay = 30;
                break;
            case 2 :
                lastDay = 28;
                break;
            default :
                lastDay = 30;
                break;
        }
        System.out.println(month + "월의 마지막 날은 " + lastDay);


        // 스위치문 문자열로도 사용 가능
        String medal;
        medal = "Silver";

        switch ( medal ) {
            case "Gold":
                // 금메달
            case "Silver":
                // 은메달
            default:
                // 기본
        }
        // 이런식으로..


    }
}
