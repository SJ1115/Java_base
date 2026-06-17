package day09.P2;

import common.Base;

public class M2Inherit {

    static void main() {

        Base.step(2, "물려받은 기능");

        Song song = new Song("좋은 날", 215, "다 같이 후렴 떼창");
        Dance dance = new Dance("인트로 안무", 60, "웨이브");
        Talk talk = new Talk("오프닝 멘트", 30, "와 주셔서 고마워요");

        song.perform();

        System.out.printf("%s\n", song.info());

        Base.step("부모의 기능 자식이 확장");

        System.out.println(song.detail());
        System.out.println(dance.detail());
        System.out.println(talk.detail());

        Base.step("실습");

        VClip clip = new VClip("VCR 영상", 90, "데뷔부터 지금까지");

        System.out.println(clip.detail());



    }
}
