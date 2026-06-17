package day11.H1;

import common.Base;
import java.util.Scanner;

public class Main1Camping {

    static void main() {
        //1
        Base.step("진열대 만들기");

        Gear[] rack = new Gear[3];

        rack[0] = new Gear("텐트", 15000, 3);
        rack[1] = new Gear("랜턴", 4000, 5);
        rack[2] = new Gear("침낭", 6000, 4);

        for(Gear g : rack){
            System.out.printf("%s\n",g.info());
        }

        //2
        Base.step("없는 번호");
        //System.out.printf("%s\n",rack[5].info());

        //3
        Base.step("수량에 글자");
        //System.out.printf("%d\n", Integer.parseInt("두개"));

        //4
        Base.step("안 죽게 잡기");

        String input = "두 개";

        try {
            int qty = Integer.parseInt(input);
            System.out.printf("주문 수량 : %d\n", qty);
        } catch (NumberFormatException e) {
            System.out.print("수량은 숫자로 입력해주세요.\n");
        }
        System.out.println("다음 안내");

        //5
        Base.step("없는 번호");


        int pick = 5;
        try {
            System.out.printf("제품 : %s\n", rack[pick].info());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.printf("%d 번 장비는 진열대에 없습니다.\n", pick);
        }
        System.out.println("조회를 마칩니다.");

        //6
        Base.step("마무리는 항상");

        String qtyText= "5";
        try{
            int qty = Integer.parseInt(qtyText);

            Gear picked = rack[qty];

            System.out.printf("%d번 품목 : %s\n", qty, picked.info());
        } catch (NumberFormatException e) {
            System.out.println("수량은 숫자로 입력해주세요");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("장비 번호가 진열대 범위를 벗어났습니다");
        } finally {
            System.out.println("대여 시도 종료");
        }

        //7
        Base.step();

        //8
        Base.step();

        //9
        Base.step();

        //10
        Base.step();

    }
}
