package day09.P2;

import common.Base;

import java.util.ArrayList;

public class M4UpCast {
    static void main() {
        Base.step("업캐스팅");

        Act song = new Song("좋은 날", 215, "다 같이 후렴 떼창");

        song.perform();

        Base.step("셋리스트 구성");

        ArrayList<Act> setlist = new ArrayList<>();
        setlist.add(new Song("좋은 날", 215, "다 같이 후렴 떼창"));
        setlist.add(new Dance("인트로 안무", 60, "웨이브"));
        setlist.add(new Talk("오프닝 멘트", 30, "와 주셔서 고마워요"));
        setlist.add(new Song("밤편지", 250, "잔잔하게 1절"));

        System.out.printf("셋리스트 동작 수 : %d\n", setlist.size());

        Base.step("공연 시작");

        for (Act a : setlist) {
            a.perform();
        }

        Base.step("앵콜 시작");

        for (Act a: setlist){
            if (a instanceof Song){
                System.out.printf("앵콜 후보 : %s\n", a);
            }
        }

        Base.step("실습");

        for (Act a: setlist){
            if (a instanceof Dance){
                System.out.printf("리허설 필요 : %s\n", a);
            }
        }

    }
}
