package day11.P1;

import common.Base;

public class M1Error {
    static void intConverterWException(String input){
        try {
            int qty = Integer.parseInt(input);
            System.out.printf("주문 수량 : %d\n", qty);
        } catch (NumberFormatException e) {
            System.out.printf("숫자로 입력해주세요.\n입력값 : %s\n", input);
        }
        System.out.println("다음 안내");
    }
    static void main() {
        Base.step(2, "상품 목록");

        Product[] products = new Product[3];

        products[0] = new Product("반팔 티셔츠", 19000, 3);
        products[1] = new Product("청바지", 39000, 2);
        products[2] = new Product("운동화", 59000, 1);

        for (int i=0;i<3;i++){
            System.out.printf("%d 번 상품 %s\n", i, products[i].info());
        }

        Base.step("없는 상품 번호");

        //System.out.println(products[4].info());
        System.out.println("ArrayIndexOutOfBoundsException");

        Base.step("Null(없는 상품)");

        //System.out.println("고른 상품 : " + products[3]);
        System.out.println("NullPointerException");


        Base.step("타입오류(수량에 글자)");

        String input = "두개";
        //int quantity = Integer.parseInt(input);
        System.out.println("NumberFormatException");

        ////////////// Process 2 ///////////////////

        Base.step(2, "정상 수량");

        Product picked = products[0];

        System.out.printf("고른 상품 : %s\n", picked.info());

        input = "2";
        int quantity = Integer.parseInt(input);
        System.out.println("주문 수량: " + quantity);
        System.out.println("주문 접수 완료");


        Base.step("잘못된 수량");

        intConverterWException("두 개");

        Base.step("안전망 통과");

        intConverterWException("3");

        Base.step("실습");

        intConverterWException(" ");

    }
}
