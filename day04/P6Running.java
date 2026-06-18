package day04;

import common.Base;

public class P6Running {

    static void main() {
        int goalAffection = 2000;  // 한 달 누적 목표

        String name = "이성주";
        int goal = 2000;


        int[] affection = {
                80, 0, 75, 85, 0, 90, 100,        // 1~7일
                65, 70, 0, 88, 95, 0, 100,         // 8~14일
                72, 78, 80, 0, 92, 0, 100,         // 15~21일
                75, 0, 85, 88, 70, 0, 95,          // 22~28일
                80, 90                              // 29~30일
        };

        boolean[] fight = {
                false, true, false, false, true, false, false,
                false, false, true, false, false, true, false,
                false, false, false, true, false, true, false,
                false, true, false, false, false, true, false,
                false, false
        };

        System.out.printf("사용자 : %s\n목표점수 : %d\n기록일수 :%d\n", name, goal, affection.length);

        int total = 0;
        int contact_days = 0;
        int silent_days = 0;

        for (int i = 0; i < affection.length; i++) {
            if (affection[i] == 0) {
                silent_days++;  // 침묵한 날 카운트 증가
            } else {
                total += affection[i];  // 호감도 누적
                contact_days ++;  // 연락 일수 카운트 증가
            }
        }

        double mean_affection = (double) total / contact_days;  // 정수 나누기 함정 회피

        System.out.printf("총 호감도 : %d\n연락일수 : %d일 / 침묵 %d일\n평균 호감도 : %.4f\n", total, contact_days, silent_days, mean_affection);


        int max_score = 0;
        int min_score = 99;

        for (int i=0; i<affection.length; i++){
            int a = affection[i];

            if (a>max_score){
                max_score = a;
            }

            if (a < min_score && 0 < a){
                min_score = a;
            }
        }

        String comment;
        if (total >= goal){
            comment = "목표 달성(초과 %d점)".formatted(total-goal);
        } else {
            comment = "목표 미달(%d점 부족)".formatted(goal-total);
        }

        System.out.printf("최고/최저 : ( %d / %d )\n", max_score, min_score);
        System.out.println(comment);

        int peaceScore = 0;
        int peaceDays = 0;

        for (int i = 0; i < affection.length; i++) {
            if (fight[i]) {
                continue;  // 싸운 날 스킵
            }
            if (affection[i] == 0) {
                continue;  // 침묵한 날도 스킵
            }
            peaceScore += affection[i];
            peaceDays++;
        }

        System.out.printf("!싸움 && 연락 일수 : %d일(%d)\n", peaceDays, peaceScore);

        String grade;

        if (mean_affection >= 95){
            grade = "최고";
        } else if (mean_affection >= 85){
            grade = "안정";
        } else if (mean_affection >= 70){
            grade = "보통";
        } else if (mean_affection >= 50){
            grade = "위기";
        } else {
            grade = "이별 위험";
        }

        String advice;
        switch (grade){
            case "최고":
            case "안정":
                advice = "지금처럼 유지, 이벤트 한 번";
                break;
            case "보통":
                advice = "주말 데이트 늘리기";
                break;
            case "위기":
                advice ="긴 대화, 진심 어린 사과";
                break;
            default:
                advice = "관계 재정립 필요";
        }
        System.out.printf("현재 관계 등급 : %s\n다음 달의 조언 : %s\n",
                grade, advice);
    }
}
