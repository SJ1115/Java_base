package day04;

import common.Base;

public class homework {
    static void main() {
        Base.step("푸드코드 기본 정보");

        String restaurant = "SkyMall Food Court";
        String manager = "SungJu Lee";
        int store = 12;
        int goal_day =   5000000;
        int goal_mon = 120000000;

        System.out.printf(
                "푸드코드 : %s\n관리자 : %s\n매장 수 : %d\n" +
                "일일 목표 : %d 원\n 월 목표 : %d 원\n",
                restaurant, manager, store, goal_day, goal_mon
        );

        Base.step("30일 영업 미션");

        for (int i=1; i<31; i++){
            System.out.printf("%2d일 차 -  %s 영업 시작\n", i, restaurant);
        }

        Base.step("일주일 매출");

        int[] week_sales = {4800000, 5200000, 4600000, 5500000, 4900000, 6200000, 5800000};
        int sum=0;
        double mean;

        for (int sale : week_sales ) sum += sale;
        mean = (double) sum / week_sales.length;

        System.out.printf("일주일 매출 : %d W\n평균매출 %.2f W\n",
                sum, mean);

        Base.step("월 목표까지 ?일");

        int daily_sales = 5285000;
        int days = 0;
        int cum_sales = 0;

        while (cum_sales < goal_mon){
            days ++;
            cum_sales += daily_sales;
        }
        System.out.printf(
                "%d일 후 %d W 달성(목표 : %d W)\n",
                days, cum_sales, goal_mon
        );

        Base.step("주차별 카테고리");

        String[] categories = {"한식", "중식", "일식"};

        for (int i=1; i<5; i++){
            System.out.printf("--- %d 주 차 ---\n", i);
            for (String cat : categories){
                System.out.printf("%s 카테고리 : 인기 메뉴 입고\n",
                        cat);
            }
        }

        Base.step("휴무 제외 합계");

        int[] store_sales = {450000, 380000, 0, 520000, 410000, 0, 490000, 380000, 410000, 470000};
        int store_count=0;
        int store_sum = 0;

        for (int sales : store_sales){
            if (sales > 0){
                store_sum += sales;
                store_count ++;
            }
        }

        System.out.printf("영업 매장 : %d 개\n매출 합계 : %d\n",
                store_count, store_sum);

        Base.step("일일 목표 달성 시 종료");

        double[] month_sales = {4800000, 4500000, 4900000, 5200000, 4800000, 5500000,
                4700000, 4900000, 5100000, 5000000, 5400000, 4600000,
                4900000, 5300000, 5700000, 4800000, 5100000, 5000000,
                4900000, 5200000, 5500000, 5100000, 4800000, 5000000,
                5300000, 5400000, 4900000, 5200000, 5800000, 6000000};

        int day_reached;

        for (int i=0; i<month_sales.length;  i++){
            double temp = month_sales[i];

            if (temp > (double)goal_day){
                day_reached = i+1;
                System.out.printf("%d일 차 - %.1f W 달성!\n", day_reached, temp);
                break;
            }
        }

        Base.step("매장 등급");

        char grade;
        String desc;

        int store_revenue = 350000;

        if (store_revenue < 1000000){
            grade = 'C';
            desc = "지원 필요";
        } else if (store_revenue < 3000000){
            grade = 'B';
            desc = "안정";
        } else if (store_revenue < 5000000){
            grade = 'A';
            desc = "우수";
        } else {
            grade = 'S';
            desc = "프리미엄";
        }

        System.out.printf(
                "%d W --> %c 등급 ( %s )\n",
                store_revenue, grade, desc);

        Base.step("대표 메뉴");

        String category  ="일식";

        String menu;
        switch (category){
            case "일식":
                menu = "라멘";
                break;
            default:
                menu = "추천 메뉴 없음";
        }

        System.out.printf("%s 카테고리 인기 메뉴 : %s\n", category, menu);
    }
}
