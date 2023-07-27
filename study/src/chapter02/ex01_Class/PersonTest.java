package chapter02.ex01_Class;

public class PersonTest {
    public static void main(String[] args) {

        // 연습 김덕배 출력하기

        Person kimDuck = new Person();

        // 김덕배 신상 정보 세팅
        kimDuck.setName("김덕배");
        kimDuck.setAge(45);
        kimDuck.setMarried(false);
        kimDuck.setChild(0);

        // 김덕배 신상 정보 출력
        System.out.println( "이름    : " + kimDuck.getName() );
        System.out.println( "나이    : " + kimDuck.getAge() );
        System.out.println( "결혼여부 : " + kimDuck.getMarried() );
        System.out.println( "자식수   : " + kimDuck.getChild() );
        System.out.println();


        // 연습 쇼핑몰 주문 내용 출력하기
        // 주문 내용에 대한 클래스를 만들고 주문내용을 인스턴스로
        // 생성한 후 출력해보기
        OderSheet kimDuckOderSheet = new OderSheet();

        // 김덕배의 주문내용 세팅
        kimDuckOderSheet.setOderNumber("202307272330");
        kimDuckOderSheet.setOdererId("CuteDuckS2");
        kimDuckOderSheet.setOdererName("김덕배");
        kimDuckOderSheet.setOderDate("2023/07/27 11:36");
        kimDuckOderSheet.setOderGoodsNumber("PD0345-4885");
        kimDuckOderSheet.setDeliveryAddress("서울특별시 불당동 휘발류 1번지");


        // 김덕배씨 주문내용 출력하기
        System.out.println("주문번호 : " + kimDuckOderSheet.getOderNumber());
        System.out.println("주문자 아이디 : " + kimDuckOderSheet.getOdererId());
        System.out.println("주문자 이름 : " + kimDuckOderSheet.getOdererName());
        System.out.println("주문 일자 : " + kimDuckOderSheet.getOderDate());
        System.out.println("주문 상품 번호 : " + kimDuckOderSheet.getOderGoodsNumber());
        System.out.println("배송지 주소 : " + kimDuckOderSheet.getDeliveryAddress());


    }
}
