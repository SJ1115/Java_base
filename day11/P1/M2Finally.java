package day11.P1;

import common.Base;

public class M2Finally {

    static void tryCatch(Product[] products, int no, String qtyInput){
        try {
            Product picked = products[no];
            int qty = Integer.parseInt(qtyInput);
            System.out.println("고른 상품: " + picked.info());
            System.out.println("주문 수량: " + qty);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("없는 상품 번호예요. 번호를 다시 확인해 주세요.");
        } catch (NumberFormatException e) {
            System.out.println("수량은 숫자로 입력해 주세요.");
        } finally {
            System.out.println("주문 시도 종료");
        }
    }

    static void main() {
        Base.step(2, "정상 주문");

        Product[] products = new Product[3];
        products[0] = new Product("반팔 티셔츠", 19000, 3);
        products[1] = new Product("청바지", 39000, 2);
        products[2] = new Product("운동화", 59000, 1);

        tryCatch(products, 1, "2");

        Base.step("번호 오류");

        tryCatch(products, 3, "2");

        Base.step("수량 글자 오류");

        tryCatch(products, 1, "둘");

        Base.step("실습");

        tryCatch(products, 5, "둘");
    }
}
