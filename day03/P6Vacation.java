package day03;

public class P6Vacation {
    static void main() {
        base.step(2, "휴가 정보");

        String name;
        String destination;

        int age, days, budget, days_of_trip;
        double temperature, humidity, temperature_perceive;
        boolean is_EB, is_student, is_member;

        name = "이성주";
        destination = "강릉";

        age = 28;
        days = 4;
        budget = 800000;
        days_of_trip = 3;

        temperature = 30;
        humidity = 62;

        is_EB = true;
        is_student = false;
        is_member = true;

        temperature_perceive = temperature + humidity*.05;

        //check
        System.out.printf("name : %s\tdestination : %s\n", name, destination);
        System.out.printf("age : %d\nvacation day : %d\'th in %d days\nbudgets : %d\n", age, days_of_trip, days, budget);
        System.out.printf("Feels' temperature : %.2f\n", temperature_perceive);

        base.step("날씨(폭염) 정보");

        String heat_stage, heat_action;

        if (temperature_perceive < 28){
            heat_stage  = "일상";
            heat_action = "자유로운 활동";
        } else if (temperature_perceive < 31){
            heat_stage  = "관심";
            heat_action = "가벼운 운동";
        } else if (temperature_perceive < 33){
            heat_stage  = "주의";
            heat_action = "야외활동 조심";
        } else if (temperature_perceive < 35){
            heat_stage  = "경고";
            heat_action = "물 자주 마시기";
        } else { // >= 35
            heat_stage  = "이상";
            heat_action = "외출 자제";
        }

        System.out.printf("현재 체감온도 %.2f.\n폭염단계 [%s], 권장 행동 : %s\n", temperature_perceive, heat_stage, heat_action);

        base.step("티켓 정보");

        int base_price, early_price, ticket_final;
        base_price = 120000;

        early_price = is_EB ? 88000 : base_price;
        ticket_final = (is_EB && is_student)
                  ? (int)(early_price * .85)
                  : early_price;

        System.out.printf("얼리버드 : %b\n학생할인 %b\n최종 티켓 가격 : %d\n", is_EB, is_student, ticket_final);

        base.step("휴양 계획");

        String activity, meal;

        switch (days_of_trip) {
            case 1:
                activity = "도착 + 해변 산책";
                meal = "도착 환영 — 회 + 막국수";
                break;
            case 2:
                activity = "____";
                meal = "____";
                break;
            case 3:
                activity = "카페거리 + 일몰 명소";
                meal = "디너 — 곱창 + 하이볼";
                break;
            case 4:
                activity = "장보기 + 마지막 해변";
                meal = "야식 — 호텔 룸서비스";
                break;
            default:
                activity = "자유 일정";
                meal = "—";
        }

        System.out.printf("활동 : %s\n식사 : %s\n", activity, meal);

        base.step("숙박 예산");

        int hotel_p_day = is_member ? 120000 : 150000;
        int hotel_total = hotel_p_day * (days - 1);  // 4박 5일이면 3박

// 빈칸 ②: 호텔 등급 — else if 다중 분기
        String room_tier;
        if (hotel_p_day >= 200000) {
            room_tier = "Luxury";
        } else if (hotel_p_day >= 130000) {
            room_tier = "Premium";
        } else {
            room_tier = "Standard";
        }

        int spent = hotel_total + ticket_final;

        boolean is_budget_over = spent > budget;

        System.out.printf("1박 가격 : %d W ( %s 룸)\n%d박 호텔 : %d W\n" +
            "페스티벌 + 호텔 총: %d W\n예산초과 : %b\n남은 예산 %d -> 추가 쇼핑 가능",
                hotel_p_day, room_tier, days, hotel_total, spent, is_budget_over, (budget-spent));

        base.step("** 여행 카드 **");

        System.out.printf("********* %s 님의 %s 휴가 **********\n", name, destination);
        System.out.printf("현재 체감온도 %.2f  -> 폭염단계 [%s]\n", temperature_perceive, heat_stage);
        System.out.printf("%d일의 활동 : %s\n오늘의 식사 : %s\n", days_of_trip, activity, meal);
        System.out.printf("1박 가격 : %d W ( %s 룸)\n%d박 호텔 : %d W\n" +
                        "페스티벌 + 호텔 총: %d W\n예산초과 : %b\n남은 예산 %d\n",
                hotel_p_day, room_tier, days, hotel_total, spent, is_budget_over, (budget-spent));

        int a = 1;
        boolean isMember = true;
        int x1 = (a > 0) ? 100 : 50;
        int x2 = isMember ? 100 : 0;
        int x3  = (a == 1) ? 'a' : 'B';
        String x4 = (a > 0) ? "양수" : "음수";


        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);

    }
}
