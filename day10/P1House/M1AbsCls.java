package day10.P1House;

import common.Base;

public class M1AbsCls {
    static void main() {
        Base.step(2, "자식으로 거주지 만들기");

        Studio s = new Studio("행복원룸", 3000);

        // Residence f1 = new Residence("가짜방", 0);

        System.out.println(s.info());

        Base.step(4, "자식 추가 - 아파트");

        Residence a = new Apartment("행복아파트", 10000);

        System.out.println(a.info());

        Base.step("실습");

        Residence v = new Villa("행복빌라", 5000);

        System.out.println(v.info());

    }
}
