package day04;

import common.Base;

public class P1For {
    static void main() {
        Base.step("복붙x5");

        int i;
        for (i=0; i<5; i++)
            System.out.println("자니?");

        System.out.println(i);

        for ( ; i>0 ; i--)
            System.out.println("일어났니?");

        Base.step("변화 추적");

        for (int j=1; j<6; j++)
            System.out.println(j + " 번째 물어본다. 자니?");

        Base.step("0에서 시작하기");

        for (int j=0; j<5; j++)
            System.out.println(j + " 번째");
        for (int j=5; j>0; j--)
            System.out.println(j + " 번째");

        for (int j=2; j <11; j+=2)
            System.out.println(j + " 번째만세기");

        Base.step("배열 같이써보기");

        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        for (int j=0; j<7; j++)
            System.out.printf("%d일차 : %s\n", j, days[j]);

        Base.step("실습문제");
        for (int j=100; j>0; j--)
            System.out.printf("D-%d일\n", j);
        System.out.println("사람되기 성공!");


    }
}
