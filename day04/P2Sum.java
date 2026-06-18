package day04;

import common.Base;

public class P2Sum {

    static void main() {
        Base.step(2, "1 to 10");

        int sum=0;
        for (int i=0; i<10; i++){
            sum += i+1;
        }
        System.out.printf("Sum : %d\n", sum);

        Base.step("호감도 합계");

        int[] weekAffection = {80, 0, 95, 0, 88, 100, 75};

        sum = 0;
        for (int i=0; i<7; i++){
            sum += weekAffection[i];
            System.out.printf("day %d : %d\t : sum %d\n", i+1, weekAffection[i], sum);
        }

        System.out.println(sum);

        System.out.println("평균(miss) : " + sum/7);
        System.out.println("평균(real) : " + (double)sum/7);

        Base.step("호감도 오류정정");

        sum = 0;
        int count = 0;
        for (int i=0; i<7; i++){

            if (weekAffection[i]>0) {
                sum += weekAffection[i];
                count += 1;
            }
        }

        System.out.printf("%d일 동안의 호감도 평균 %f\n", count, (double)sum/count);

        Base.step("최저/최고기록");

        int max = 0;
        int min = 999;
        count = 0;

        for (int i=0; i<7; i++){
            int t = weekAffection[i];

            if (t>0){
                if (t >= max) {
                    max = t;
                    if (t == 100) count ++;
                }

                if (t < min) min = t;
            }
        }

        System.out.printf("만점 : %d 회 달성\n최고 : %d 점\n최저 : %d 점\n", count, max, min);

        Base.step(8, "실습");
        int[] weekCall = {15, 0, 30, 25, 0, 45, 20};

        sum = 0;
        count = 0;
        double mean = 0;

        for(int i=0; i<weekCall.length; i++){
            int t = weekCall[i];

            if (t>0){
                count ++;
                sum += t;
            }
        }

        mean = (double) sum / count;

        System.out.printf("통화 : %d일 진행\n통화 시간 합계 : %d\n평균 통화 시간 : %f\n", count, sum, mean);

    }
}
