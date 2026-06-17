package day10.P1House;

import common.Base;
import java.util.ArrayList;

public class M4ListInterface {
    static void main() {
        Base.step(2, "후보 명단");

        ArrayList<Scorable> candidates = new ArrayList<>();

        candidates.add(
                new Studio("행복 원룸", 3000, 50)
        );
        candidates.add(
                new Apartment("행복 아파트", 10000, 60, 15)
        );
        candidates.add(
                new Villa("행복 빌라", 5000, 50, 10)
        );

        System.out.printf("후보 수, %d\n",  candidates.size());

        Base.step("후보별 점수");

        for(Scorable s : candidates){
            System.out.printf("점수 : %d\n", s.score());
        }

        Base.step("실습");

        for(Scorable s : candidates){
            if (s instanceof Studio) {
                System.out.printf("원룸 후보 : 점수 %d\n", s.score());
            }
        }
    }
}
