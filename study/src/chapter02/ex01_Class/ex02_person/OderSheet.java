package chapter02.ex01_Class.ex02_person;

/**
 * 주문서 클래스
 */
public class OderSheet {

    // 연습 쇼핑몰 주문 내용 출력하기
    // 주문서 클래스

    /**
     * 주문번호
     */
    private String oderNumber;

    /**
     * 주문자 아이디
     */
    private String odererId;

    /**
     * 주문자 이름
     */
    private String odererName;

    /**
     * 주문날짜
     */
    private String oderDate;

    /**
     * 주문상품번호
     */
    private String oderGoodsNumber;

    /**
     * 배송지 주소
     */
    private String deliveryAddress;

    public String getOderNumber() {
        return oderNumber;
    }

    public void setOderNumber(String oderNumber) {
        this.oderNumber = oderNumber;
    }

    public String getOdererId() {
        return odererId;
    }

    public void setOdererId(String odererId) {
        this.odererId = odererId;
    }

    public String getOdererName() {
        return odererName;
    }

    public void setOdererName(String odererName) {
        this.odererName = odererName;
    }

    public String getOderDate() {
        return oderDate;
    }

    public void setOderDate(String oderDate) {
        this.oderDate = oderDate;
    }

    public String getOderGoodsNumber() {
        return oderGoodsNumber;
    }

    public void setOderGoodsNumber(String oderGoodsNumber) {
        this.oderGoodsNumber = oderGoodsNumber;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
