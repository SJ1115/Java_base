package day11.P1;

import common.Base;

public class M4Practice {
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

        Base.step(2, "상품 진열");

        Product[] products = {
                new Product("반팔 티셔츠", 19000, 3),
                new Product("청바지", 39000, 2),
                new Product("운동화", 59000, 1)
        };
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + "번 " + products[i].info());
        }

        Base.step("주문 시작");

        /*String[][] orders = {
                {"0", "2"}
        };

        int idx = 0;
        while (idx < orders.length) {
            try{
                String numText = orders[idx][0];
                String qtyText = orders[idx][1];
                System.out.println("[주문 요청] 번호 " + numText + " / 수량 " + qtyText);

                int num = Integer.parseInt(numText);     // 글자 번호 → 숫자
                int qty = Integer.parseInt(qtyText);     // 글자 수량 → 숫자
                Product target = products[num];
                order(target, qty);
            } catch (OutOfStockException e) {int num=0;}

            idx = idx + 1;
        }*/

        Base.step("안전 주문");

        String[][] orders = {
                {"0", "2"},
                {"1", "다섯"},
                {"5", "1"},
                {"2", "3"}
        };

        int idx = 0;
        while (idx < orders.length) {
            String numText = orders[idx][0];
            String qtyText = orders[idx][1];
            System.out.println();
            System.out.println("[주문 요청] 번호 " + numText + " / 수량 " + qtyText);
            try {                                          // 위험한 코드를 감싸는 블록
                int num = Integer.parseInt(numText);
                int qty = Integer.parseInt(qtyText);
                Product target = products[num];
                order(target, qty);
            } catch (NumberFormatException e) {                              // 수량에 글자 → 변환 실패
                System.out.println("주문 실패: 수량은 숫자로 입력하세요");
            } catch (ArrayIndexOutOfBoundsException e) {                              // 없는 상품 번호 → 배열 범위 초과
                System.out.println("주문 실패: 없는 상품 번호입니다");
            } catch (OutOfStockException e) {                              // 재고 초과 → 우리가 던진 예외
                System.out.println("주문 실패: " + e.getMessage());
            } finally {                                        // 예외 여부와 무관하게 항상 실행
                System.out.println("주문 한 건 처리 종료");
            }
            idx = idx + 1;
        }


        Base.step("실습");

        String[][] orders2 = {
                {"0", "0"},
                {"1", "1"}
        };

        idx = 0;
        while (idx < orders2.length) {
            String numText = orders2[idx][0];
            String qtyText = orders2[idx][1];
            System.out.println();
            System.out.println("[주문 요청] 번호 " + numText + " / 수량 " + qtyText);
            try {                                          // 위험한 코드를 감싸는 블록
                int num = Integer.parseInt(numText);
                int qty = Integer.parseInt(qtyText);
                Product target = products[num];

                if (qty<=0){
                    throw new IllegalArgumentException("수량은 1개 이상이어야 합니다");
                }

                order(target, qty);
            } catch (NumberFormatException e) {                              // 수량에 글자 → 변환 실패
                System.out.println("주문 실패: 수량은 숫자로 입력하세요");
            } catch (ArrayIndexOutOfBoundsException e) {                              // 없는 상품 번호 → 배열 범위 초과
                System.out.println("주문 실패: 없는 상품 번호입니다");
            } catch (OutOfStockException e) {                              // 재고 초과 → 우리가 던진 예외
                System.out.println("주문 실패: " + e.getMessage());
            } catch (IllegalArgumentException e){
                System.out.println("주문 실패: " + e.getMessage());
            }finally {                                        // 예외 여부와 무관하게 항상 실행
                System.out.println("주문 한 건 처리 종료");
            }
            idx = idx + 1;
        }

    }
}
