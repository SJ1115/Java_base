package day10.P1House;

import common.Base;

public class M3Interface {
    static void main() {
        Base.step(2, "거주지 점수");

        Studio s = new Studio("행복 원룸", 3000, 50);
        System.out.printf("%s 점수 %d\n", s.info2(), s.score());

        Base.step("약속 타입으로");

        Scorable sc = new Apartment("행복 아파트", 10000, 60, 15);

        System.out.printf("점수 : %d\n", sc.score());

        Base.step("실습");

        Villa v = new Villa("행복 빌라", 5000, 50, 10);
        System.out.printf("%s 점수 %d\n", v.info2(), v.score());

    }
}
