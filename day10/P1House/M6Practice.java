package day10.P1House;

import java.util.ArrayList;
import common.Base;

public class M6Practice {
    static void main() {
        Base.step(2, "이사후보");

        ArrayList<Residence> candidates = new ArrayList<>();   // 거주지를 담는 후보 명단
        candidates.add(new Studio("행복 원룸", 3000, 50));
        candidates.add(new Apartment("행복 아파트", 10000, 60, 15));
        candidates.add(new Villa("행복 빌라", 5000, 50, 10));
        System.out.println("후보 수: " + candidates.size());

        Base.step("후보비교");

        for (Residence r : candidates) {                     // 명단이 담은 부모 타입으로 한 칸씩
            int sc = 0;
            if (r instanceof Scorable) {                    // 이 후보가 점수 약속을 지켰는지 확인
                sc = ((Scorable) r).score();                 // 점수 약속 타입으로 바꿔 점수 메서드 호출
            }
            System.out.println(r.info() + " 점수 " + sc);
        }

        Base.step("반려동물 가능후보");

        for (Residence r : candidates) {
            if (r instanceof PetFriendly) {                    // 이 후보가 반려동물 약속을 지켰는지 확인
                System.out.println(r.address + " — 반려동물 가능");
            }
        }

        Base.step("실습");

        candidates.add(new OfficeTel("행복 오피스텔", 7000, 55, 10));

        for (Residence r : candidates) {                     // 명단이 담은 부모 타입으로 한 칸씩
            int sc = 0;
            if (r instanceof Scorable) {                    // 이 후보가 점수 약속을 지켰는지 확인
                sc = ((Scorable) r).score();                 // 점수 약속 타입으로 바꿔 점수 메서드 호출
            }
            System.out.println(r.info() + " 점수 " + sc);
        }

    }
}
