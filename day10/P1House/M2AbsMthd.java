package day10.P1House;

import common.Base;

public class M2AbsMthd {
    static void main() {

        Base.step(2, "원룸 월 비용");

        Studio s = new Studio("행복 원룸", 3000, 50);

        System.out.println(s.info2());
        System.out.printf("월 비용만 %d\n", s.monthlyCost());

        Base.step("아파트/빌라 월 비용");

        Apartment a = new Apartment("행복 아파트", 10000, 60, 15);
        Villa v = new Villa("행복 빌라", 5000, 50, 10);

        System.out.printf("%s\n%s\n", a.info2(), v.info2());

        Base.step(5,"실습");

        OfficeTel o = new OfficeTel("행복오피스텔", 7000, 70, 15);

        System.out.println(o.info2());
    }
}

