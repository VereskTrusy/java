package chapter02.ex05_Polymorphism.ex03_Polymorphism;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {


        /*
        시나리오 :
        이 회사 고객은 현재 5명이다
        5명 중 VIP 1명 , gold 2명, silver 2명이다
        고객들이 각각 10000원짜리 샀을때 가격이랑 보너스 계산 해라
        */


        ArrayList<Customer> customerList = new ArrayList<Customer>();

        // 고객 생성
        Customer vipKing = new VIPCustomer(10001, "왕천", 8080);
        Customer goldKim = new GoldCustomer(10101, "김순대");
        Customer goldJang = new GoldCustomer(10102, "장춘장");
        Customer silverPark = new Customer(10201, "박국밥");
        Customer silverLee = new Customer(10202, "이오뎅");


        // 리스트에 담기
        customerList.add(vipKing);
        customerList.add(goldKim);
        customerList.add(goldJang);
        customerList.add(silverPark);
        customerList.add(silverLee);

        System.out.println("======== 고객 정보 출력 ========");
        for ( Customer customer : customerList ) {
            System.out.println( customer.showCustomorInfo() );
        }


        System.out.println("======== 할인율과 보너스 포인트 출력 ========");

        double price = 10000;

        for ( Customer customer : customerList ) {
            System.out.println(customer.customerName + " 님, 가격 : " + customer.calPrice(price) + ", 보너스 : " + customer.getBonusPoint() );

        }

    }
}
