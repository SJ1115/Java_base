package day04;

import common.Base;

public class P3While {
    static void main() {
        Base.step(2, "while x5");

        int i=0;
        while(i<5){
            i ++;
            System.out.println( i+ "번째 자니?");
        }
        System.out.printf("연락끗 : %d회차\n", i+1);

        Base.step("목표는 100점");

        int goal = 100;
        int curr = 0;
        int day  = 0;

        while (curr < goal){
            day ++;

            int gain = 22;
            curr += gain;

            System.out.printf("%d일차 누적 호감도 %d\n", day, curr);
        }
        System.out.printf("총 %d일 소요\n", day);

        Base.step("무한루프");

        /*while (day >0){
            System.out.printf("%d\t", day);
            if (day > 10) break;
        }*/

        Base.step("while + Condition");

        goal = 200;
        curr = 0;
        day  = 0;
        int max_day = 14;

        while(curr < goal && day<max_day){
            day ++;
            int gain=18;

            curr += gain;
            System.out.printf("day %d : 누적 %d\n", day, curr);
        }

        if (curr >= goal){
            System.out.printf("목표 달성!!! %d일차!!\n", day);
        } else {
            System.out.printf("기한 초과...%d점 부족\n", goal-curr);
        }

        Base.step("For vs While");

        for (i=0; i<3; i++) System.out.println(i+1);

        i=0;
        while(i<3){
            i ++ ;
            System.out.println(i);
        }

        Base.step("실습");

        int budget, price, count;
        budget = 30000;
        price = 4000;
        count = 0;

        while(budget >= price){
            budget -= price;
            count ++;
            System.out.printf("%d번째 구매 : 잔액 %d\n", count, budget);
        }
        System.out.printf("총 %d개 구매: 잔액 %d\n", count, budget);


    }
}
