package day04;

import common.Base;

public class P5Break {
    static void main() {
        Base.step(2, "break in 5");

        for (int i=0; i<10; i++){
            if (i==5) {
                System.out.printf("i=%d에서 끗\n", i);
                break;
            }

            System.out.printf("i=%d\n",i);
        }

        Base.step("짝수 건너뛰기");

        for (int i=1; i<10; i++){
            if (i%2==0) continue;

            System.out.printf("i=%d\n",i);
        }

        Base.step("싸운날 스킵하기");

        int[] weekAffection = {80, 95, 30, 85, 20, 100, 75};      // 일별 호감도
        boolean[] isFight = {false, false, true, false, true, false, false};  // 싸운 날

        int sum=0;
        int days=0;

        for (int i=0; i<weekAffection.length; i++){
            if (isFight[i]){
                System.out.printf("\t%d일차는 싸웠으니 제외\n", i+1);
                continue;
            }
            sum += weekAffection[i];
            days ++;
            System.out.printf("%d일차 호감도 : %d\n", i+1, weekAffection[i]);
        }

        System.out.printf("정상 %d 일, 합계 %d\n", days, sum);

        Base.step("200점 채우기");

        double[] monthGain = {25.5, 28.0, 22.3, 30.1, 18.5, 27.8, 31.2, 24.0};

        double goal = 200;
        double cuml = 0;
        int week = 0;

        for(int i=0; i<monthGain.length; i++){
            cuml += monthGain[i];

            System.out.printf("%d일차 누적 점수 : %.1f\n", i+1, cuml);

            if (cuml >= goal){
                week = i+1;
                System.out.printf("    고백공격!\n");
                break;
            }
        }
        System.out.printf("%d주 만에 %.1f점 달성!!\n", week, cuml);

        Base.step("While true with break");

        int round=0;

        while (true){
            round ++;
            System.out.printf("%d 라운드 진행완료!\n", round);
            if (round >=3){
                break;
            }
        }

        Base.step("실습");

        int sent = 0;
        int limit = 100;

        for (int i=1; i<=100; i++){
            sent += 3;
            System.out.printf("%d번째\t신청자 - 누적 발생 %d개\n", i, sent);

            if (sent >= limit){
                System.out.printf("\t%d 번째 신청자에서 종료...\n", i);
                break;
            }
        }
    }
}
