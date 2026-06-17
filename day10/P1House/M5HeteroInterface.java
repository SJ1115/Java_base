package day10.P1House;

import common.Base;
import java.util.ArrayList;

public class M5HeteroInterface {
    static void main() {
        Base.step(2, "후보 정보");

        ArrayList<Residence> candidates = new ArrayList<>();
        candidates.add(new Studio("행복 원룸", 3000, 50));
        candidates.add(new Apartment("행복 아파트", 10000, 60, 15));
        candidates.add(new Villa("행복 빌라", 5000, 50, 10));
        for (Residence r : candidates) {
            System.out.println(r.info2());
        }

        Base.step("반려동물 가능");

        for (Residence r : candidates) {
            if (r instanceof PetFriendly){
                System.out.printf("%s : 반려동물 가능\n", r.address);
            }
        }

        Base.step("실습");

        for (Residence r : candidates) {
            if (r instanceof PetFriendly){
                System.out.printf("%s : 반려동물 가능\n", r.address);
            }
        }

    }
}
