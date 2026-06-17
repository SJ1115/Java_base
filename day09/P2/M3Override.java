package day09.P2;

import common.Base;

public class M3Override {

    static void main() {
        Song song = new Song("좋은 날", 215, "다 같이 후렴 떼창");
        Dance dance = new Dance("인트로 안무", 60, "웨이브");
        Talk talk = new Talk("오프닝 멘트", 30, "와 주셔서 고마워요");

        Base.step("동작별 perform();");

        song.perform();
        dance.perform();
        talk.perform();

        Base.step("무대 카드");

        System.out.println(song);
        System.out.println(dance);
        System.out.println(talk);

        Base.step("실습");

        VClip clip = new VClip("VCR 영상", 90, "데뷔부터 지금까지");
        clip.perform();

        System.out.println(clip);

    }
}
