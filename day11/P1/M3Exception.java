package day11.P1;

import common.Base;

public class M3Exception {
    static void order(Product p, int qty) throws OutOfStockException{
        if (qty > p.stock){
            String error = "%s 재고 부족(재고 %d, 주문 %d)".formatted(
                    p.name, p.stock, qty);
            throw new OutOfStockException(error);
        }

        p.stock -= qty;

        System.out.printf("%s %d 개 주문 완료(재고 : %d)\n", p.name, qty, p.stock);
    }

    static void main() {
        Base.step(3, "정상 주문");

        Product tee = new Product("반팔 티셔츠", 19000, 3);

        try{
            order(tee, 2);
        } catch (OutOfStockException e){
            System.out.printf("주문 실패 - error (%s)\n", e.getMessage());
        }

        Base.step("재고 초과");

        Product shoes = new Product("운동화", 59000, 1);

        try{
            order(shoes, 2);
        } catch (OutOfStockException e){
            System.out.printf("주문 실패 - error (%s)\n", e.getMessage());
        }

        Base.step("실습");

        Product jeans = new Product("청바지", 82000, 2);

        try{
            order(jeans, 1);
        } catch (OutOfStockException e){
            System.out.printf("주문 실패 - error (%s)\n", e.getMessage());
        }

        try{
            order(jeans, 2);
        } catch (OutOfStockException e){
            System.out.printf("주문 실패 - error (%s)\n", e.getMessage());
        }

    }
}
